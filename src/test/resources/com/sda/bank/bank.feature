Feature:
  Scenario: I can add user to bank
    Given I instantiate bank database
    And I create user with name 'Szymon Nowak' and pesel '123456789'
    When I add bank user to bank
    Then I have user in bank