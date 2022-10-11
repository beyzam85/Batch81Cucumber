package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SauceDemoPages;
import utilities.ConfigReader;
import utilities.Driver;

public class SauceDemoStepDefinition {
    SauceDemoPages sauceDemoPages = new SauceDemoPages();

    @Given("Sauce sitesine girer")
    public void sauceSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));
    }

    @Then("kullanici adi ve sifre girilir")
    public void kullaniciAdiVeSifreGirilir() {
         sauceDemoPages.userName.sendKeys(ConfigReader.getProperty("userNameSauce"),
                 Keys.TAB,
                 ConfigReader.getProperty("passwordSauce"),
                 Keys.ENTER);
    }

    @And("Dogru giris yaptigi kontrol eder")
    public void dogruGirisYaptigiKontrolEder() {
     Assert.assertTrue(sauceDemoPages.logo.isDisplayed());
    }

    @And("Yanlıs giris yaptigi kontrol eder")
    public void yanlısGirisYaptigiKontrolEder() {
        Assert.assertTrue(sauceDemoPages.eror.isDisplayed());

    }

    @Then("kullanici adi ve yanlıs sifre girilir")
    public void kullaniciAdiVeYanlısSifreGirilir() {
        sauceDemoPages.userName.sendKeys(ConfigReader.getProperty("userNameSauce"),
                Keys.TAB,
                ConfigReader.getProperty("WrongPasswordSauce"),
                Keys.ENTER);

    }

    @Then("Yanlis kullanici adi ve yanlıs sifre girilir")
    public void yanlisKullaniciAdiVeYanlısSifreGirilir() {
        sauceDemoPages.userName.sendKeys(ConfigReader.getProperty("WrongUserNameSauce"),
                Keys.TAB,
                ConfigReader.getProperty("WrongPasswordSauce"),
                Keys.ENTER);

    }
}
