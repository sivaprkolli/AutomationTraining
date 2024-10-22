package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTests extends BaseTest{

    @Test
    public void regression1(){
        System.out.println("regression1");
        Assert.assertEquals(1,2);
    }

    @Test
    public void regression2(){
        System.out.println("regression2");
        Assert.assertTrue(true);
    }
}
