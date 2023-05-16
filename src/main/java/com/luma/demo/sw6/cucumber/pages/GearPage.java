package com.luma.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.luma.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {

    private static final Logger log = LogManager.getLogger(GearPage.class.getName());
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Overnight Duffle ')]")
    WebElement nameOvernightDuffle;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Overnight Duffle')]")
    WebElement textOvernightDuffle;
    @CacheLookup
    @FindBy(id ="qty")
    WebElement quantity;
    @CacheLookup
    @FindBy(id ="product-addtocart-button")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath ="//div[contains(text(),'You added Overnight Duffle to your ')]")
    WebElement textaddedDuffle;
    @CacheLookup
    @FindBy(xpath ="//a[text()='shopping cart']")
    WebElement linkShoppingCart;
    @CacheLookup
    @FindBy(css ="td[class='col item'] strong[class='product-item-name']")
    WebElement textCronusYogaPant;
    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']")
    WebElement textQuantity3;
    @CacheLookup
    @FindBy(xpath ="//td[@class='col subtotal']//span[@class='price']")
    WebElement textProductPrice;
    @CacheLookup
    @FindBy(css ="td[class='col qty'] input[class*='input-text qty']")
    WebElement changeQuantity5;
    @CacheLookup
    @FindBy(xpath ="//span[text()='Update Shopping Cart']")
    WebElement updateShoppingCartButton;
    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement textProductPrice225;

    public void clickOnOvernightDuffle() {
        clickOnElement(nameOvernightDuffle);
        log.info("Click on Product " + nameOvernightDuffle.toString());

    }

    public String getTextOvernightDuffle() {
        log.info("Verify Text from Webpage");
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.DELETE + "3");
        log.info("Send text to username : " + quantity.toString());

    }

    public void clickOnAddToCartButton() {

        clickOnElement(addToCartButton);
        log.info("Click on add to cart " + addToCartButton.toString());
    }

    public String gettextaddedDuffle() {
        log.info("Verify Text from Webpage");
        return getTextFromElement(textaddedDuffle);
    }

    public void clickOnShoppingCartLink(){

        clickOnElement(linkShoppingCart);
        log.info("Click on shopping cart link " + linkShoppingCart.toString());

    }

    public String gettextCronusYogaPant() {
        log.info("Verify Text from Webpage");
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextQuantity3() {
        log.info("Verify Text from Webpage");
        return textQuantity3.getAttribute("value");
    }

    public String getTextProductPrice(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(textProductPrice);
    }

    public void changeQuantityTo5(){

        sendTextToElement(changeQuantity5,Keys.DELETE+"5");
        log.info("Send text to quantity field : " + changeQuantity5.toString());
    }

    public void clickOnUpdateShoppingCartButton(){

        clickOnElement(updateShoppingCartButton);
        log.info("Click on update button " + updateShoppingCartButton.toString());
    }

    public String getTextProductPrice225(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(textProductPrice225);
    }
}
