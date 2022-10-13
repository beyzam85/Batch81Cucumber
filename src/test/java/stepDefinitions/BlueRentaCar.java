package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class BlueRentaCar {
    BrcPage brcPage =new BrcPage();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();


    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys("gecersiz@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB,ConfigReader.getProperty("hatalisifre")).perform();

    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.ikinciLogin.click();

    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.quitDriver();
    }
}