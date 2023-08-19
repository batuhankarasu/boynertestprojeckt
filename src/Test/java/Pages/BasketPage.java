package Pages;

import Driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage extends BasePage {

    String basketProductName;

    @FindBy(xpath="//div[@class=\"product_name_2Klj3\"]/a")
    public WebElement productBasketName;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    //Sepetteki ürünün adını alır
    public String GetBasketProductTitle(){
        waitElement(productBasketName);
        basketProductName = productBasketName.getText();
        return basketProductName;
    }
















}
