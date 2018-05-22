Feature: Addition of integers using Data tables
  Scenario: Perform addition of integers using data tables
    Given Performing Addition of integers
    When The dataset integers to be added are
      |123|456|
      |321|543|
    Then The sum of the dataset integers
      |123|456|
      |321|543|