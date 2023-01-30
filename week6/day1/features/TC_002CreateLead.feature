Feature: CreateLead functionality of Leaftaps application

#Background:
#Given Open the Chrome Browser
#And Load the application url

@Smoke @Regression
Scenario Outline: CreateLead with different data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
And Click on crmsfa link
And Click on Leads link
And Click on Create Lead link
And Enter the companyname as <companyName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
And Click CreateLead button
Then ViewLeads Page should be displayed


Examples:
|companyName|firstName|lastName|
|TestLeaf|Subraja|Subi|
|Qeagle|Ranjini|R|


