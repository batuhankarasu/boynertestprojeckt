package Test;

import Driver.BasePage;
import Driver.DriverMethods;
import Pages.BasketPage;
import Pages.HbHomePage;
import Pages.MaleTshirtPage;
import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 extends DriverMethods {

    String arama = "Erkek T-Shirt"+ "\n";

    @Test
    public void Test1() throws InterruptedException {
        HbHomePage homePage = new HbHomePage(driver);
        MaleTshirtPage maleTshirtPage = new MaleTshirtPage(driver);
        BasketPage basketPage = new BasketPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.webElementClick(homePage.searchBox);
        homePage.setSearchBoxAfterClick("Erkek T-shirt");
        homePage.webElementClick(homePage.aramaIcon);
        maleTshirtPage.webElementClick(maleTshirtPage.RandomProduct());
        maleTshirtPage.WindowChange(1);
        String befortitle = productPage.GetProductTitle();
        productPage.webElementClick(productPage.addToBasketButton);
        productPage.webElementClick(productPage.pruductPagePopupClose);
        productPage.webElementClick(productPage.goToBasketIcon);
        String afterDeger = basketPage.GetBasketProductTitle();
        maleTshirtPage.BasketProductVerify(befortitle, afterDeger);






    }

}
