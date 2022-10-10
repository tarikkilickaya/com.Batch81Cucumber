Feature: Parametre Kullanimi

  @gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "facebookUrl" sayfasina gider
    When url'nin  "facebook" icerdigini test edelim
    And sayfayi kapatir

  @gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "googleUrl" sayfasina gider
    When url'nin  "google" icerdigini test edelim
    And sayfayi kapatir

  @gp1
  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "blueRentalCarsUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin  "blue" icerdigini test edelim
    And sayfayi kapatir

  @gp1
  Scenario: TC04 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    When url'nin  "amazon" icerdigini test edelim
    And sayfayi kapatir