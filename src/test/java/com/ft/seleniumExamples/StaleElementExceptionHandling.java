package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StaleElementExceptionHandling extends BaseSelenium{

    @Test
    public void staleWithPageFactory(){
        driver.get("https://www.saucedemo.com/");
        StaleWithPageFactory staleWithPageFactory = new StaleWithPageFactory(driver);
        staleWithPageFactory.typeValue();
        driver.navigate().refresh();
        staleWithPageFactory.typeValue();
    }


    @Test
    public void handleStale(){
        driver.get("https://www.saucedemo.com/");
        WebElement userId = driver.findElement(By.id("user-name"));
        userId.clear();
        userId.sendKeys("Selenium");

        driver.navigate().refresh();
        try {
            userId.sendKeys("Selenium");
        }catch (StaleElementReferenceException ste){
            System.out.println("Stale handled");
            driver.findElement(By.id("user-name")).sendKeys("Appium");
        }
    }
}
