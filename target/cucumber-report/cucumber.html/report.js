$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gear.feature");
formatter.feature({
  "line": 2,
  "name": "Gear Test",
  "description": "",
  "id": "gear-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 12116978600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should be able to Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "gear-test;user-should-be-able-to-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Mouse Hover on Gear Menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Product Name Overnight Duffle",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Verifies text Overnight Duffle",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User changes quantity to 3",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verifies the text You added Overnight Duffle to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks onShopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User verifies Product name",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User verifies Product Quantity",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Verifies Product price",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User changed quantity from 3 to 5",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User updated Shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies Product total price",
  "keyword": "Then "
});
formatter.match({
  "location": "MenSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 223807900,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 957645300,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userClicksOnBags()"
});
formatter.result({
  "duration": 1959766400,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userClickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 2712036800,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesTextOvernightDuffle()"
});
formatter.result({
  "duration": 52324800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "GearSteps.userChangesQuantityTo(int)"
});
formatter.result({
  "duration": 182323700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userClicksOnAddToCartButton()"
});
formatter.result({
  "duration": 257540000,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesTheTextYouAddedOvernightDuffleToYourShoppingCart()"
});
formatter.result({
  "duration": 1581604500,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userClicksOnShoppingCartLink()"
});
formatter.result({
  "duration": 1836046500,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesProductName()"
});
formatter.result({
  "duration": 177506700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesProductQuantity()"
});
formatter.result({
  "duration": 359029300,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesProductPrice()"
});
formatter.result({
  "duration": 196726100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 27
    },
    {
      "val": "5",
      "offset": 32
    }
  ],
  "location": "GearSteps.userChangedQuantityFromTo(int,int)"
});
formatter.result({
  "duration": 147946300,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userUpdatedShoppingCart()"
});
formatter.result({
  "duration": 157339000,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.userVerifiesProductTotalPrice()"
});
formatter.result({
  "duration": 3500077200,
  "status": "passed"
});
formatter.after({
  "duration": 1431671400,
  "status": "passed"
});
formatter.uri("Women.feature");
formatter.feature({
  "line": 2,
  "name": "Women Test",
  "description": "",
  "id": "women-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5311060100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Mouse Hover on Women Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Mouse Hover on Tops",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Jackets",
  "keyword": "And "
});
formatter.match({
  "location": "WomenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 66500,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 959802600,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 183727900,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iClickOnJackets()"
});
formatter.result({
  "duration": 1868271200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify The SortBy Product Name Filter",
  "description": "",
  "id": "women-test;verify-the-sortby-product-name-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I Select Sort By filter “Product Name”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be able to Verify the products name display in alphabetical order",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenSteps.iSelectSortByFilterProductName()"
});
formatter.result({
  "duration": 2665800700,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.userShouldBeAbleToVerifyTheProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 399845300,
  "status": "passed"
});
formatter.after({
  "duration": 1008271100,
  "status": "passed"
});
formatter.before({
  "duration": 9111779400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Mouse Hover on Women Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Mouse Hover on Tops",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Jackets",
  "keyword": "And "
});
formatter.match({
  "location": "WomenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 101000,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 172888600,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 153657500,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.iClickOnJackets()"
});
formatter.result({
  "duration": 2284444100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify The SortBy Price Filter",
  "description": "",
  "id": "women-test;verify-the-sortby-price-filter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I Select Sort By filter “Price”",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to Verify the Price displayed in Low to High",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenSteps.iSelectSortByFilterPrice()"
});
formatter.result({
  "duration": 2268005200,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.userShouldBeAbleToVerifyThePriceDisplayedInLowToHigh()"
});
formatter.result({
  "duration": 399115900,
  "status": "passed"
});
formatter.after({
  "duration": 1013733200,
  "status": "passed"
});
});