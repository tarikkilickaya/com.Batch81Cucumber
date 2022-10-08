package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {
    public TutorialPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phoneAndPda;


    @FindBy(xpath = "//h4")
    public List<WebElement> telefonMarkalari;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> sepeteEkleButonlari;

    @FindBy(xpath = "//*[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepetButonu;

    @FindBy(xpath = "//*[text()=' View Cart']")
    public WebElement sepetButonu2;

    @FindBy(xpath = "(//*[@class='table table-bordered'])[2]//tbody//td[2]")
    public List<WebElement> sepetTel;


}