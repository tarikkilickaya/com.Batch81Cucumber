package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;

import java.util.List;

public class DemoGuruStepDefinition {

    DemoGuruPage demoGuruObje = new DemoGuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i < demoGuruObje.basliklar.size(); i++) {
            if (demoGuruObje.basliklar.get(i).getText().equals(baslik)) {
                index = i + 1;
                List<WebElement> sutunElement = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + index + "]"));
                sutunElement.forEach(t -> System.out.println(t.getText()));
            }
        }
    }
}