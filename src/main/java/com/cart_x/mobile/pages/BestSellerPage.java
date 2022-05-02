package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BestSellerPage extends Utility {

    By bestSellerText = By.xpath("//h1[contains(text(),'Bestsellers')]");
    By shortBy = By.xpath("//div[@class='sort-box']");
    By nameAToZ = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name A - Z')]");
    By nameZtoA = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name Z - A')]");
    By priceHighToLow = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Price High - Low')]");
    By selectRate =By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Rates')]");
    By appleIphoneProduct = By.xpath("//ul[@class='products-grid grid-list']/li[1]");
    By addToCartButton = By.xpath("//ul[@class='products-grid grid-list']/li[1]/descendant::button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By addToCartProductSuccessText = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeButton = By.cssSelector(".close");
    By yourCartButton = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.xpath("//span[contains(text(),'View cart')]/parent::a");
    By vinylIdolzProduct = By.xpath("//ul[@class='products-grid grid-list']/li[3]");
    By addtoCartOnVinylIdolzProduct = By.xpath("//ul[@class='products-grid grid-list']/li[3]/descendant::button[@class='btn  regular-button add-to-cart product-add2cart productid-16']");
    By productPrice = By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/descendant::span[@class='price product-price']");
    By produceName = By.xpath("//ul[@class='products-grid grid-list']/child::li/descendant::h5/child::a");
    By productRate = By.xpath("//div[@class='stars-row full']");

    public String getVerifyBestSellerText(){
        return getTextFromElement(bestSellerText);
    }

    public void mouseHoverOnSortByDropDown(){
        mouseHoverToElement(shortBy);
    }

    public void clickOnNameAToZFilter(){
        clickOnMouseHoverElement(nameAToZ);
    }

    public void mouseHoverOnProductAppleIphoneProduct(){
        mouseHoverToElement(appleIphoneProduct);
    }

    public void clickOnAddToCartButtonOfAppleIphoneProduct(){
        clickOnMouseHoverElement(addToCartButton);
    }

    public String getVerifyAddToCartSuccessText(){
        return getTextFromElement(addToCartProductSuccessText);
    }
    public void clickOnCloseButtonOfAddToCartMessage(){
        clickOnElement(closeButton);
    }

    public void clickOnYourCartButtonIcon(){
        clickOnElement(yourCartButton);
    }

    public void clickOnViewCartButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(viewCartButton);
    }

    public void mouseHoverOnvinylIdolzProduct(){
        mouseHoverToElement(vinylIdolzProduct);
    }

    public void clickOnAddToCartButtonOfvinylIdolzProduct(){
        clickOnMouseHoverElement(addtoCartOnVinylIdolzProduct);
    }



    public List<Double> getTheListOfProductPrice(){
        List<WebElement> originalPriceList = getTheListOfElement(productPrice);
        //create the list object
        List<Double> PriceList = new ArrayList();
        //remove $ sign and add the shortpricelist
        //add all web element value to list object
        for (WebElement element : originalPriceList) {
            String name = element.getText();
            PriceList.add(Double.valueOf(name.replace("$", "")));
        }
        return PriceList;
    }

    public void clickOnPriceHighToLowFilter() throws InterruptedException {
        Thread.sleep(3000);
        clickOnMouseHoverElement(priceHighToLow);
    }

    public List<String> getTheListOfProductName(){
        List<WebElement> originalPriceList = getTheListOfElement(produceName);
        //create the list object
        List<String> ProductName = new ArrayList();
        //add all web element value to list object
        for (WebElement element : originalPriceList) {
            ProductName.add(element.getText());
        }
        return ProductName;
    }

    public void clickOnNameZToAFilter() throws InterruptedException {
        Thread.sleep(3000);
        clickOnMouseHoverElement(nameZtoA);
    }

    public List<String> getProductRateStarList(){
        List<WebElement> originalPriceList = getTheListOfElement(productRate);
        //create the list object
        List<String> RateOfProduct = new ArrayList();
        //add all web element value to list object
        for (WebElement element : originalPriceList) {
            RateOfProduct.add(String.valueOf(element.getAttribute("style")));
        }
        return RateOfProduct;
    }

    public void clickOnProductRateFilter() throws InterruptedException {
        Thread.sleep(3000);
        clickOnMouseHoverElement(selectRate);
    }


}
