Feature: Test cases for bookstore
  Scenario: I add a new book
    Given I initialize bookstore
    And I create new book
    When I add book to the bookstore
    Then I have book in my bookstore

  Scenario: I can update title of book
    Given I initialize bookstore
    And I create new book
    When I add book to the bookstore
    And I change a book title
    Then Book's title has changed