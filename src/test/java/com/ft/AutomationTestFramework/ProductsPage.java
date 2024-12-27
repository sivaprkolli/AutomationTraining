package com.ft.AutomationTestFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    SeleniumActions seleniumActions;
    public ProductsPage(WebDriver driver){
        seleniumActions = new SeleniumActions(driver);
    }

    By productsHeading = By.cssSelector(".product_label");

    public String getProductsPageHeading(){
        return seleniumActions.getTextMessage(productsHeading);
    }
}
