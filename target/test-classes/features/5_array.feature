Feature: To validate Array

  Scenario: User is navigated to Arrays page from home page
    Given User is on homepage and clicks on array getstated button
    Then User clicks on arrays in python link

  Scenario: User is navigated from arrays in python page to run on text editor with invalid python code
    Given User is on arrays in python page
    And User clicks on try here link
    Then User is navigated to text editor page enters invalid input code
    Then User clicks on run button
    Then User should handle the alert on the page after clicking on run button

  Scenario: User is navigated from arrays in python page to run on text editor
    Given User is on arrays in python page
    And User clicks on try here link
    Then User is navigated to text editor page
    Then User clicks on run button

  Scenario: User is navigated from arrays using list page to run on text editor
    Given User is on text editor page of arrays in python
    Then User should be navigated to arrays page
    And User clicks on Arrays using List link
    And User clicks on try here link
    Then User is navigated to text editor page enters invalid input code
    Then User clicks on run button
    Then User should handle the alert on the page after clicking on run button

  Scenario: User is navigated from arrays using list page to run on text editor
    Given User is on text editor page of arrays in python
    Then User should be navigated to arrays page
    And User clicks on Arrays using List link
    And User clicks on try here link
    Then User is navigated to text editor page
    Then User clicks on run button

  Scenario: User is navigated from Basic Operations in Lists page to run on text editor
    Given User is on text editor page of arrays using list
    Then User should be navigated to arrays page
    Then User clicks on Basic Operations in lists page
    And User clicks on try here link
    Then User is navigated to text editor page enters invalid input code
    Then User clicks on run button
    Then User should handle the alert on the page after clicking on run button

  Scenario: User is navigated from Basic Operations in Lists page to run on text editor
    Given User is on text editor page of arrays using list
    Then User should be navigated to arrays page
    Then User clicks on Basic Operations in lists page
    And User clicks on try here link
    Then User is navigated to text editor page
    Then User clicks on run button

  Scenario: User is navigated from Applications of Array page to run on text editor
    Given User is on text editor page of Basic Operations in Lists page
    Then User should be navigated to arrays page
    Then User clicks on Applications of Array page
    And User clicks on try here link
    Then User is navigated to text editor page enters invalid input code
    Then User clicks on run button
    Then User should handle the alert on the page after clicking on run button

  Scenario: User is navigated from Applications of Array page to run on text editor
    Given User is on text editor page of Basic Operations in Lists page
    Then User should be navigated to arrays page
    Then User clicks on Applications of Array page
    And User clicks on try here link
    Then User is navigated to text editor page
    Then User clicks on run button
    And User navigates to home page
