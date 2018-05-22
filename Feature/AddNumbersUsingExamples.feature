Feature: Addition of numbers using examples
  Scenario Outline: Perform addition of numbers using examples
    Given Performing Addition of integers
    When The two integers are "<number1>" and "<number2>"
    Then Add and return the sum of two integers "<number1>" and "<number2>"
    Examples:
    |number1|number2|
    |123    |342    |
    |432    |543    |