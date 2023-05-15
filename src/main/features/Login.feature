Feature: Login

  Background: user open the web
    Given user open the webpage

  Scenario: user login with a valid email and password.
    Given user login as "standard_user" with password "secret_sauce"
    When user click "Login" button
    Then user see the products page contains:
      |Sauce Labs Backpack    |
      |Sauce Labs Bike Light  |
      |Sauce Labs Bolt T-Shirt|

  Scenario: User login with invalid data
    Given user login as "wenna" with password "12345"
    When user click "Login" button
    Then the "Epic sadface: Username and password do not match a" label validation error is displayed

  Scenario: Check that the user is not able to login with an invalid username
    Given user login as "wenna" with password "secret_sauce"
    When user click "Login" button
    Then the "Epic sadface: Username and password do not match a" label validation error is displayed

  Scenario: Check that the user is not able to login with an invalid password
    Given user login as "standard_user" with password "12345"
    When user click "Login" button
    Then the "Epic sadface: Username and password do not match a" label validation error is displayed

  Scenario: User login without input credential
    Given user click "Login" button
    Then the "Epic sadface: Username is required" label validation error is displayed

  Scenario: User login without input username
    Given user input password "secret_sauce"
    When user click "Login" button
    Then the "Epic sadface: Username is required" label validation error is displayed

  Scenario: User login without input password
    Given user input username "standard_user"
    When user click "Login" button
    Then the "Epic sadface: Password is required" label validation error is displayed


