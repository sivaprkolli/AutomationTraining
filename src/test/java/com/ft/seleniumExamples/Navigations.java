package com.ft.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Navigations {
    WebDriver driver;

    @Test
    public void navigationsInSelenium(){
       driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println("Title :: " + title);
        Assert.assertEquals(title,"Swag Labs", "Both titles are not same");

        String url = driver.getCurrentUrl();
        System.out.println("URL :: " + url);
        Assert.assertEquals(url,"https://www.saucedemo.com/", "Both urls are not same");

        driver.navigate().to("https://the-internet.herokuapp.com/abtest");
        String title1 = driver.getTitle();
        Assert.assertEquals(title1, "The Internet");

        driver.navigate().back();
        Assert.assertEquals(title,"Swag Labs", "Both titles are not same");

        driver.navigate().forward();
        Assert.assertEquals(title1, "The Internet");

        driver.navigate().refresh();
        Assert.assertEquals(title1, "The Internet");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
