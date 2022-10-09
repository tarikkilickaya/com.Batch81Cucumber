package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleTrendyolMorhipoPage {
    public GoogleTrendyolMorhipoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement googleAramaKutusu;

    @FindBy(xpath = "(//*[text()='https://www.trendyol.com'])[1]")
    public WebElement trendyolLinki;

    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolAramaKutusu;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement trendyolAramaSonucuYazisi;

    @FindBy(xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoAramaKutusu;

    @FindBy(xpath = "//*[@id='total-product-count']")
    public WebElement morhipoAramaSonucuSayisi;


}