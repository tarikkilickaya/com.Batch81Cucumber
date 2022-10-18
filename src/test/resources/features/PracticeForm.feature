@practiceForm
Feature: Form doldurma

  Scenario Outline: Practice form doldurma

    Given Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And bir dosya yukler
    And checkbox1i secer
    And radio2yi secer
    And selection item3u secer
    And dropdown itmem4u secer
    And submite tiklar
    Then dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre    | metin alani |
      | tarik         | sifre123 | eyvallah    |