package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDefinition {

    PracticeFormPage obje = new PracticeFormPage();

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {

        username = Faker.instance().name().username();
        password = Faker.instance().internet().password();
        password = Faker.instance().animal().name();

        obje.username.sendKeys(username);
        obje.password.sendKeys(password);
        obje.textArea.clear();
        obje.textArea.sendKeys(textarea);
    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
        String homeDirectory = System.getProperty("user.home");
        String filePath = homeDirectory + "/Desktop/a.png";
        obje.chooseFile.sendKeys(filePath);
    }

    @And("checkbox1i secer")
    public void checkbox1_iSecer() {
        if (!obje.checkBox1.isSelected()) {
            obje.checkBox1.click();
        }

        if (obje.checkBox2.isSelected()) {
            obje.checkBox2.click();
        }

        if (obje.checkBox3.isSelected()) {
            obje.checkBox3.click();
        }
    }

    @And("radio2yi secer")
    public void radio2_yiSecer() {
        obje.radioButton2.click();
    }

    @And("selection item3u secer")
    public void selectionItem3_USecer() {
        obje.selectionItem3.click();
    }

    @And("dropdown itmem4u secer")
    public void dropdownItmem4_USecer() {
        Select select = new Select(obje.dropDown);
        Random random = new Random();
        int rastgele = random.nextInt(select.getOptions().size() - 1);
        select.selectByIndex(rastgele);
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        obje.submit.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(obje.fileName.isDisplayed());
    }
}
