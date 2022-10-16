package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class OdevBRCStepDefinition {
    BrcPage brcPage=new BrcPage();
    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenAdres) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenAdres));
    }

    @And("{string} username girer")
    public void usernameGirer(String userEmail) {
        brcPage.userEmail.sendKeys(userEmail);

    }

    @And("{string} password girer")
    public void passwordGirer(String userPassword) {
        brcPage.userPassword.sendKeys(userPassword);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        brcPage.ikinciLogin.click();


    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
