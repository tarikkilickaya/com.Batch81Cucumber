package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoGuruStepDefinition {

    DemoPage obje = new DemoPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @When("kullanici Alerts butonuna tiklar")
    public void kullaniciAlertsButonunaTiklar() {
        obje.alerts.click();
    }

    @And("kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasar() {
        obje.onButtonClick.click();
    }

    @And("kullanici Allertin gorunur olmasini bekler")
    public void kullaniciAllertinGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEder() {
        String expectedText = "This alert appeared after 5 seconds";
        String actualText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("kullanici Ok diyerek alerti kapatin")
    public void kullaniciOkDiyerekAlertiKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("kullanici Will enable bes seconds butonunun enable olmasini bekler")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekler() {
        wait.until(ExpectedConditions.elementToBeClickable(obje.willEnable));
    }

    @And("kullanici Will enable bes seconds butonunun enable oldugunu test eder")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(obje.willEnable.isEnabled());
    }

    @Then("Visible After bes seconds butonunun gorunur olmasini bekler")
    public void visibleAfterBesSecondsButonununGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(obje.visibilityAfter));
    }

    @And("Visible After bes seconds butonunun gorunur oldugunu test eder")
    public void visibleAfterBesSecondsButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(obje.visibilityAfter.isDisplayed());
    }
}
