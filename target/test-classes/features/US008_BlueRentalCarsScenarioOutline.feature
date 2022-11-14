Feature: : US008 Scenario Outline Kullanimi

  @BRC
  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "blueRentalCarsUrl" anasayfasina gider
    Then login yazisina tiklar
    And "<gecersizEmail>" username girer
    And "<gecersizPassword>" password girer
    And brc Login butonuna basar
    Then brc sayfasina giris yapilamadigini kontrol eder
    And kullanici 3 saniye bekler
    And  sayfayi kapatir

    Examples: :
  | gecersizEmail   | gecersizPassword |
  |a@gmail.com      |    12346|
  |b@gmail.com      |    13246|
  |c@gmail.com      |    78974|
  |d@gmail.com      |    78564|
  |e@gmail.com      |    41454|