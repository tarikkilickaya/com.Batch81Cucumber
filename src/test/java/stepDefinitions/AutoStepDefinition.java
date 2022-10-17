package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;

public class AutoStepDefinition {
    AutoPage auto = new AutoPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
        auto.signIn.click();
    }

    @And("kullanici Create and account bolumune email adresi girer")
    public void kullaniciCreateAndAccountBolumuneEmailAdresiGirer() {
        auto.email.sendKeys(faker.internet().emailAddress());
    }

    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
        auto.radioButton.click();
        action.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys("1").
                sendKeys(Keys.TAB).sendKeys("June").sendKeys(Keys.TAB).sendKeys("1982").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("kansa").sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).
                sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).perform();
    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @Then("kullanicinin hesap olusturdugunu dogrulayin")
    public void kullanicininHesapOlusturdugunuDogrulayin() {
        Assert.assertTrue(auto.myAccountText.isDisplayed());
    }
}