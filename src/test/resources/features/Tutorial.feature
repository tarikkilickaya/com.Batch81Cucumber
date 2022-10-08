Feature: Phone and PDA

  Scenario: Kullanici web sitesinde Phone aratir
    Given kullanici web sitesine Tutorial sitesine gider
    Then kullanici Phone & PDA tiklar
    Then kullanici telefon markalarini alir
    And tum ogeler sepete eklenir
    And kullanici sepete tiklar
    And sepetteki isimleri alir
    And sepetteki isimleri dogrular