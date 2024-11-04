package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTests {

    @Test(groups = {"registration", "smoke"})
    public void registration1(){
        System.out.println("registration1");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        Assert.assertTrue(false);
    }

    @Test(groups = {"registration", "regression"})
    public void registration2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }

    @Test(groups = {"registration", "smoke", "regression", "paymentUpdating"})
    public void registration3(){
        System.out.println("Smoke3");
        Assert.assertTrue(false);
    }

    @Test(groups = {"regression", "registration"})
    public void registration4(){
        System.out.println("Smoke4");
        Assert.assertEquals(2,2);
    }
}
