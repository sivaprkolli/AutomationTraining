package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest{

    @Test
    public void smoke1(){
        System.out.println("Smoke1");
        Assert.assertTrue(false);
    }

    @Test
    public void smoke2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }
}
