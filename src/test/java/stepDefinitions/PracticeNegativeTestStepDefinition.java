package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeNegativeTestPage;
import utilities.Driver;

import java.time.Duration;

public class PracticeNegativeTestStepDefinition {

    PracticeNegativeTestPage obje = new PracticeNegativeTestPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @When("kullanici login olmak icin signine tiklar")
    public void kullaniciLoginOlmakIcinSignineTiklar() {
        obje.signinSymbol.click();
        obje.signin.click();
    }

    @And("kullanici username icin {string} kullanici adini gonderir")
    public void kullaniciUsernameIcinKullaniciAdiniGonderir(String username) {
        obje.username.sendKeys(username);
    }

    @And("kullanici password icin {string} parolasini gonderir")
    public void kullaniciPasswordIcinParolasiniGonderir(String password) {
        obje.password.sendKeys(password);
    }

    @And("kullanici signine tiklar")
    public void kullaniciSignineTiklar() {
        obje.signin2.click();
    }

    @Then("kullanici Authentication information not correct uyarisini dogrular")
    public void kullaniciAuthenticationInformationNotCorrectUyarisiniDogrular() {
        wait.until(ExpectedConditions.visibilityOf(obje.alert));
        Assert.assertTrue(obje.alert.isDisplayed());
    }
}