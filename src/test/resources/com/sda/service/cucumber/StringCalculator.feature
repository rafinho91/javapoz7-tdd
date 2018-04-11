Feature:
  Scenario: I can calculate single number
    Given I initialize stringCalculator
    And I pass 5 value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate null number
    Given I initialize stringCalculator
    And I pass value null
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate blank value
    Given I initialize stringCalculator
    And I pass  value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate two numbers
    Given I initialize stringCalculator
    And I pass 3;5 value
    When I trigger calculate function
    Then I get 8 as a result

  Scenario: I can calculate multiple numbers
    Given I initialize stringCalculator
    And I pass 1;2;3;4 value
    When I trigger calculate function
    Then I get 10 as a result

  Scenario: I can calculate multiple with whitespaces
    Given I initialize stringCalculator
    And I pass 1; 2; 3; 4 value
    When I trigger calculate function
    Then I get 10 as a result