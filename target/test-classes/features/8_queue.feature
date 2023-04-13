Feature: Test the functionalites on Queue Data structure page
  As a User
  I want to be able to navigate to the  Queue page and validate all the components present on the page

  Scenario: Validate user is navigated to the Queue Data Structure page
    Given User clicks on Get Started button in the Queue section on Home Page
    Then Queue Data Structure page is displayed successfully

  Scenario: Validate the functionality of Implementation of Queue in Python page for invalid data
    Given User clicks on Implementation of Queue in Python link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Implementation of Queue in Python page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console

  Scenario: Validate the functionality of Implementation using collections.deque page for invalid data
    Given User clicks on Implementation using collections.deque link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Implementation using collections.deque page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console

  Scenario: Validate the functionality of Implementation using array page for invalid data
    Given User clicks on Implementation using array link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Implementation using array page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console

  Scenario: Validate the functionality of Queue Operations page for invalid data
    Given User clicks on Queue Operations link
    And Click on Try here button
    And User is navigated to the try Editor page
    When User enters invalid python code in the text editor
    And Clicks on Run button
    Then Error alert is displayed

  Scenario: Validate the functionality of Queue Operations page for valid data
    When User enters valid python code in the text editor
    And Clicks on Run button
    Then Output is be displayed successfully in the Run console

  Scenario: Validate user is able to navigate to home page using logo click
    When User clicks on NumpyNinja brand logo displayed on the page
    Then DSAlgo launch page is displayed
