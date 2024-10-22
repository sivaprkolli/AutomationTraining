package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends AnnotationsInTestNG{

    @Test(priority = 1)
    public void verifyLoginSuccess(){
        System.out.println("Enter userName and password");
        System.out.println("Click on Login button");
        Assert.assertEquals(5,5);
    }

    @Test
    public void verifyUnSuccessfulLogin(){
        System.out.println("Enter inValid userName and valid password");
        System.out.println("Click on Login button");
        Assert.assertEquals("Enter valid email", "Enter valid email");
    }

    @Test(priority = 2)
    public void verifySocialMediaLinksPresent(){
        Assert.assertEquals(3,3);
    }

    @Test(priority = 3)
    public void addProductsToCart(){
        System.out.println("Add Product to cart");
        Assert.assertEquals("Product1","Product1");
    }

}
