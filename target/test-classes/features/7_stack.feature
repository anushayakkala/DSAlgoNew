Feature: Test the functionalites on Stack data structure page
  As a User
  I want to be able to navigate to the Stack page and validate all the components present on the page

  Scenario: Validate user is navigated to the Stack Data Structure page
    Given User clicks on Get Started button in the Stack section on Home Page
    Then Stack Data Structure page is displayed successfully

  Scenario: Validate the functionality of Operations in Stack page for invalid data
    Given User clicks on Operations In Stack link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Operations in Stack page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console

   Scenario: Validate the functionality of Implementation page for invalid data
    Given User clicks on Implementation link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Implementation page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console
    
    Scenario: Validate the functionality of Applications page for invalid data
    Given User clicks on Applications link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Applications page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console
    
    Scenario: Validate user is able to navigate to home page using logo click
    When User clicks on NumpyNinja brand logo displayed on the page
    Then DSAlgo launch page is displayed
      