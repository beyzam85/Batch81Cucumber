package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import pages.TrendyolMorhipoPage;
import utilities.Driver;

public class TrendyolMorhipoStepDefinitions {
    TrendyolMorhipoPage trendyolMorhipoPage=new TrendyolMorhipoPage();//Burada obje olusturduk çünkü TrenyolMorhipoPage Classındaki
    // WebElementlere kolaylıkla erişbilmek ve her defasında tekrar tekrar WebElement oluşturmamak için

    int morhipoAramaSonucu;
    int trendyolAramaSonucu;
    String trendYolHandle;
    String morhipoHandle;

    @Given("www.google.com adresine gider")
    public void wwwGoogleComAdresineGider() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @Then("googleda trendyol aratir")
    public void googledaTrendyolAratir() {


       trendyolMorhipoPage.googleSearchBox.sendKeys("Trenyol",Keys.ENTER);//oluşturulan obje ile webelement burada çağırıldı
    }

    @And("trendyol linkini bulup siteye gider")
    public void trendyolLinkiniBulupSiteyeGider() {
        trendyolMorhipoPage.trendyolFirstLink.click();
        trendYolHandle=Driver.getDriver().getWindowHandle();
    }

    @Then("Trendyol'da makas aratir")
    public void trendyolDaMakasAratir() {
        trendyolMorhipoPage.trendyolSearchBox.sendKeys("makas",Keys.ENTER);
    }

    @And("Trendyol'da bulunan toplam urun sayisini kaydeder")
    public void trendyolDaBulunanToplamUrunSayisiniKaydeder() {
        String temp;
        temp = trendyolMorhipoPage.trendyolMakasResult.getText().replaceAll("\\D","");
        System.out.println(temp);
         trendyolAramaSonucu = Integer.parseInt(temp);
    }

    @Then("Ayni browser'da yeni sekmede www.morhipo.com adresine gider")
    public void ayniBrowserDaYeniSekmedeWwwMorhipoComAdresineGider() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);//yeni sekmede acmak için kullanilir
        Driver.getDriver().get("https://www.morhipo.com/");
        morhipoHandle = Driver.getDriver().getWindowHandle();
    }

    @Then("morhipo'da makas aratir")
    public void morhipoDaMakasAratir() {
    trendyolMorhipoPage.morhipoSearchBox.sendKeys("makas",Keys.ENTER);
    }
    @And("Morhpo'da bulunan toplam urun sayisini kaydeder")
    public void morhpoDaBulunanToplamUrunSayisiniKaydeder() {
        morhipoAramaSonucu= Integer.parseInt(trendyolMorhipoPage.morhipoMakasResult.getText());
    }

    @And("iki sitedeki toplam makas sayisini karsilastirir")
    public void ikiSitedekiToplamMakasSayisiniKarsilastirir() {
    }

    @And("Once urun sayisi fazla olan sekmeyikapatir")
    public void onceUrunSayisiFazlaOlanSekmeyikapatir() {
        String temp = trendyolMorhipoPage.morhipoMakasResult.getText();
        morhipoAramaSonucu = Integer.parseInt(temp);
        if (trendyolAramaSonucu>morhipoAramaSonucu) {
            Driver.getDriver().switchTo().window(trendYolHandle).close();
        }
        else Driver.getDriver().switchTo().window(morhipoHandle).close();
    }

    @Then("Sonra diger sekmeyi kapatir")
    public void sonraDigerSekmeyiKapatir() {
        Driver.quitDriver();

    }



}
