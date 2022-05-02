package com.cart_x.mobile.testsuite.homepage;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLinkTab();
        String expectedShippingText = "Shipping";
        String actualShippingText = homePage.getVerifyShippingText();
        Assert.assertEquals(expectedShippingText,actualShippingText);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLinkTab();
        String expectedNewText = "New arrivals";
        String actualNewText = homePage.getVerifyNewText();
        Assert.assertEquals(expectedNewText,actualNewText);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoonLinkTab();
        String expectedComingSoonText = "Coming soon";
        String actualComingSoonText = homePage.getVerifyComingSoonText();
        Assert.assertEquals(expectedComingSoonText,actualComingSoonText);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLinkTab();
        String expectedContactUsText = "Contact us";
        String actualContactUsText = homePage.getVerifyContactUsText();
        Assert.assertEquals(expectedContactUsText,actualContactUsText);
    }




}
