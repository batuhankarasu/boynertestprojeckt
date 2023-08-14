package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class MaleTshirtPage {
    WebDriver driver = new ChromeDriver();

    public int ProductPage(List<WebElement> productarea) {
        PageFactory.initElements(driver, this);

        return 0;
    }


    @FindBy(css = "#\\31  ")
    public List<WebElement> productarea ;

//Rastgele ürüne tıklayan metot
    public void RandomProduct(){

        int numberOfElements = ProductPage(productarea);
        Random rand = new Random();
        int randomIndex = rand.nextInt(numberOfElements);
        driver.findElement(By.id("i"+numberOfElements)).click();

    }










}

