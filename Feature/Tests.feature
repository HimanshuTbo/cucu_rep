Feature: Login Feature
  Verify if user is able to Login in to the site

Scenario Outline: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters <username> and <Password>
    Then success or failure message is displayed
    
    
    Examples:
    | username | Password  |
    | "blog.cucumber@gmail.com"    | "Cucumber@blog"  |
    | "Coin"     | "false" |
   
   
    
   
    