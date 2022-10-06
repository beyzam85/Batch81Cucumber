Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratır

    Given kullanıcı amazon sayfasına gider
    Then Kullanıcı nutella aratır
    And Sonucların nutella icerdiğini test edin
    And Sayfayi kapatir
