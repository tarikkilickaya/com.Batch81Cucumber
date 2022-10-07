package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Background", // İki tagı aynı anda çalıştırmak istersek or kullanırız.
        dryRun = false
)

public class Runner {
    /*
    Runner classı TestNG'deki xml mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tagları çalıştırır. XML'deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class bodysi boştur ve Runner classını ekleyeceğimiz notasyonlar aktive eder.

    Bu classta kullanacağımız 2 adet notasyon vardır:
    1) @RunWith(Cucumber.class) notasyonu Runner classına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkümüzde JUnit kullanmayı tercih ederiz.

    2) @CucumberOptions notasyonu içinde
    features : Runner dosyasının feature dosyasına nereden bulacağını tarif eder.
    glue : stepDefinitons yolunu belirtiriz.
    tags : Hangi tagı çalıştırmak istiyorsak onu belli eder.

    dryRun : İki seçenek vardır
    dryRun = true dersek testimizi çalıştırmadan eksik adımları bize verir.
    dryRun = false dersek testlerimizi driver ile çalıştırır.
     */

}