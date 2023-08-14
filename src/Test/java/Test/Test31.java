package Test;

import Driver.DriverMethods;
import Pages.HbHomePage;
import Pages.MaleTshirtPage;
import org.testng.annotations.Test;

public class Test31 extends DriverMethods {

    static String arama = "Erkek T-Shirt"+ "\n";

    HbHomePage homePage = new HbHomePage();
    MaleTshirtPage tshirtPage = new MaleTshirtPage();



    @Test
    public void Test1() throws InterruptedException {


        Thread.sleep(5000);
        homePage.Searchbox.click();
        homePage.Searchboxtextbox.sendKeys(arama);
        tshirtPage.RandomProduct();



    }

}
