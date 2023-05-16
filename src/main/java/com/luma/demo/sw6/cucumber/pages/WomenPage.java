package com.luma.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.luma.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());
    @CacheLookup
    @FindBy(id="sorter")
    WebElement filterProduct;
    @CacheLookup
    @FindBy(xpath="//img[starts-with(@class,'product-image-photo')]")
    List<WebElement> elementList1 ;
    @CacheLookup
    @FindBy(css=".products .product-item-info .product-item-name")
    List<WebElement> elementListDisplay1;
    @CacheLookup
    @FindBy(css=".products .product-item-info .product-item-name")
    List<WebElement> afterSortingProductName1;
    @CacheLookup
    @FindBy(css="span[data-price-type='finalPrice']")
    List<WebElement> originalList1 ;
    @CacheLookup
    @FindBy(css="span[data-price-type='finalPrice']")
    List<WebElement> afterSortingList1 ;



    public void selectSortByFilterProductName(){
        selectByValueFromDropDown(filterProduct,"name");
        log.info("Select from dropdown list : " + filterProduct.toString());
    }
    public void selectSortByFilterPrice(){
        selectByValueFromDropDown(filterProduct,"price");
        log.info("Select from dropdown list : " + filterProduct.toString());
    }
    public void verifyProductsNameAlphabeticalOrder(){
        List<WebElement> elementList = elementList1;
        System.out.println("Total elements are : " + elementList.size());

        List<WebElement> elementListDisplay = elementListDisplay1;
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementListDisplay) {

            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList + "\n");

        List<WebElement> afterSortingElementList=afterSortingProductName1;
        List<String> afterSortingProductName=new ArrayList<>();
        for(WebElement product:afterSortingElementList){
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList,afterSortingProductName,"Not sorted in Alphabetical order");
    }
    public void verifyProductsPriceLowToHigh(){
        List<WebElement> originalList=originalList1;
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);
        List<WebElement> afterSortingList = afterSortingList1;
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
        Assert.assertEquals(originalProductPriceList, afterSortingProductPrice,"Error");
    }
}
