Feature: First Selenium Cucumber Project

  Scenario: Attempting to test Selenium and Cucumber on the saucedemo.com website.
    Given user open the webpage
    When Get page title and title length
    Then Print page title and title length in Console Text Editor
    When Get the page URL
    Then Verification to ensure that the opened page is correct
    When Get HTML Source code and Page Source length
    Then Print in Console Text Editor
    And Close browser