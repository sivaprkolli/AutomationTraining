Feature: Login Tests

Scenario: Verify successful login
Given User on login page
When User enter "performance_glitch_user" and "secret_sauce"
And User click on submit
Then User verify products page
And User verify single product