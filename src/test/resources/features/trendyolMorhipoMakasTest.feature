
Feature: Trendyol Morhipo

  # Google'a gidiniz
  # trendyol'u aratiniz
  # trendyol linkini bulup siteye gidiniz
  # makas aratiniz
  # toplam urun sayisini aliniz
  # yeni sekmede morhipo'ya gidiniz
  # makas aratiniz morhipo
  # toplam urun sayisini aliniz morhipo
  # iki sitedeki toplam makas sayisini karsilastiriniz
  # Once urun sayisi fazla olan siteyi kapatiniz
  # Sonra diger sayfayida kapatiniz

  Scenario: TC01 kullancı "makas" aratir

  Given www.google.com adresine gider
    Then googleda trendyol aratir
    And trendyol linkini bulup siteye gider
    Then Trendyol'da makas aratir
    And Trendyol'da bulunan toplam urun sayisini kaydeder
    Then Ayni browser'da yeni sekmede www.morhipo.com adresine gider
    Then morhipo'da makas aratir
    And Morhpo'da bulunan toplam urun sayisini kaydeder
    And iki sitedeki toplam makas sayisini karsilastirir
    And Once urun sayisi fazla olan sekmeyikapatir
    Then Sonra diger sekmeyi kapatir
