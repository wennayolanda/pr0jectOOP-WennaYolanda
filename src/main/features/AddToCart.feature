Feature: Check the functionality of add-to-cart feature

  Background: User already login
    Given user open the webpage
    When user login as "standard_user" with password "secret_sauce"
    And user click "Login" button
    Then user see the products page contains:
      |Sauce Labs Backpack    |
      |Sauce Labs Bike Light  |
      |Sauce Labs Bolt T-Shirt|

  Scenario: User add product to cart
    Given user add product to cart
    And verify that total product "2" is display in icon cart
    And user click icon cart
    Then verify that product is display in cart