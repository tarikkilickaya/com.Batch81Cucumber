package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HerOkuAppPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefiniton {

    HerOkuAppPage herOkuObje = new HerOkuAppPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32Toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
        Driver.getDriver().get(url);
    }

    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer int1) {
        for (int i = 0; i < int1; i++) {
            herOkuObje.clickMe.click();
        }
    }

    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer int1) {
        for (int i = 0; i < int1; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<WebElement> down32 = herOkuObje.down32;
        for (WebElement each : down32) {
            down32Toplam += Integer.valueOf(each.getText().replaceAll("[^0-9]", ""));
        }
        System.out.println("down32 toplamı : " + down32Toplam);
    }

    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        List<WebElement> clickText = herOkuObje.clickText;
        for (WebElement each : clickText) {
            clickTextToplam += each.getText().length();
        }
        System.out.println("Tüm click metinlerinin uzunluğu : " + clickTextToplam);
        sonuc = down32Toplam - clickTextToplam;
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(Integer int1) {
        Assert.assertTrue(sonuc == int1);
    }
}