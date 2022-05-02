package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckOutPage extends Utility {
    By secureCheckOutText = By.xpath("//h1[contains(text(),' Secure Checkout')]");
    By firstNameField = By.id("shippingaddress-firstname");
    By lastNameField = By.id("shippingaddress-lastname");
    By addressField = By.id("shippingaddress-street");
    By countryField = By.id("shippingaddress-country-code");
    By stateField =By.id("shippingaddress-custom-state");
    By createProfileCheckBox= By.id("create_profile");
    By passwordField = By.id("password");
    By deliveryMethod = By.id("method128");
    By paymentMethod = By.id("pmethod6");
    By totalAmount = By.xpath("//div[@class=\"total clearfix\"]/descendant::span[@class=\"value\"]/descendant::span[@class=\"surcharge-cell\"]/child::span");
    By placeOrderButton = By.xpath("//button[contains(@class,'btn regular-button regular-main-button place-order submit')]");

    public String getVerifySecureCheckOutText(){
        return getTextFromElement(secureCheckOutText);
    }

    public void enterFirstName(String text){
        sendTextToElement(firstNameField,text);
    }

    public void enterLastName(String text){
        sendTextToElement(lastNameField,text);
    }
    public void enterAddressName(String text){
        sendTextToElement(addressField,text);
    }

    public void selectCountryFromDropDown(String text){
        selectByValueFromDropDown(countryField,text);
    }

    public void enterstate(String text){
        sendTextToElement(stateField,text);
    }

    public void clickOnCreateProfileCheckBox(){
        clickOnElement(createProfileCheckBox);
    }
    public void enterPassword(String text){
        sendTextToElement(passwordField,text);
    }

    public void clickOnDeliveryMethodOption() throws InterruptedException {
        WebElement LocalShipping = findElementsOnBrowser(deliveryMethod);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", LocalShipping);

    }

    public void clickOnPaymentMehtodOption() throws InterruptedException {
        Thread.sleep(10000);
        clickOnElement(paymentMethod);
    }

    public String getVerifyTotalAmount(){
        List<WebElement> actualTotalList = getTheListOfElement(totalAmount);
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

    public void clickOnPlaceOrderButton() throws InterruptedException {
        Thread.sleep(10000);
        clickOnElement(placeOrderButton);

    }

}
