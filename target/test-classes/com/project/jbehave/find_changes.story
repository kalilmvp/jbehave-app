Narrative: 
In order to give small changes
As a change machine
I want to give the small number of coins for an amount of money

Scenario: One Coin changes

Given a change machine
When i ask for a change of 0.01
Then it returns the 1c coin

Given a change machine
When i ask for a change of 0.05
Then it returns the 5c coin