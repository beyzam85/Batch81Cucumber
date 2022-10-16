package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
            PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brclogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement userEmail;

    @FindBy (xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public WebElement userPassword;

    @FindBy (xpath = " //button[@class='btn btn-primary']")
    public WebElement ikinciLoginYazisi;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginYazisi;

    @FindBy (css = "input[id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy (css = "input[id='formBasicPassword']")
    public WebElement passwordTextBox;

}
