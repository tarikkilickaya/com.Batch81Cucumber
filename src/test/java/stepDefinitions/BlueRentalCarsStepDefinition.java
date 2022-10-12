package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentalCarsStepDefinition {

    BlueRentalCarsPage blueRentalCarsObje = new BlueRentalCarsPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentalCarsObje.login.click();
    }

    @And("{string} username girer")
    public void usernameGirer(String gecersizEmail) {
        blueRentalCarsObje.emailAdres.sendKeys(ConfigReader.getProperty(gecersizEmail));
    }

    @And("{string} password girer")
    public void passwordGirer(String gecersizPassword) {
        blueRentalCarsObje.password.sendKeys(ConfigReader.getProperty(gecersizPassword));
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        blueRentalCarsObje.login2.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentalCarsObje.oturumAcilamadi.isDisplayed());
    }
}