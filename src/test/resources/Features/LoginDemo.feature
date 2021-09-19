Feature: Test Login functionality

  Scenario Outline: Check login in successful with valid credentials
    Given browser is open
    And user is on login page
    When user is enters <username> and <password>
    And user clicks login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
