Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |

         # TestNG'deki dataProvider kullanımındaki gibi Cucumber'da da Scenario Outline kullanırız.
        # Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.
       # Feature dosyasında yazdığımız komutta eğer tırnak içinde kullanırsak stepDefinitionda
      # parametreli  bir method oluşturur. Ve artık stepDefinition'ı kullanmadan feature dosyasında
     # tırnak içindeki String ifadeyi değiştirerek istediğimiz kelimeyi aratabiliriz.
    # Scenarip Outline'da ise yine tırnak içinde birden fazla kelime aratacaksak "<>" şeklindeki
   # kullanım ile "<>" içine yazdığımız herhangi bir kelimeyi Scenario Outline'ın aşağıda oluşturduğu Examples altında
  # aratmak istediğimiz kelimeleri yazıp sırasıyla aratabiliriz.