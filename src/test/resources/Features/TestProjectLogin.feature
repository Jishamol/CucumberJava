Feature: Login functionality check on the test project website

  Scenario Outline: Login with valid username and password
    Given Browser should be open
    And User navigates to the test project login page
    When Enter <username> and <password> in login page
    And click on login button
    Then Verify user logged in

    Examples: 
      | username  | password |
      | Catherine |    12345 |
      | Irene     |    12345 |
