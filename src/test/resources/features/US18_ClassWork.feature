Feature: US18 Class Work

  Scenario: explicitly wait
    Given kullanici "demoqaUrl" adresine gider
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test eder