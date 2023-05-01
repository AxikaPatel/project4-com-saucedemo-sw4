package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        loginPage.enterUserName("problem_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        //Verify the text “PRODUCTS”
        verifyText(driver, By.xpath("//span[@class='title']"),"Products");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage()
    {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();


        // Verify that six products are displayed on page
        int actualNumber = productsPage.verifyProductList();
        int expectedNumber = 6;
        Assert.assertEquals(actualNumber,expectedNumber);

    }

}
