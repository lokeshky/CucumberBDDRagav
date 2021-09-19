@smoketest
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on the login page
    When user enters username and password
    And clicks on the login button
    Then user navigates to the home page
