package com.luma.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.luma.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MensPage extends Utility {
    private static final Logger log = LogManager.getLogger(MensPage.class.getName());
    @CacheLookup
    @FindBy(css=".product-item-link")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="(//div[@id='option-label-size-143-item-175'])[1]")
    WebElement size32;
    @CacheLookup
    @FindBy(css="#option-label-color-93-item-49")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(css=".action.tocart.primary")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedPant;
    @CacheLookup
    @FindBy(css=".message-success.success.message div a")
    WebElement linkShoppingCart;
    @CacheLookup
    @FindBy(css="main div h1 span")
    WebElement textShoppingCart;
    @CacheLookup
    @FindBy(xpath="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement textCronusYogaPant;
    @CacheLookup
    @FindBy(css=".item-options>dd:first-of-type")
    WebElement textSize32;
    @CacheLookup
    @FindBy(css=".item-options>dd:last-of-type")
    WebElement textBlack;

    public void hoverAndClickProduct(){

        mouseHoverToElement(productName);
        clickOnElement(size32);
        log.info("Mouse hover on Product name and click on size 32");

    }
    public void hoverAndClickProductColour(){

        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
        log.info("Mouse hover on Product name and click on colour Black");

    }
    public void hoverAndClickOnAddToCartButton(){

        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
        log.info("Mouse hover on Product name and click on add to cart Button");

    }
    public String getTextAddedPantToShoppingCart(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(addedPant);
    }
    public void clickOnShoppingCart(){

        clickOnElement(linkShoppingCart);
        log.info("Click on shopping cart link " + linkShoppingCart.toString());

    }
    public String getTextShoppingCart(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(textShoppingCart);
    }
    public String getTextCronusYogaPant(){

        log.info("Verify Text from Webpage");
        return getTextFromElement(textCronusYogaPant);
    }
    public String getTextSize32(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(textSize32);
    }
    public String getTextBlack(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(textBlack);
    }
}
