@AdditionTest
Feature: Add Numbers
  @AddingWithDataTables
  Scenario: Addition of two integers
    Given There are two integers
      |number1|number2|
      |123|456|
      |543|321|
    Then Add and return the sum of two integers
      |number1|number2|
      |123|456|
      |543|321|

  @AddingWithDataTablesSet2
  Scenario: Addition of two integers
    Given There are two integers
      |number1|number2|
      |1231|2456|
      |5413|3221|
    Then Add and return the sum of two integers
      |number1|number2|
      |1231|7456|
      |5439|3221|