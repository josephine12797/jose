Feature: To validate login functionality

Background:
Given User should launch the chrome browser and load url

Scenario:To validate login functionality using valid username and invalid password
When User should type valid username and invalid password
And User should click the login button
Then User should navigate to incorrect credential page

Scenario: To validate login functionality using invalid username and invalid password
When User should type invalid username and invalid password
And User should click the login button
Then User should navigate to incorrect credential page