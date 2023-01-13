Feature: Google da cucmber aramasi
  Scenario: Google da kelime arandiginda ilgili kelime title da görüntülenmelidir.
    Given Kullanici google sayfasindadir.
    When Kullanici Cucumber kelimesini aradiginda
    Then Kullanici sayfada cucumber kelimesini dogrular.

