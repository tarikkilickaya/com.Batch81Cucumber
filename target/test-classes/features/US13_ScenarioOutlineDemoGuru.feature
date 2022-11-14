Feature: US013 Class Work
  @guru
 Scenario Outline: TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    When kullanici "demoGuruUrl" adresine gider
    And "<basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | basliklar |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Close (Rs) |
      | % Change |

    Scenario: Kullanici sayfayi kapatir
      Given sayfayi kapatir