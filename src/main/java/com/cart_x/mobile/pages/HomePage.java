package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/child::a");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]/child::a");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]/child::a");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/child::a");

    By shippingText = By.xpath("//h1[contains(text(),'Shipping')]");
    By newText = By.xpath("//h1[contains(text(),'New arrivals')]");
    By comingSoonText = By.xpath("//h1[contains(text(),'Coming soon')]");
    By contactUsText = By.xpath("//h1[contains(text(),'Contact us')]");

    By hotdealsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");
    By bestSeller = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='bestsellers/']");
    By saleLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='sale_products/']");
    public void clickOnShippingLinkTab(){
        clickOnElement(shippingLink);
    }

    public void clickOnNewLinkTab(){
        clickOnElement(newLink);
    }
    public void clickOnComingSoonLinkTab(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsLinkTab(){
        clickOnElement(contactUsLink);
    }

    public String getVerifyShippingText(){

        return getTextFromElement(shippingText);
    }

    public String getVerifyNewText(){

        return getTextFromElement(newText);
    }

    public String getVerifyComingSoonText(){
        return getTextFromElement(comingSoonText);
    }

    public String getVerifyContactUsText(){
        return getTextFromElement(contactUsText);
    }

    public void mouseHoverOnHotDealsTab(){
        mouseHoverToElement(hotdealsLink);
    }

    public void clickOnbestSellerLinkTab(){
        clickOnMouseHoverElement(bestSeller);
    }

    public void clickOnSalesLinkTab(){
        clickOnMouseHoverElement(saleLink);
    }

}
