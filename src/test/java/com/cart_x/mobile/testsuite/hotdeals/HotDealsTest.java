package com.cart_x.mobile.testsuite.hotdeals;

import com.cart_x.mobile.pages.*;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    SalesPage salesPage = new SalesPage();

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “sales”  link and click
        homePage.clickOnSalesLinkTab();
        //	2.3 Verify the text “sales”
        String expectedSalesText = "Sale";
        String actualSalesText = salesPage.getVerifySalesText();
        Assert.assertEquals(expectedSalesText,actualSalesText);
        //2.4 Mouse hover on “Sort By” and select “price  to Low to High”
        //2.5 Verify that the product’s price arrange Low to High
        List<Double> expectedPriceListFilterByHighToLow = salesPage.getTheListOfProductPrice();
        Collections.sort(expectedPriceListFilterByHighToLow);

        salesPage.mouseHoverOnSortByDropDown();
        salesPage.clickOnPriceHighToLowFilter();
        Thread.sleep(3000);
        List<Double> actualPriceListFilterByHighToLow = salesPage.getTheListOfProductPrice();
        Assert.assertEquals(expectedPriceListFilterByHighToLow,actualPriceListFilterByHighToLow);

    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “sales”  link and click
        homePage.clickOnSalesLinkTab();
        //	2.3 Verify the text “sales”
        String expectedSalesText = "Sale";
        String actualSalesText = salesPage.getVerifySalesText();
        Assert.assertEquals(expectedSalesText,actualSalesText);
        //2.4 Mouse hover on “Sort By” and select “name a to z”
        //2.5 Verify that the product’s price arrange a to z
        List<String> expectedProductNameList = salesPage.getTheListOfProductName();
        Collections.sort(expectedProductNameList);
        salesPage.mouseHoverOnSortByDropDown();
        salesPage.clickOnNameZToAFilter();
        Thread.sleep(3000);
        List<String> actualProductNameList = salesPage.getTheListOfProductName();
        Assert.assertEquals(expectedProductNameList,actualProductNameList);

    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “sales”  link and click
        homePage.clickOnSalesLinkTab();
        //	2.3 Verify the text “sales”
        String expectedSalesText = "Sale";
        String actualSalesText = salesPage.getVerifySalesText();
        Assert.assertEquals(expectedSalesText,actualSalesText);
        //2.4 Mouse hover on “Sort By” and select “rate”
        //2.5 Verify that the product’s price arrange rate
        List<String> expectedProductRate = salesPage.getProductRateStarList();
        Collections.sort(expectedProductRate,Collections.reverseOrder());
        salesPage.mouseHoverOnSortByDropDown();
        salesPage.clickOnProductRateFilter();
        Thread.sleep(3000);
        List<String> actualProductRate = salesPage.getProductRateStarList();
        Assert.assertEquals(expectedProductRate,actualProductRate);

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnbestSellerLinkTab();
        //	2.3 Verify the text “Bestsellers”
        String expectedBestSellerText = "Bestsellers";
        String actualBestSellerText = bestSellerPage.getVerifyBestSellerText();
        Assert.assertEquals(expectedBestSellerText,actualBestSellerText);
        //2.4 Mouse hover on “Sort By” and select “price High to Low”
        //2.5 Verify that the product’s price arrange High to Low
        List<Double> expectedPriceListFilterByHighToLow = bestSellerPage.getTheListOfProductPrice();
        Collections.sort(expectedPriceListFilterByHighToLow,Collections.reverseOrder());

        bestSellerPage.mouseHoverOnSortByDropDown();
        bestSellerPage.clickOnPriceHighToLowFilter();
        Thread.sleep(3000);
        List<Double> actualPriceListFilterByHighToLow = bestSellerPage.getTheListOfProductPrice();
        Assert.assertEquals(expectedPriceListFilterByHighToLow,actualPriceListFilterByHighToLow);

    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnbestSellerLinkTab();
        //	2.3 Verify the text “Bestsellers”
        String expectedBestSellerText = "Bestsellers";
        String actualBestSellerText = bestSellerPage.getVerifyBestSellerText();
        Assert.assertEquals(expectedBestSellerText,actualBestSellerText);
        //2.4 Mouse hover on “Sort By” and select “name z to a”
        //2.5 Verify that the product’s price arrange z to a
        List<String> expectedProductNameList = bestSellerPage.getTheListOfProductName();
        Collections.sort(expectedProductNameList,Collections.reverseOrder());
        bestSellerPage.mouseHoverOnSortByDropDown();
        bestSellerPage.clickOnNameZToAFilter();
        Thread.sleep(3000);
        List<String> actualProductNameList = bestSellerPage.getTheListOfProductName();
        Assert.assertEquals(expectedProductNameList,actualProductNameList);

    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealsTab();
        //	2.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnbestSellerLinkTab();
        //	2.3 Verify the text “Bestsellers”
        String expectedBestSellerText = "Bestsellers";
        String actualBestSellerText = bestSellerPage.getVerifyBestSellerText();
        Assert.assertEquals(expectedBestSellerText,actualBestSellerText);
        //2.4 Mouse hover on “Sort By” and select “rate”
        //2.5 Verify that the product’s price arrange rate
        List<String> expectedProductRate = bestSellerPage.getProductRateStarList();
        Collections.sort(expectedProductRate,Collections.reverseOrder());
        bestSellerPage.mouseHoverOnSortByDropDown();
        bestSellerPage.clickOnProductRateFilter();
        Thread.sleep(3000);
        List<String> actualProductRate = bestSellerPage.getProductRateStarList();
        Assert.assertEquals(expectedProductRate,actualProductRate);

    }


}
