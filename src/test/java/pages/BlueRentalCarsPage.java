package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement emailAdres;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement login2;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement oturumAcildi;
}