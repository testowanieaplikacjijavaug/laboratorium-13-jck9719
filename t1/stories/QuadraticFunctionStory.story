Narrative:
To test quadratic function program
As a user
I have to check some examples

Scenario: Quadratic equation with 2 solutions
Given Quadratic equation
When Set values a = <a>, b = <b>, c = <c>
Then Got 2 solutions <x1> and <x2>

Examples:
|a|b|c|x1|x2|
|1.0|7.0|0.0|0.0|-7.0|
|16|4|-20|1|-1.25|

Scenario: Quadratic equation with 1 solution
Given Quadratic equation
When Set values a = <a>, b = <b>, c = <c>
Then Got 1 solution <x>

Examples:
|a|b|c|x|
|1.0|2.0|1.0|-1.0|
|4|-4|1|0.5|

Scenario: Quadratic equation exception
Given Quadratic equation
When Set values a = 1, b = 1, c = 1
Then Got exception




