@prodnew
Feature: Login
         
  In order to perform successful login
  As user
  I want to enter correct username and password
  
  @w2atest 
  Scenario Outline: In order to verify login to facebook
    Given user navigates to facebook
    When user validates the title of the facebook
    Then user enters "<username>" username
    And user enters "<password>" password
    Then user "<loginType>" successfully logged in
    
 Examples:
 	|username |password |loginType |
 	|valid |valid |should |
 	|valid |invalid |shouldnot |
 	|invalid |invalid |shoulnot|
 	|invalid |valid |shoulnot|
