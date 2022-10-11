package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolMorhipoPage {
    public TrendyolMorhipoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='gLFyf gsfi']")
    public WebElement googleSearchBox;

    @FindBy (xpath = "(//*[@class='LC20lb MBeuO DKV0Md'])[1]")
    public WebElement trendyolFirstLink;

    @FindBy (xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement trendyolCokieAccept;

    @FindBy (xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolSearchBox;

    @FindBy (xpath = "//*[@class='dscrptn']")
    public WebElement trendyolMakasResult;

    @FindBy(xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoSearchBox;

    @FindBy(xpath = "//*[@id='total-product-count']")
    public WebElement morhipoMakasResult;


}
