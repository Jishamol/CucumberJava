#Author : Jishamol TT
#Date :11/04/2021
Feature: Check the login functionality in Guru demo site

 @priority2
  Scenario Outline: Login functionality with valid credentials
    Given Guru demo site open
    #And User in demo site page
    When User login with <username> and <password> and click on login
    Then Verify whether user logged in successfully

    Examples: 
      | username          | password |
      | test123@gmail.com | test123  |
      | test234@gmail.com | test234  |
