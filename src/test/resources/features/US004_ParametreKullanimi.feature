Feature: US004 Parametre kullanimi
  @gp5
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When url'nin  "trend" icerdigini test edelim
    And sayfayi kapatir