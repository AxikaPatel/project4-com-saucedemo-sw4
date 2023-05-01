package com.saucedemo.utilites;

import com.saucedemo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser
{

    //This method will send text to element
    public void sendTextToElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //This method will get text from element
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //This method will click on element
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //This method verify the text with element
    public boolean verifyText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }



}
