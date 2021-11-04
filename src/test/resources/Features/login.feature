#Author : Jishamol TT
#Date :11/02/2021
Feature: Login with username and password

  #@SmokeTest
  Scenario: Login with valid username and password
    Given Login page the page is open
    When Enter with valid username and password
    And Click on login button
    Then Logged in succesfully
