Feature: US1009 Ck Hotels Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir