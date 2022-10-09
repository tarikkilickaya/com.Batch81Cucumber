Feature: Trendyol Morhipo Makas

  Scenario: Kullanici trendyolda ve morhipoda makas aratir
    Given   kullanici googlea gider
    Then trendyolu aratir
    And trendyol linkini bulup siteye gider
    And trendyolda makas aratir
    And trendyolda toplam urun sayisini alir
    And yeni sekmede morhipoya gider
    Then morhipoda makas aratir
    And morhipoda toplam urun sayisini alir
    And iki sitedeki topla makas sayisini karsilastirir
    And once urun sayisi fazla olan siteyi kapatir
    And sonra diger sayfayi kapatir

