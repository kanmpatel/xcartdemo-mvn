package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LoginAccountPage extends Utility {

    By loginAccountText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailAddressField = By.id("email");
    By continueButton = By.xpath("//td[@class='buttons-row']/child::button");
    public String getVerifyLoginAccountText(){
        return getTextFromElement(loginAccountText);
    }

    public void enterEmailAddress(String text){
        sendTextToElement(emailAddressField,text);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }


}
