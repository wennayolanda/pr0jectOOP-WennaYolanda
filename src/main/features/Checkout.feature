Feature: Check the functionality of checkout feature

  Background: User already login
    Given user open the webpage
    When user login as "standard_user" with password "secret_sauce"
    And user click "Login" button
    Then user see the products page contains:
      |Sauce Labs Backpack    |
      |Sauce Labs Bike Light  |
      |Sauce Labs Bolt T-Shirt|
    And user add product to cart
    And verify that total product "2" is display in icon cart
    When user click icon cart
    Then verify that product is display in cart

  Scenario: user checkout the products
    Given the user click "Checkout" button
    When user input first name "wenna" with last name "yolanda" and zip "99999"
    And user click "Continue" button
    And verify that product is display in checkout page
    And verify that the total tax displayed is accurate
    And the user click "Finish" button
    Then the user click "Back Home" button