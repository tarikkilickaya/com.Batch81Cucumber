@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda nutella aratir


    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder

  Scenario: TC02 Kullanici amazonda Selenium aratir


    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder

  Scenario: TC03 Kullanici amazonda iphone aratir


    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir