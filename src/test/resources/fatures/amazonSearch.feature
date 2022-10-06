Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder
    And Sayfayi kapatir