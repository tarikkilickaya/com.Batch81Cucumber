package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuAppPage {
    public HerOkuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addButonu;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public WebElement deleteButonu;

    @FindBy(xpath = "//*[text()='Add/Remove Elements']")
    public WebElement addRemoveElements;

    @FindBy(xpath = "//*[@id='button']")
    public WebElement clickMe;

    @FindBy(xpath = "//*[text()=' down 32']")
    public List<WebElement> down32;

    @FindBy(xpath = "//*[text()='click']")
    public List<WebElement> clickText;



















}