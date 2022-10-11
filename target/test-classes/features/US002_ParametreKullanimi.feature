Feature: US002 Parametre Kullanimi
Background: Ortak adım
   Given kullanici amazon sayfasina gider

   Scenario: TC01 Kullanici amazonda parametre arama yapar
   Then kullanici "makas" icin arama yapar
   Then sonuclarin "makas" icerdigini test eder
   And sayfayi kapatir




         # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
         # StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
         # yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
         # yeterli olacaktir boylece kodlarimiz dinamik olacaktir