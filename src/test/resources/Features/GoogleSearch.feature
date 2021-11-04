#Author : Jishamol TT
#Date :11/03/2021
Feature: Google search functionality test

  Scenario: Search selenium automation in google and navigates to the selenium dev page
    Given Browser is open
    And User into the google page
    When Enter the text to search
    And Click on enter key
    And Click on selenium dev link
    Then User navigates to the Selenium official site
