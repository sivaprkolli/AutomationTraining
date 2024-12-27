package com.ft.AutomationTestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class FTBase {
    WebDriver driver;

    @BeforeSuite
    public void initializeDrivers(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/v1");
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }

}
