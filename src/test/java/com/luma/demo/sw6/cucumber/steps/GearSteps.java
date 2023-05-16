package com.luma.demo.sw6.cucumber.steps;

import com.luma.demo.sw6.cucumber.pages.GearPage;
import com.luma.demo.sw6.cucumber.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {

    @When("^User Mouse Hover on Gear Menu$")
    public void userMouseHoverOnGearMenu() {
        new HomePage().hoverOnGearMenu();
    }

    @And("^User clicks on Bags$")
    public void userClicksOnBags() {
        new HomePage().clickOnBags();

    }

    @And("^User click on Product Name Overnight Duffle$")
    public void userClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnOvernightDuffle();
    }

    @Then("^User Verifies text Overnight Duffle$")
    public void userVerifiesTextOvernightDuffle() {
        Assert.assertEquals(new GearPage().getTextOvernightDuffle(), "Overnight Duffle", "Error");
    }

    @And("^User changes quantity to (\\d+)$")
    public void userChangesQuantityTo(int arg3) {
        new GearPage().changeQuantity();
    }

    @And("^User clicks on Add to Cart Button$")
    public void userClicksOnAddToCartButton() {
       new GearPage().clickOnAddToCartButton();
    }

    @And("^User verifies the text You added Overnight Duffle to your shopping cart$")
    public void userVerifiesTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        Assert.assertEquals(new GearPage().gettextaddedDuffle(),"You added Overnight Duffle to your shopping cart.","Error");
    }

    @And("^User clicks onShopping cart link$")
    public void userClicksOnShoppingCartLink() {
        new GearPage().clickOnShoppingCartLink();
    }

    @And("^User verifies Product name$")
    public void userVerifiesProductName() {
        Assert.assertEquals(new GearPage().gettextCronusYogaPant(),"Overnight Duffle","Error");
    }

    @And("^User verifies Product Quantity$")
    public void userVerifiesProductQuantity() {
        Assert.assertEquals("3",new GearPage().getTextQuantity3(),"Error");
    }

    @And("^User Verifies Product price$")
    public void userVerifiesProductPrice() {
        Assert.assertEquals(new GearPage().getTextProductPrice(),"$135.00","Error");
    }


    @And("^User updated Shopping cart$")
    public void userUpdatedShoppingCart() {
        new GearPage().clickOnUpdateShoppingCartButton();

    }

    @Then("^User verifies Product total price$")
    public void userVerifiesProductTotalPrice() {
        Assert.assertEquals(new GearPage().getTextProductPrice225(),"$225.00","Error");
    }

    @When("^User changed quantity from (\\d+) to (\\d+)$")
    public void userChangedQuantityFromTo(int arg3, int arg5) {
        new GearPage().changeQuantityTo5();
    }
}
