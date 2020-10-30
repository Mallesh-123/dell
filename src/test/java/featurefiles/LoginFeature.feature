Feature: Testing the login feature of actitime app

Background:
Given the browser is launched
And the application is loaded



Scenario: Testing the login Feature with valid data
When the user enters valid username
And the user enters the valid password
And the user clicks on the login button
Then dashboard should be displayed

Scenario: testing the forgotten password link
When user clicks on forgot password link
Then forgot your password component should be displayed
