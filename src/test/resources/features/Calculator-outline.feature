Feature: Performing operations with a calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to perform operation on numbers using a Calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario Outline: Add two numbers
    When I add <arg0> and <arg1>
    Then the sum should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 2   |
      | 1    | -1   | 0   |
      | -5   | -6   | -11 |

  Scenario Outline: Subtract two numbers
    When I add <arg0> and <arg1>
    Then the subtraction should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | -1   | 2   |
      | 1    |  1   | 0   |
      | -5   | -6   | 1   |

  Scenario Outline: Multiply two numbers
    When I add <arg0> and <arg1>
    Then the multiplication should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | -1   | -1  |
      | 1    |  1   | 1   |
      | -5   | -6   | 30   |
