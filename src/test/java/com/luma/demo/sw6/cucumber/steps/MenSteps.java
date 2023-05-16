package com.luma.demo.sw6.cucumber.steps;

import com.luma.demo.sw6.cucumber.pages.HomePage;
import com.luma.demo.sw6.cucumber.pages.MensPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {

    }
    @When("^User Mouse Hover on Men Menu$")
    public void userMouseHoverOnMenMenu() {
        new HomePage().mouseHoverToMenMenu();
    }

    @And("^User Mouse Hover on Bottoms$")
    public void userMouseHoverOnBottoms() {
        new HomePage().mouseHoverToMenBottom();
    }

    @And("^User Click on Pants$")
    public void userClickOnPants() {
        new HomePage().clickOnPants();
    }

    @And("^User Mouse hover on Product Name  ‘Cronus Yoga Pant’ and click on size (\\d+)$")
    public void userMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int arg32) {
        new MensPage().hoverAndClickProduct();
    }

    @And("^Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MensPage().hoverAndClickProductColour();
    }

    @And("^Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button\\.$")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MensPage().hoverAndClickOnAddToCartButton();
    }

    @And("^Verify the text‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MensPage().getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.","Error");
    }

    @And("^Click on ‘shopping cart’ Link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
      new MensPage().clickOnShoppingCart();
    }

    @Then("^Verify the text ‘Shopping Cart\\.’$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals(new MensPage().getTextShoppingCart(),"Shopping Cart","Error");
    }


    @And("^Verify the product name ‘Cronus Yoga Pant’$")
    public void verifyTheProductNameCronusYogaPant() {
        Assert.assertEquals(new MensPage().getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
    }

    @And("^Verify the product colour ‘Black’$")
    public void verifyTheProductColourBlack() {
        Assert.assertEquals(new MensPage().getTextBlack(),"Black", "Error");
    }

    @And("^Verify the product size (\\d+)$")
    public void verifyTheProductSize(int arg32) {
        Assert.assertEquals(new MensPage().getTextSize32(),"32","Error");
    }
}
