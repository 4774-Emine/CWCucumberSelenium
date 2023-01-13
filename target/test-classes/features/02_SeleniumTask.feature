Feature : Google search test

  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuçlar görüntülenmelidir.
    Given Kulanıcı google sayfasındadır.
    When Kullanıcı samsung kelimesi arar.
    Then Kullanıcı sayfada samsung kelimesi geçtiğini doğrular