package com.ft.testNG;

import org.testng.annotations.*;

import static org.testng.TestRunner.PriorityWeight.priority;

public class BaseTest {

    @BeforeSuite
    public void beforeAllAnnotations(){
        System.out.println("beforeAllAnnotations");
        // WebDriver/Playwright initialization, //browser launch
        // Report initialization
        // DB connections
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
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
        System.out.println("afterAllClasses");
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
