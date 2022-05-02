package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class YourOrderPage extends Utility {

    By successOrderText = By.xpath("//h1[contains(text(),'Thank you for your order')]");


    public String getVerifySuccessOrderText(){
        return getTextFromElement(successOrderText);
    }


}
