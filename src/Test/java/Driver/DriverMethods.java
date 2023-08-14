package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


import java.net.URL;
import java.sql.Driver;

public class DriverMethods {

    static  WebDriver driver = new ChromeDriver();
    @BeforeTest
    public WebDriver getDriver(){
        if (driver==null){
            driver.get("https://www.hepsiburada.com/");
        }
        driver.manage().window().maximize();

        return driver;
    }


    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }

}
