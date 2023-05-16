@sanity
Feature: Men Test

  Scenario: User adds product successfully to shopping cart
    Given User is on homepage
    When User Mouse Hover on Men Menu
    And User Mouse Hover on Bottoms
    And User Click on Pants
    And User Mouse hover on Product Name  ‘Cronus Yoga Pant’ and click on size 32
    And Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    And Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    And Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    Then Click on ‘shopping cart’ Link into message
    And Verify the text ‘Shopping Cart.’
    And Verify the product name ‘Cronus Yoga Pant’
    And Verify the product size 32
    And Verify the product colour ‘Black’


