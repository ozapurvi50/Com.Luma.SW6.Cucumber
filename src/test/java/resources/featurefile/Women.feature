@regression
Feature: Women Test

  Background:
    Given I am on homepage
    When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets

  @smoke
  Scenario: Verify The SortBy Product Name Filter
    And I Select Sort By filter “Product Name”
    Then User should be able to Verify the products name display in alphabetical order


  Scenario: Verify The SortBy Price Filter
    And I Select Sort By filter “Price”
    Then User should be able to Verify the Price displayed in Low to High