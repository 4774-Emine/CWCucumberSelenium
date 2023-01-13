Feature: Parametreli step kullanimi

  Scenario: Cucumber step definition (Cucumber Edition)
    Given Ilk sayi 5
    And Ikınci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then  Sonuc 8 olmadir



    Scenario Outline: Cucumber step definition (Cucumber Edition) outline
      Given ılk sayi <sayi1>
      And Ikınci sayi <sayi2>
      When Bu sayilari <operator> operatorune sokarsam
      Then  Sonuc <sonuc> olmadir

      Examples:
      |sayi1|sayi2|operator|sonuc|
      |10   |15   |+       |25   |
      |5    |2    |-       |3    |
      |4    |7    |*       |26   |
      |9    |2    |/       |4    |

    Scenario: Cucumber step definition (Regex Edition)