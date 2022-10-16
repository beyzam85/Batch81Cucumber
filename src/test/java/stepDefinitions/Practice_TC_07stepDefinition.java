package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07stepDefinition {
        PracticeTC07Page practiceTC07Page = new PracticeTC07Page();

        @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
        public void tarayıcıyıBaşlatarakUrlSineGidin(String istenenUrl) {
                Driver.getDriver().get(istenenUrl);

        }

        @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
        public void anaSayfanınBaşarıylaGörünürOlduğunuDoğrulayın() {
                String homeUrl ="https://automationexercise.com/";
                Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
        }

        @And("Test Case buttonu na tıklayın")
        public void testCaseButtonuNaTıklayın() {
                practiceTC07Page.testCaseLink.click();

        }

        @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
        public void kullanıcınınTestCaseSayfasınaBaşarıylaYönlendirildiğiniDoğrulayın() {
          Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
        }

        @And("İlgili sayfanın ekran görüntüsünü alın")
        public void i̇lgiliSayfanınEkranGörüntüsünüAlın() {
                try {
                        ReusableMethods.getScreenshot("automationexecises_testcasepage");
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
}