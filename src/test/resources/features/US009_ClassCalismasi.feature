Feature:Class Calismasi
  Scenario Outline:
    When kullanici https://editor.datatables.net/ adresine gider
    Then  new butonuna basar
    And "<first name>" girer
    And "<last name>" girer
    And "<position girer>" girer
    And "ofis bilgisi>" girer
    And "<extension>" girer
    And "<Start date>"  girer
    And "<Salary>" girer
    And Create tusuna basar
    When kullanici "<first name>" ile arama yapar
    Then isim bolumunde "<first name>" oldugunu dogrular

    #5 farkli kullanici bilgisi girer