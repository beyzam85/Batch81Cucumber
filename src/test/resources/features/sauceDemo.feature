@Background
Feature: SauceDemo Login

    Background: tekrarlar
    Given Sauce sitesine girer


  Scenario: TC01 kullanici Dogru Username ve Password girer

    Then kullanici adi ve sifre girilir
    And Dogru giris yaptigi kontrol eder
    And sayfayi kapatir


  Scenario: TC02 kullanici Dogru Username ve yanlıs Password girer

    Then kullanici adi ve yanlıs sifre girilir
    And Yanlıs giris yaptigi kontrol eder
    And sayfayi kapatir


  Scenario: TC03 kullanici Yanlış Username ve yanlıs Password girer

    Then Yanlis kullanici adi ve yanlıs sifre girilir
    And Yanlıs giris yaptigi kontrol eder
    And sayfayi kapatir