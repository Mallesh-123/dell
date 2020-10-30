Feature: Testing the login feature of actitime app

Background:
Given the browser is launched
And the application is loaded



Scenario: Testing the login Feature with valid admin credentials
When the user enters credentials as username and password
||admin|manager|
|trainee|trainee|
And the user clicks on the login button
Then dashboard should be displayed
