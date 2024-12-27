package com.ft.AutomationTestFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLoginTests extends FTBase{

    SauceLoginPage sauceLoginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void initializePages(){
        sauceLoginPage = new SauceLoginPage(driver);
        productsPage = new ProductsPage(driver);
    }


    @Test
    public void verifySuccessfulLogin(){
        sauceLoginPage.login("performance_glitch_user", "secret_sauce");
        Assert.assertEquals(productsPage.getProductsPageHeading(), "Products");
    }
}
