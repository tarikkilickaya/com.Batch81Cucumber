Feature: US19

  Scenario: explicitly wait
    Given kullanici "demoqaUrl" adresine gider
    Then Visible After bes seconds butonunun gorunur olmasini bekler
    And Visible After bes seconds butonunun gorunur oldugunu test eder
