package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SenaryoOutlinePage;
import utilities.ConfigReader;
import utilities.Driver;

public class SenaryoOutlineStepDefinition {
    SenaryoOutlinePage senaryoOutlinePage = new SenaryoOutlinePage()
    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenurl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenurl));

    }

    @And("{string} username girer")
    public void usernameGirer(String arg0) {
        senaryoOutlinePage.loginYazisi.click();
    }

    @And("{string} password girer")
    public void passwordGirer(String arg0) {
        senaryoOutlinePage.loginYazisi.click();
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        senaryoOutlinePage.emailTextBox.sendKeys();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
    }
}
