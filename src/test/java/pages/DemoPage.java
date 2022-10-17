package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Alerts']")
    public WebElement alerts;

    @FindBy(xpath = "//*[@id='timerAlertButton']")
    public WebElement onButtonClick;












}