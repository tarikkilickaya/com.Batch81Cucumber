package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EditorDataBasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class EditorDataBaseStepDefinition {

    EditorDataBasePage editorDataBaseObje = new EditorDataBasePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorDataBaseObje.newButonu.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstName) {
        editorDataBaseObje.firstName.sendKeys(firstName);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastName) {
        actions.sendKeys(Keys.TAB, lastName).perform();
    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB, position).perform();
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofis) {
        actions.sendKeys(Keys.TAB, ofis).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB, extension).perform();
    }

    @And("startdate bolumune{string}  girer")
    public void startdateBolumuneGirer(String startdate) {
        actions.sendKeys(Keys.TAB, startdate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB, salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorDataBaseObje.createButonu.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        editorDataBaseObje.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(editorDataBaseObje.sonuc.getText().contains(isim));
    }
}