package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest extends AnnotationsInTestNG {

    // Automation Framework
    // Test Automation Framework - TestNG

  /*  public static void main(String[] args) {
        System.out.println("Test");
        new SimpleTest().test1();
        new SimpleTest().test2();
        new SimpleTest().test4();
        new SimpleTest().test3();
    }*/

    @Test
    public void webAutomation(){
        System.out.println("Selenium");
        Assert.assertTrue(3>2);
        Assert.assertEquals(1,1);
    }

    @Test(enabled = false)
    public void apiAutomation(){
        System.out.println("RestAssured");
    }

    @Test
    public void java(){
        System.out.println("Java");
    }

    @Test
    public void appTesting(){
        System.out.println("Postman");
    }

    @Test
    public void testNG(){
        System.out.println("TestNG");
    }

}
