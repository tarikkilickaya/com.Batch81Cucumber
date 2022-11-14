Feature: US17 Class Work

  Scenario: TC01 alerts and explicitly wait
    Given kullanici "demoUrl" adresine gider
    When  kullanici Alerts butonuna tiklar
    And kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And kullanici Allertin gorunur olmasini bekler
    And kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    And kullanici Ok diyerek alerti kapatin