#Author: Jishamol T T
#Date : 11/10/2021

Feature: Verify login functionality with background feature

Background: User gets logged in
Given User naviagtes to the HRM page
When Enter the username and password
And Click on login button in HRM
Then User navigates to the home page

Scenario: Verify the presence of log out functionality once logged in

When Click on welcome link
Then Verify the log out button is displayed.


Scenario: Verify the personal details under My info page

When Click on My Info
Then Verify the personal details

