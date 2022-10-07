package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonObje = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonObje.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime = "Nutella";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonObje.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime = "Selenium";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }

    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonObje.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }
}