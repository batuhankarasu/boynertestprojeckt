package Pages;

import Driver.DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;
public class HbHomePage {

    DriverMethods driver = new DriverMethods();


    @FindBy(xpath ="//*[@class='searchBoxOld-M1esqHPyWSuRUjMCALPK']" )
    public WebElement Searchbox ;

    @FindBy(xpath ="//div[@role=\"combobox\"]/*[@type='text']" )
    public WebElement Searchboxtextbox ;






}