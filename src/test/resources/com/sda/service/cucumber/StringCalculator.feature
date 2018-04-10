Feature:
  Scenario: I can calculate single number
    Given I initialize stringCalculator
    And I pass single number value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate null number
    Given I initialize stringCalculator
    And I pass null value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate blank value
    Given I initialize stringCalculator
    And I pass blank value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate two numbers
    Given I initialize stringCalculator
    And I pass numbers 3 and 5
    When I trigger calculate function
    Then I get 8 as a result

  Scenario: I can calculate multiple numbers
    Given I initialize stringCalculator
    And I pass numbers 1 2 3 and 4
    When I trigger calculate function
    Then I get 10 as a result

  Scenario: I can calculate multiple with whitespaces
    Given I initialize stringCalculator
    And I pass 1 2 3 4 with whitespaces
    When I trigger calculate function
    Then I get 10 as a result