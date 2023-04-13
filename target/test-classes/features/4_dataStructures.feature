@tag
Feature: DataStructure page
  I want to use this template for my feature file

  Scenario: Check the get started functionlity on DataStructure section
    Given User clicks on Get Started button
    Then DataStructure Page is displayed successfully

  Scenario: The user is able to navigate to Time Complexity page
    Given User is on the Data Structures Introduction after logged in
    When User clicks on the Time complexity link
    Then User should be redirected to Time complexity page
    
    Scenario: The user is able run code in tryEditor with invalid data
    Given The user now clicks on try here button
    When The user enter invalid python code in tryEditor 
    And The user clicks on run button
    Then The user should handle alert presented with Run result

  Scenario: The user is able run code in tryEditor for Time Complexity page
    Given The user now clicks on try here button
    When The user enter valid python code in tryEditor 
    And The user clicks on run button
    Then The user should be presented with Run result
    And User navigates to home page
    
    
    
