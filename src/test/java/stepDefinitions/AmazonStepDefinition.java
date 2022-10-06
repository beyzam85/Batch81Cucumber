package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

import javax.swing.*;

public class AmazonStepDefinition {
    @Given("kullanıcı amazon sayfasına gider")
    public void kullanıcıAmazonSayfasınaGider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("Kullanıcı nutella aratır")
    public void kullanıcıNutellaAratır() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @And("Sonucların nutella icerdiğini test edin")
    public void sonuclarınNutellaIcerdiğiniTestEdin() {
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
    }



}
