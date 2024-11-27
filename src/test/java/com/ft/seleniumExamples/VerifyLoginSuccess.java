package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginSuccess {
    public WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        driver  = new ChromeDriver();
    }

    @Test
    public void verifySuccessMessage(){
       driver.get("https://www.saucedemo.com/");
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("seleniumTest");
       driver.findElement(By.cssSelector("#password")).sendKeys("Test@123");
       driver.findElement(By.cssSelector("[type='submit']")).click();

       String errorMessage = driver.findElement(By.tagName("h3")).getText();
       System.out.println(errorMessage);
       Assert.assertEquals(errorMessage, "sadface: Username and password do not match any user in this service");
    }

    @AfterTest
    public void killSession(){
        driver.close();
    }
}
