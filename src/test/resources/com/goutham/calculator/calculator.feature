Feature: Calculator functions

Scenario: Adding two numbers should result in addition of those numbers
Given the calculator is initialized to zero
When 100 is added with 50
Then the result should be 150