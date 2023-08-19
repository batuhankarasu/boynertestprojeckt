package Pages;

import Driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class MaleTshirtPage extends BasePage {

    public MaleTshirtPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[contains(@class,'productListContent')]")
    public List<WebElement> productarea ;

    //Rastgele ürüne tıklayan metot
    public WebElement RandomProduct() throws InterruptedException {
        List<WebElement> productElements = productarea;
        int numberOfElements = productElements.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(numberOfElements);
        WebElement selectedProduct = productElements.get(randomIndex);
        Thread.sleep(3000);
        return selectedProduct;
    }

    //Sepetteki ve ürün sayfasındaki ürünlerin isimlerini karşılaştırır
    public void BasketProductVerify(String beforDeger, String afterDdeger){
        BasketPage basketPage = new BasketPage(driver);
        ProductPage productPage = new ProductPage(driver);
        try {
            String basketTitle = basketPage.GetBasketProductTitle();
            if((!productPage.expectedProductName.equals(basketTitle))){
                System.exit(1);
            }

        }catch (Exception e){
            System.out.println("seçilen ürün ve eklenen ürün aynı değil.");

        }

    }




    /*
        List<WebElement> productElements = productarea;
        int numberOfElements = productElements.size();
        Random random = new Random();
        int randomIndex = random.nextInt(numberOfElements);
        WebElement selectedProduct = productElements.get(randomIndex);
        webElementClick(selectedProduct);
 */

}