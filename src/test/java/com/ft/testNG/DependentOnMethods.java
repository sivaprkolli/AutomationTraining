package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentOnMethods {

    @Test(priority = 0)
    public void login(){
        System.out.println("Login Success");
        Assert.assertEquals(1,1);
    }

    @Test(dependsOnMethods = "login")
    public void enterSourceAndDestinations(){
        System.out.println("Source and Destination");
    }

    @Test(dependsOnMethods = "enterSourceAndDestinations")
    public void selectSeats(){
        System.out.println("Select seats");
    }

    @Test(dependsOnMethods = {"login", "selectSeats"})
    public void payment(){
        System.out.println("Payment success");
    }

    @Test(dependsOnMethods = "payment")
    public void verifyTicket(){
        System.out.println("Verify Ticket");
        Assert.assertEquals(1,2);
    }
}
