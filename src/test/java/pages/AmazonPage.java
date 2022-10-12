package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() { // Constructor oluşturup public yapmamız gerekir.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucu;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement helloSignin;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//*[@id='continue'])[1]")
    public WebElement continueButonu;

    @FindBy(xpath = "//*[.='There was a problem']")
    public WebElement problemMesaji;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgot;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[@class='a-spacing-small']")
    public WebElement createAccountYazisi;




}