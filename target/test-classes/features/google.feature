Feature: Google Trendyol Morhipo

  Scenario: Kullanici googledan trendyola oradan da morhipoya gider
    Given kullanici googlea gider
    And trendyolu aratir
    And trendyol linkini bulup siteye gider
    Then makas aratir
    Then toplam urun sayisini alir
    And yeni sekmede morhipo'ya gider
    Then morhipoda makas aratir
    Then morhipoda toplam urun sayisini alir
    And iki sitedeki toplam makas sayisini karsilastirir
    And once urun sayisi fazla olan siteyi kapatir
    And Sonra diger sayfayi kapatir
