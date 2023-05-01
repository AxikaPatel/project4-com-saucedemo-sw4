package com.saucedemo.pages;

import com.saucedemo.utilites.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility
{
    By productText = By.linkText("Products");
    By productList = By.xpath("//div[@class='inventory_item']");

    public String verifyText()
    {
        return getTextFromElement(productText);
    }

    public int verifyProductList()
    {
        List<WebElement> number = driver.findElements(productList);
        return number.size();
    }
}
