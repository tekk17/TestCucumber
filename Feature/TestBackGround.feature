Feature: Testing A Background scenario
  Background: Testing background keyword
    Given this is the given background
    When this is the step being performed
    Then this is the background execution

  @First
  Scenario: This scenario is to test the hooks functionality
    Given This is the first step
    When this is the second step
    Then this is the third step

  @Second
  Scenario: This scenario is to test the hooks functionality
    Given This is the first step
    When this is the second step
    Then this is the third step