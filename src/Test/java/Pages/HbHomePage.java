package Pages;

import Driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HbHomePage extends BasePage {



    @FindBy(xpath ="//*[@class=\"searchBoxOld-M1esqHPyWSuRUjMCALPK\"]" )
    public WebElement searchBox ;

    @FindBy(xpath ="//*[@type=\"text\"]" )
    public WebElement searchBoxAfterClick ;

    @FindBy(xpath = "//*[@class=\"searchBoxOld-yDJzsIfi_S5gVgoapx6f\"]")
    public WebElement aramaIcon;

    String arama = "Erkek T-Shirt"+ "\n";

    public HbHomePage(WebDriver driver) {
        super(driver);
    }



    public void setSearchBoxAfterClick(String string) throws InterruptedException {
        Thread.sleep(1000);
        new Actions(super.driver)
                .sendKeys(string)
                .perform();
        Thread.sleep(1000);
    }


}