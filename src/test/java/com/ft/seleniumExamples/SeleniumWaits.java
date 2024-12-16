package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits extends BaseSelenium {

    @Test
    public void usageImplicitWait() throws InterruptedException {
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Accept All']")).click();
        WebElement addToBagButton = driver.findElement(By.id("add-to-bag-button"));
        boolean getStatusOdAddToBagButton = addToBagButton.isEnabled();
        System.out.println("getStatusOfAddToBagButton :: " + getStatusOdAddToBagButton);

        Thread.sleep(3000);
        WebElement size = driver.findElement(By.xpath("//span[text()='M']"));
        size.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        System.out.println("addToBagButton status :: " + addToBagButton.isEnabled());
        Assert.assertTrue(addToBagButton.isEnabled());
    }

    @Test
    public void usageOfWebDriverWait(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().window().maximize();

        //Explicit wait or conditional wait
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept All']"))).click();

       // driver.findElement(By.xpath("//button[text()='Accept All']")).click();
        WebElement addToBagButton = webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-bag-button"))));
        boolean getStatusOdAddToBagButton = addToBagButton.isEnabled();
        System.out.println("getStatusOfAddToBagButton :: " + getStatusOdAddToBagButton);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='M']"))).click();
//        WebElement size = driver.findElement(By.xpath("//span[text()='M']"));
//        size.click();

        System.out.println("addToBagButton status :: " + addToBagButton.isEnabled());
        Assert.assertTrue(addToBagButton.isEnabled());
    }


}
