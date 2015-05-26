Narrative: 
In order to give small changes
As a change machine
I want to give the small number of coins for an amount of money

Scenario: One Coin changes

Given a change machine
When i ask for a change of <value>
Then it returns the <coin> coin

Examples:
|value|coin|
|0.01|1c|
|0.05|5c|
|0.10|10c|
|0.25|25c|
|0.50|50c|