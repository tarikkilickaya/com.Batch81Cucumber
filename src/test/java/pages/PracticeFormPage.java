package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeFormPage {

    public PracticeFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='comments']")
    public WebElement textArea;

    @FindBy(xpath = "//*[@name='filename']")
    public WebElement chooseFile;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//*[@type='checkbox'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement radioButton2;

    @FindBy(xpath = "//*[@value='ms3']")
    public WebElement selectionItem3;

    @FindBy(xpath = "//*[@name='dropdown']")
    public WebElement dropDown;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='_valuefilename']")
    public WebElement fileName;


















}