Feature: Login functionality of Leaftaps application

#Background:
#Given Open the Chrome Browser
#And Load the application url

@Smoke
Scenario: Login with positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

@Regression
Scenario: Login with negative credentials
Given Enter the username as 'Demo1'
And Enter the password as 'crmsfa1'
When Click on Login button
But Error message should be displayed

