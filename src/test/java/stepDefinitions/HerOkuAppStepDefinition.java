package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerOkuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerOkuAppStepDefinition {

    HerOkuAppPage herOkuAppObje = new HerOkuAppPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herOkuAppObje.addButonu.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        wait.until(ExpectedConditions.visibilityOf(herOkuAppObje.deleteButonu));
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herOkuAppObje.deleteButonu.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herOkuAppObje.deleteButonu.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        assert !herOkuAppObje.deleteButonu.isDisplayed();
        Assert.assertFalse(herOkuAppObje.deleteButonu.isDisplayed());
    }

    @And("AddRemove Elements yazisinin gorundugunu test edin")
    public void addremoveElementsYazisininGorundugunuTestEdin() {
        assert herOkuAppObje.addRemoveElements.getText().equals("Add/Remove Elements");
    }
}