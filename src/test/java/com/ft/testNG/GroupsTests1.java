package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTests1 {

    @Test(groups = {"login", "smoke"})
    public void login1(){
        System.out.println("login1");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        Assert.assertTrue(false);
    }

    @Test(groups = {"login", "regression"})
    public void login2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }

    @Test(groups = {"login", "smoke", "regression", "paymentUpdating"})
    public void login3(){
        System.out.println("Smoke3");
        Assert.assertTrue(false);
    }

    @Test(groups = {"regression", "login", "paymentUpdating"})
    public void login4(){
        System.out.println("Smoke4");
        Assert.assertEquals(2,2);
    }
}
