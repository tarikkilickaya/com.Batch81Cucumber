package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleTrendyolMorhipoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class GoogleTrendyolMorhipoStepDefinition {

    GoogleTrendyolMorhipoPage obje = new GoogleTrendyolMorhipoPage();

    String trendyolAramaSonucuYazisi;

    int trendyolUrunSayisi;

    int morhipoUrunSayisi;

    String trendyolHandle;

    String morhipoHandle;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @Given("kullanici googlea gider")
    public void kullaniciGoogleaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("trendyolu aratir")
    public void trendyoluAratir() {
        obje.googleAramaKutusu.sendKeys("trendyol", Keys.ENTER);
    }

    @And("trendyol linkini bulup siteye gider")
    public void trendyolLinkiniBulupSiteyeGider() throws InterruptedException {
        obje.trendyolLinki.click();
        trendyolHandle = Driver.getDriver().getWindowHandle();
    }

    @And("trendyolda makas aratir")
    public void trendyoldaMakasAratir() {
        obje.trendyolAramaKutusu.sendKeys("makas", Keys.ENTER);
    }

    @And("trendyolda toplam urun sayisini alir")
    public void trendyoldaToplamUrunSayisiniAlir() {
        trendyolAramaSonucuYazisi = obje.trendyolAramaSonucuYazisi.getText();
        String[] trendyolSonucSayisiArr = trendyolAramaSonucuYazisi.split(" ");
        trendyolUrunSayisi = Integer.parseInt(trendyolSonucSayisiArr[3]);
    }

    @And("yeni sekmede morhipoya gider")
    public void yeniSekmedeMorhipoyaGider() throws InterruptedException {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("morhipoUrl"));
        Thread.sleep(2000);
        morhipoHandle = Driver.getDriver().getWindowHandle();
    }

    @Then("morhipoda makas aratir")
    public void morhipodaMakasAratir() {
        obje.morhipoAramaKutusu.sendKeys("makas", Keys.ENTER);
    }

    @And("morhipoda toplam urun sayisini alir")
    public void morhipodaToplamUrunSayisiniAlir() {
        wait.until(ExpectedConditions.visibilityOf(obje.morhipoAramaSonucuSayisi));
        morhipoUrunSayisi = Integer.parseInt(obje.morhipoAramaSonucuSayisi.getText());
    }

    @And("iki sitedeki topla makas sayisini karsilastirir")
    public void ikiSitedekiToplaMakasSayisiniKarsilastirir() {
        if (morhipoUrunSayisi > trendyolUrunSayisi) {
            System.out.println("Morhipoda makas daha fazla");
        } else {
            System.out.println("Trendyolda makas daha fazla");
        }
    }

    @And("once urun sayisi fazla olan siteyi kapatir")
    public void onceUrunSayisiFazlaOlanSiteyiKapatir() {

        if (morhipoUrunSayisi > trendyolUrunSayisi) {
            Driver.getDriver().switchTo().window(morhipoHandle).close();
        } else {
            Driver.getDriver().switchTo().window(trendyolHandle).close();
        }
    }

   @And("sonra diger sayfayi kapatir")
   public void sonraDigerSayfayiKapatir() throws InterruptedException {
       Thread.sleep(2000);
       Driver.quitDriver();
   }
}