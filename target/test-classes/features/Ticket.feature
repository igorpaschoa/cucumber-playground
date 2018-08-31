Feature: Passenger tickets
  Validate the passenger tickets

  Scenario: Should create generic steps like these
    Given the ticket is AF345
    And the passage value is $ 230.45
    And the passenger name is "John Doe"
    And the passenger phone is 9999-9999
    When all the steps are created
    Then the test will work

  Scenario: Should reuse the given steps in previous scenario
    Given the ticket is AB167
    And the special ticket is AB167
    And the passage value is $ 1120.23
    And the passenger name is "Mary Jones"
    And the passenger phone is 9888-8888

  @ignore
  Scenario: should deny all the given steps in previous scenarios
    Given the ticket is CD123
    Given the ticket is AG1234
    Given the passage value is $ 1.1345.56
    Given the passenger name is "Reuven Marcela Vavrinec Nestan"
    Given the passenger phone is 1234-5678
    Given the passenger phone is 999-2223

