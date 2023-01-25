Feature: Login functionality of Leaftaps application

Scenario: Login with positive credentials
Given Open the Chrome Browser
And Load the application url
And Enter the username as Demosalesmanager
And Enter the password as crmsfa
When Click on Login button
Then HomePage should be displayed

