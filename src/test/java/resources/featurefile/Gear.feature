@regression
Feature: Gear Test

  Scenario: User Should be able to Add Product SuccessFully To Shopping Cart

    Given User is on homepage
    When User Mouse Hover on Gear Menu
    And  User clicks on Bags
    And User click on Product Name Overnight Duffle
    Then User Verifies text Overnight Duffle
    When User changes quantity to 3
    And User clicks on Add to Cart Button
    Then User verifies the text You added Overnight Duffle to your shopping cart
    And User clicks onShopping cart link
    Then User verifies Product name
    And User verifies Product Quantity
    And User Verifies Product price
    When User changed quantity from 3 to 5
    And User updated Shopping cart
    Then User verifies Product total price
