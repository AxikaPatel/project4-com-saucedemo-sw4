package com.saucedemo.pages;

import com.saucedemo.utilites.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By userNameField = By.xpath("//input[@name='user-name']");
    By passwordField= By.xpath("//input[@name='password']");
    By clickOnLogin = By.xpath("//input[@id='login-button']");

    //Enter “standard_user” username
    public void enterUserName(String username)
    {
        sendTextToElement(userNameField,username);
    }

    //Enter “secret_sauce” password
    public void enterPassword(String password)
    {
         sendTextToElement(passwordField,password);
    }

    // Click on ‘LOGIN’ button
    public void clickOnLoginButton()
    {
        clickOnElement(clickOnLogin);
    }





}
