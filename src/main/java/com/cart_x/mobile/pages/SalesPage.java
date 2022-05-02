package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SalesPage extends Utility {

    By salesText = By.xpath("//h1[contains(text(),'Sale')]");
    By shortBy = By.xpath("//div[@class='sort-box']");
    By nameAToZ = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name A - Z')]");
    By priceLowToHigh = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Price Low - High')]");
    By selectRate =By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Rates')]");
    By productPrice = By.xpath("//ul[@class='products-grid grid-list']/child::li/child::div/descendant::span[@class='price product-price']");
    By produceName = By.xpath("//ul[@class='products-grid grid-list']/child::li/descendant::h5/child::a");
    By productRate = By.xpath("//div[@class='stars-row full']");

    public String getVerifySalesText(){
        return getTextFromElement(salesText);
    }

    public void mouseHoverOnSortByDropDown(){
        mouseHoverToElement(shortBy);
    }

    public void clickOnNameAToZFilter(){
        clickOnMouseHoverElement(nameAToZ);
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
        clickOnMouseHoverElement(priceLowToHigh);
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
        clickOnMouseHoverElement(nameAToZ);
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
