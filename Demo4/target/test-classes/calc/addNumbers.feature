Feature: Addition of two numbers
  Scenario Outline: Add numbers with valid integers
    Given User creates object of calculator
    When User pass <number1> and <number2> as input
    Then Displays sum of both numbers
Examples:
|number1|number2|
|23|45|