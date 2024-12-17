package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingSwitchingFrames extends BaseSelenium{

    @Test
    public void verifySwitchingToChildFrames(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));


       // webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name='frame-top']")));
        webDriverWait.until(ExpectedConditions
                .frameToBeAvailableAndSwitchToIt(By.cssSelector("[name='frame-top']")));

        //driver.switchTo().frame("frame-top");
        webDriverWait.until(ExpectedConditions
                .frameToBeAvailableAndSwitchToIt("frame-left"));
        //driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//body[normalize-space()='LEFT']")))).isDisplayed();

        driver.switchTo().parentFrame();
        webDriverWait.until(ExpectedConditions
                .frameToBeAvailableAndSwitchToIt(By.cssSelector("[name='frame-right']")));

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//body[normalize-space()='RIGHT']")))).isDisplayed();

    }


    @Test
    public void switchToAnotherFrame(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions
                .frameToBeAvailableAndSwitchToIt(By.cssSelector("[name='frame-top']")));
        webDriverWait.until(ExpectedConditions
                .frameToBeAvailableAndSwitchToIt("frame-left"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//body[normalize-space()='LEFT']")))).isDisplayed();

       // driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//body[normalize-space()='BOTTOM']")))).isDisplayed();
    }
}
