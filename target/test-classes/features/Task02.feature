Feature: Google arama
  Scenario: Kullanıcı Google a gider ilgili kelimeyi arar ve kelimenin arandigini dogrular
    Given Kullanici google sayfasina gider
    When Kullaini selenium u aratir
    Then Kullanici selenium kelimesini aradigini dogrular