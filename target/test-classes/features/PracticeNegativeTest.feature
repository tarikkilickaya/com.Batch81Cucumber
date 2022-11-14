
Feature: medunna login negative test
  Scenario Outline: Negative login test

    Given kullanici "medunnaUrl" sayfasina gider
    When kullanici login olmak icin signine tiklar
    And kullanici username icin "<username>" kullanici adini gonderir
    And kullanici password icin "<password>" parolasini gonderir
    And kullanici signine tiklar
    Then kullanici Authentication information not correct uyarisini dogrular
    Examples:
      | username | password |
      | username | password |