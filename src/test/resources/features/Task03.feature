Feature:Dinamik Url

Scenario Outline:Dinamik Url ler

  Given Kullanici "<page_url>" sayfasina gider

 Then kullanici 12 sn bekler

 And sayfa basliginin "<kelime>" icerdigini test eder

 And sayfayi kapatir


  Examples:
    |page_url|kelime|
    |google  |google|
    |amazon  |amazon|
    |trendyol|trendyol|



