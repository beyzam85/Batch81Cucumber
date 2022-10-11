package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPages {
    public SauceDemoPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@data-test='error']")
    public WebElement eror;


    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='app_logo']")
    public WebElement logo;
}
