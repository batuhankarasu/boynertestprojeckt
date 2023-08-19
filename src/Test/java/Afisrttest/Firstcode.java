package Afisrttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class Firstcode {
    static String expectedText = "Erkek T-Shirt & Atlet";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//driver kurdu
        driver.get("https://www.hepsiburada.com/");//sayfaya gitti
        System.out.println("site açıldı");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@class='searchBoxOld-M1esqHPyWSuRUjMCALPK']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@role=\"combobox\"]/*[@type='text']")).sendKeys("Erkek T-Shirt" + "\n" );
        System.out.println("yazdı");


        List<WebElement> elements = driver.findElements(By.cssSelector("#\\31  "));
        int numberOfElements = elements.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(numberOfElements);
        Thread.sleep(5000);

        driver.findElement(By.id("i"+randomIndex)).click();


    }
}