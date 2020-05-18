Narrative:
To test quadratic function program
As a user
I have to check some examples

Scenario: Quadratic equation with 2 solutions
Given Quadratic equation
When Set values a = a, b = b, c = c
Then Got 2 solutions x1 and x2

Scenario: Quadratic equation with 1 solution
Given Quadratic equation
When Set values a = a, b = b, c = c
Then Got 1 solution x

Scenario: Quadratic equation exception
Given Quadratic equation
When Set values a = a, b = b, c = c
Then Got exception




