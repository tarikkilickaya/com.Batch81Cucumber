@parametre
Feature: US002 Parametre Kullanimi

  Background: Ortak adim
    Given kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder


  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici "selenium" icin arama yapar
    And sonuclarin "selenium" icerdigini test eder


  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder


  Scenario: TC04 Kullanici amazonda parametreli arama yapar

    Then kullanici "SQL" icin arama yapar
    And sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir

     # Feature dosyasında parametreli arama yaptığımızda "" (tırnak) içine aldığımız String değeri stepDefinition'da
     # bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde tekrar method oluşturmadan feature dosyasından
     # "" (tırnak) içinde belirttiğimiz String değeri değiştirmemiz yeterli olacaktır. Böylece kodlarımız dinamik olacaktır.