@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder

  @gp3
  Scenario: TC02 kullanici amazonda Selenium aratir

    Given kullanici amazon sayfasina gider
    Then kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder

  @gp2
  Scenario: TC03 kullanici amazonda iphone aratir

    Given kullanici amazon sayfasina gider
    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir