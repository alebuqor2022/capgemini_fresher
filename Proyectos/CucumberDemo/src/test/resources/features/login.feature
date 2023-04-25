# 1er ejemplo

Feature: test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

