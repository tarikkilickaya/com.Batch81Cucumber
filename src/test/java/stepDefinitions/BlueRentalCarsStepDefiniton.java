package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class BlueRentalCarsStepDefiniton {

    BlueRentalCarsPage blueRentalCarsObje = new BlueRentalCarsPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarsUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentalCarsObje.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentalCarsObje.emailAdres.sendKeys(ConfigReader.getProperty("blueRentalCarsWrongEmail"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentalCarsObje.password.sendKeys(ConfigReader.getProperty("blueRentalCarsWrongPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentalCarsObje.login2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        wait.until(ExpectedConditions.visibilityOf(blueRentalCarsObje.oturumAcilamadi));
        Assert.assertTrue(blueRentalCarsObje.oturumAcilamadi.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.quitDriver();
    }
}