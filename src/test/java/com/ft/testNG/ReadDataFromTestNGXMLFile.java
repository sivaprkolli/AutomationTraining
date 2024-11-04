package com.ft.testNG;

import org.testng.annotations.*;

public class ReadDataFromTestNGXMLFile {

    @Parameters("browser")
    @BeforeSuite
    public void initializeBrowser(@Optional("firefox") String browserType){
        System.out.println("Browser name :: " + browserType);
    }

    @Parameters("appUrl")
    @BeforeTest
    public void launchApplication(@Optional("https://www.saucedemo.com/") String url){
        System.out.println("URL :: " + url);
    }

    @Parameters({"username", "password"})
    @Test
    public void login(@Optional("Selenium") String username, @Optional("Test@123") String password){
        System.out.println("Username :: " + username);
        System.out.println("Password :: " + password);
    }
}
