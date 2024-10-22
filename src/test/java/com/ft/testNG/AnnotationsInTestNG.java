package com.ft.testNG;

import org.testng.annotations.*;

public class AnnotationsInTestNG {

    @Test
    public void simpleTest(){
        System.out.println("simpleTest");
    }

    @Test
    public void loginTest(){
        System.out.println("loginTest");
    }

    @BeforeSuite
    public void beforeAllAnnotations(){
        System.out.println("beforeAllAnnotations");
        // WebDriver/Playwright initialization, //browser launch
        // Report initialization
        // DB connections
    }

    @AfterSuite
    public void afterAllAnnotations(){
        System.out.println("afterAllAnnotations");
        // WebDriver session quit
        // Report close
        // DB close
    }

    @BeforeTest
    public void beforeAllClasses(){
        System.out.println("beforeAllClasses");
        // open application
    }

    @AfterTest
    public void afterAllClasses(){
        System.out.println("beforeAllClasses");
        // WebDriver session close
    }

    @BeforeClass
    public void beforeEachClass(){
        System.out.println("beforeEachClass");
        // objects/pages initialization
    }

    @AfterClass
    public void afterEachClass(){
        System.out.println("afterEachClass");
    }

    @BeforeMethod
    public void beforeEachTest(){
        System.out.println("beforeEachMethod");
        // Report structure
    }

    @AfterMethod
    public void afterEachTest(){
        System.out.println("afterEachMethod");
        // if test failed capture log and screenshot
    }

}
