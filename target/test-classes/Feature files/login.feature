Feature: To validate login functionality
Scenario:To validate login functionality using valid username and invalid password
Given User should launch the chrome browser and load url
When User should type valid username and invalid password
And User should click the login button
Then User should navigate to incorrect credential page
