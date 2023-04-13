@tag
Feature: Test Tree Page features

  
  Scenario: User is able to launch the Tree HomePage successfully when logged in
    Given User clicks Get Started button on Tree section
    Then Tree HomePage should be displayed

  #positive test case
  Scenario: User is able to navigate to Overview of Trees Page
    Given User click on the Overview of Trees link
    Then Overview of Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Terminologies Page
    Given User click on the Terminologies link
    Then Terminologies page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Types of Trees Page
    Given User click on the Types of Trees link
    Then Types of Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Tree Traversals Page
    Given User click on the Tree Traversals link
    Then Tree Traversals page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Traversals-Illustration Page
    Given User click on the Traversals-Illustration link
    Then Traversals-Illustration page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Binary Trees Page
    Given User click on the Binary Trees link
    Then Binary Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Types of Binary Trees Page
    Given User click on the Types of Binary Trees link
    Then Types of Binary Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Implementation in Python Page
    Given User click on the Implementation in Python link
    Then Implementation in Python page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Binary Tree Traversals Page
    Given User click on the Binary Tree Traversals link
    Then Binary Tree Traversals page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Implementation of Binary Trees Page
    Given User click on the Implementation of Binary Trees link
    Then Implementation of Binary Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Applications of Binary trees Page
    Given User click on the Applications of Binary trees link
    Then Applications of Binary trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Binary Search TreesPage
    Given User click on the Binary Search Trees link
    Then Binary Search Trees page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  Scenario: User is able to navigate to Implementation Of BST Page
    Given User click on the Implementation Of BST link
    Then Implementation Of BST page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    Then User enters valid Python code in the Editor
    And User click on the Run button
    Then User should get correct Run Output

  #negative test case
  Scenario: User is able to run invalid code in tryEditor with error message
    Given User click on the Terminologies link
    Then Terminologies page should be displayed
    When User click the Try Here>> button in Tree Page
    Then User able to see the Page having a TryEditor with the Run Button to test
    When User enters invalid Python code in the Editor
    And User click on the Run button
    Then User should get error message
    And User navigates to home page
