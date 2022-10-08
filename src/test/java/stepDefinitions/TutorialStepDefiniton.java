package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TutorialStepDefiniton {


    TutorialPage tutorialObje = new TutorialPage();
    List<String> telefonMarkalari2;
    List<String> list;


    @Given("kullanici web sitesine Tutorial sitesine gider")
    public void kullaniciWebSitesineTutorialSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialUrl"));
    }

    @Then("kullanici Phone & PDA tiklar")
    public void kullaniciPhonePDATiklar() {
        tutorialObje.phoneAndPda.click();
    }

    @Then("kullanici telefon markalarini alir")
    public void kullaniciTelefonMarkalariniAlir() {
        telefonMarkalari2 = new ArrayList<>();
        for (WebElement each : tutorialObje.telefonMarkalari) {
            telefonMarkalari2.add(each.getText());
        }
    }

    @And("tum ogeler sepete eklenir")
    public void tumOgelerSepeteEklenir() {
        for (int i = 0; i < tutorialObje.sepeteEkleButonlari.size(); i++) {
            tutorialObje.sepeteEkleButonlari.get(i).click();
        }
    }

    @And("kullanici sepete tiklar")
    public void kullaniciSepeteTiklar() {
        tutorialObje.sepetButonu.click();
        tutorialObje.sepetButonu2.click();
    }

    @And("sepetteki isimleri alir")
    public void sepettekiIsimleriAlir() {

        list = new ArrayList<>();

        for (WebElement each : tutorialObje.sepetTel) {
            list.add(each.getText());
        }

        list.forEach(System.out::println);

    }

    @And("sepetteki isimleri dogrular")
    public void sepettekiIsimleriDogrular() {
        Assert.assertTrue(list.contains(telefonMarkalari2));

        System.out.println("=====================");
    }
}