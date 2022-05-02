package com.cart_x.mobile.testsuite.shopping;

import com.cart_x.mobile.pages.*;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    LoginAccountPage loginAccountPage = new LoginAccountPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    YourOrderPage yourOrderPage = new YourOrderPage();
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnbestSellerLinkTab();
        //	1.3 Verify the text “Bestsellers”
        String expectedBestSellerText = "Bestsellers";
        String actualBestSellerText = bestSellerPage.getVerifyBestSellerText();
        Assert.assertEquals(expectedBestSellerText,actualBestSellerText);
        //	1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSellerPage.mouseHoverOnSortByDropDown();
        bestSellerPage.clickOnNameAToZFilter();
        //	1.5 Click on “Add to cart” button of the product “Apple Iphone Product”
        bestSellerPage.mouseHoverOnProductAppleIphoneProduct();
        //click on add to cart button
        bestSellerPage.clickOnAddToCartButtonOfAppleIphoneProduct();
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedAddToCartSuccessText = "Product has been added to your cart";
        String actualAddToCartSuccessText = bestSellerPage.getVerifyAddToCartSuccessText();
        Assert.assertEquals(expectedAddToCartSuccessText,actualAddToCartSuccessText);
        //1.7 Click on X sign to close the message
        bestSellerPage.clickOnCloseButtonOfAddToCartMessage();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellerPage.clickOnYourCartButtonIcon();
        bestSellerPage.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedViewCartText = "Your shopping cart - 1 item";
        String actualViewCartText = addToCartPage.getVerifyViewCartText();
        Assert.assertEquals(expectedViewCartText,actualViewCartText);
        //1.10 Verify the Subtotal $99.00
        String expectedSubTotal = "$299.00";
        String actualSubTotal = addToCartPage.getVerifySubTotal();
        Assert.assertEquals(expectedSubTotal,actualSubTotal);
        //1.11 Verify the total $106.23
        String expectedTotal = "$309.73";
        String actualTotal = addToCartPage.getVerifyTotal();
        Assert.assertEquals(expectedTotal,actualTotal);
        //1.12 Click on “Go to checkout” button
        addToCartPage.clickOnGoToCheckOutButton();
        //1.13 Verify the text “Log in to your account”
        String expectedLoginAccountText = "Log in to your account";
        String actualLoginAccountText = loginAccountPage.getVerifyLoginAccountText();
        Assert.assertEquals(expectedLoginAccountText,actualLoginAccountText);
        //1.14 Enter Email address
        loginAccountPage.enterEmailAddress("patel475889@gamil.com");
        //1.15 Click on “Continue” Button
        loginAccountPage.clickOnContinueButton();
        //1.16 Verify the text “Secure Checkout”
        String expectedSecureCheckOutText = "Secure Checkout";
        String actualSecureCheckOutText = checkOutPage.getVerifySecureCheckOutText();
        Assert.assertEquals(expectedSecureCheckOutText,actualSecureCheckOutText);
        //1.17 Fill all the mandatory fields
        checkOutPage.enterFirstName("john");
        checkOutPage.enterLastName("sena");
        checkOutPage.enterAddressName("katheirn road");
        checkOutPage.selectCountryFromDropDown("GB");
        checkOutPage.enterstate("england");
        //1.18 Check the check box “Create an account for later use”
        checkOutPage.clickOnCreateProfileCheckBox();
        //1.19 Enter the password
        checkOutPage.enterPassword("patel12345");
        //1.20 Select the Delivery Method to “Local Shipping”
        checkOutPage.clickOnDeliveryMethodOption();
        //1.21 Select Payment Method “COD”
        checkOutPage.clickOnPaymentMehtodOption();
        //1.22 Verify the total $99.00
        String expectedTotalAmount = "$311.03";
        String actualTotalAmount = checkOutPage.getVerifyTotalAmount();
        Assert.assertEquals(expectedTotalAmount,actualTotalAmount);
        //1.23 Click on “Place Order” Button
        checkOutPage.clickOnPlaceOrderButton();
        //1.24 Verify the text “Thank you for your order”
        String expectedSuccessOrderText = "Thank you for your order";
        String actualSuccessOrderText = yourOrderPage.getVerifySuccessOrderText();
        Assert.assertEquals(expectedSuccessOrderText,actualSuccessOrderText);
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnbestSellerLinkTab();
        //	1.3 Verify the text “Bestsellers”
        String expectedBestSellerText = "Bestsellers";
        String actualBestSellerText = bestSellerPage.getVerifyBestSellerText();
        Assert.assertEquals(expectedBestSellerText,actualBestSellerText);
        //	1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSellerPage.mouseHoverOnSortByDropDown();
        bestSellerPage.clickOnNameAToZFilter();
        //	1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        bestSellerPage.mouseHoverOnvinylIdolzProduct();
        //click on add to cart button
        bestSellerPage.clickOnAddToCartButtonOfvinylIdolzProduct();
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedAddToCartSuccessText = "Product has been added to your cart";
        String actualAddToCartSuccessText = bestSellerPage.getVerifyAddToCartSuccessText();
        Assert.assertEquals(expectedAddToCartSuccessText,actualAddToCartSuccessText);
        //1.7 Click on X sign to close the message
        bestSellerPage.clickOnCloseButtonOfAddToCartMessage();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellerPage.clickOnYourCartButtonIcon();
        bestSellerPage.clickOnViewCartButton();
        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedViewCartText = "Your shopping cart - 1 item";
        String actualViewCartText = addToCartPage.getVerifyViewCartText();
        Assert.assertEquals(expectedViewCartText,actualViewCartText);
        //1.10 Click on “Empty your cart” link
        addToCartPage.clickOnEmptyCartButton();
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        String expectedEmptyCartAlertText = "Are you sure you want to clear your cart?";
        String actualEmptyCartAlertText = addToCartPage.getVerifyAlertMessageOfEmptyCart();
        Assert.assertEquals(expectedEmptyCartAlertText,actualEmptyCartAlertText);
        //1.12 Click “Ok” on alert
        addToCartPage.acceptAlertOfEmptyCart();
        //1.13 Verify the message “Item(s) deleted from your cart”
        String expectedEmptyCartMessage = "Item(s) deleted from your cart";
        String actualEmptyCartMessage = addToCartPage.getVerifyEmptyCartMessage();
        Assert.assertEquals(expectedEmptyCartMessage,actualEmptyCartMessage);
        //1.14 click on "close" sign
        addToCartPage.clickOnCloseButton();
        //1.15 Verify the text “Your cart is empty”
        String expectedYourCartMessage = "Your cart is empty";
        String actualYourCartMessage = addToCartPage.getVerifyYourEmptyCartMessage();
        Assert.assertEquals(expectedYourCartMessage,actualYourCartMessage);
    }


}
