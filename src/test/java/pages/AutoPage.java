package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {
    public AutoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='login']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='email_create']")
    public WebElement email;

    @FindBy(xpath = "//*[@class='icon-user left']")
    public WebElement createAnAccount;


    @FindBy(xpath = "//*[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy (xpath = "//*[@id='uniform-id_gender1']")
    public WebElement radioButton;

    @FindBy(xpath = "(//*[text()='My account'])[2]")
    public WebElement myAccountText;




















































}