
Feature: US014 Class Work
  Scenario: Kullanici ve Url Testi
    Given kullanici "webDriverUniversityUrl" adresine gider
    When kullanici 1 saniye bekler
    Then kullanici Login Portala kadar asagi iner
    When kullanici 1 saniye bekler
    And kullanici Login Portala tiklar
    When kullanici 1 saniye bekler
    And kullanici diger windowa gecer
    When kullanici 1 saniye bekler
    And kullanici "username" kutusuna bilgileri girer
    When kullanici 1 saniye bekler
    And kullanici "password" bolumune bilgileri girer
    When kullanici 1 saniye bekler
    And kullanici login butonuna basar
    When kullanici 1 saniye bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    When kullanici 1 saniye bekler
    And kullanici Ok diyerek Popup'i kapatir
    When kullanici 1 saniye bekler
    And kullanici ilk sayfaya geri doner
    When kullanici 1 saniye bekler
    And kullanici ilk sayfaya donuldugunu test eder
    When kullanici 1 saniye bekler
    And sayfayi kapatir