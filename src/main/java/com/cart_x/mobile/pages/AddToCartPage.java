package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCartPage extends Utility {

    By viewCartVerifyText = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By subTotal = By.xpath("//ul[@class='totals']/li[1]/child::span/descendant::span[@class='surcharge-cell']/child::span");
    By total = By.xpath("//ul[@class='totals']/li[4]/child::span/descendant::span[@class='surcharge-cell']/child::span");
    By goToCheckOutButton = By.xpath("//li[@class=\"button main-button\"]/child::button");
    By emptyCartButton = By.xpath("//a[contains(text(),'Empty your cart')]");
    By emptyCartMessage = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By closeButton = By.cssSelector(".close");
    By yourCartEmptyMessage = By.xpath("//h1[contains(text(),'Your cart is empty')]");

    public String getVerifyViewCartText(){
        return getTextFromElement(viewCartVerifyText);
    }

    public String getVerifySubTotal(){
        List<WebElement> actualSubTotalList = getTheListOfElement(subTotal);
        //create the object of stringbuilder
        StringBuilder strbulTotal = new StringBuilder();
        for(WebElement totalList : actualSubTotalList)
        {
            //append all the list in strbul
            strbulTotal.append(totalList.getText());
        }
        //coverted the stringbuilder to string
        String actualSubTotal = strbulTotal.toString();
        return actualSubTotal;
    }

    public String getVerifyTotal(){
        List<WebElement> actualTotalList = getTheListOfElement(total);
        //create the object of stringbuilder
        StringBuilder strbulTotal = new StringBuilder();
        for(WebElement totalList : actualTotalList)
        {
            //append all the list in strbul
            strbulTotal.append(totalList.getText());
        }
        //coverted the stringbuilder to string
        String actualTotal = strbulTotal.toString();
        return actualTotal;
    }

    public void clickOnGoToCheckOutButton(){
        clickOnElement(goToCheckOutButton);
    }

    public void clickOnEmptyCartButton(){
        clickOnElement(emptyCartButton);
    }

    public String getVerifyAlertMessageOfEmptyCart(){
        return getTextFromAlert();
    }

    public void acceptAlertOfEmptyCart(){
        acceptAlert();
    }

    public String getVerifyEmptyCartMessage(){
        return getTextFromElement(emptyCartMessage);
    }

    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }

    public String getVerifyYourEmptyCartMessage(){
        return getTextFromElement(yourCartEmptyMessage);
    }

}
