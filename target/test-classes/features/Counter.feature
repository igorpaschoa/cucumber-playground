Feature: Implement a counter
  As a user i want to implement a counter

  Scenario: Should add numbers to counter
    Given the counter value is 15
    When add 5
    Then counter equals 20