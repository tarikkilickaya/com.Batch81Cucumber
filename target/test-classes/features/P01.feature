Feature: Makas karsilastirma

  Scenario: Makas Sayisi Karsilastirma

    Given Google'a gidiniz
    Then trendyol'u aratiniz
    And trendyol linkini bulup siteye gidiniz
    Then makas aratiniz
    And toplam urun sayisini aliniz
    Then yeni sekmede morhipo'ya gidiniz
    And makas aratiniz morhipo
    Then toplam urun sayisini aliniz morhipo
    And iki sitedeki toplam makas sayisini karsilastiriniz
    Then Once urun sayisi fazla olan siteyi kapatiniz
    And Sonra diger sayfayida kapatiniz