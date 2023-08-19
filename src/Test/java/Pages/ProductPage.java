package Pages;

import Driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ProductPage extends BasePage {
    public String expectedProductName;

    @FindBy(xpath = "//h1[@class=\"product-name best-price-trick\"]")
    public WebElement productPageName;

    @FindBy(id="addToCart")
    public WebElement addToBasketButton;

    @FindBy(xpath="//*[@id=\"shoppingCart\"]")
    public WebElement goToBasketIcon;

    @FindBy(xpath = "//a[@class=\"checkoutui-Modal-iHhyy79iR28NvF33vKJb\"]")
    public WebElement pruductPagePopupClose;

    public ProductPage(WebDriver driver) {
        super(driver);
    }



    //Ürün sayfasındaki ürün adını alır
    public String GetProductTitle() throws InterruptedException {
        expectedProductName = productPageName.getText();
        return expectedProductName;
    }

}
