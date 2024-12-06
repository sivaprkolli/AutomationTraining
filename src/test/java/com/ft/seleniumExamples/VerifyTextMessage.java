package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTextMessage {

    WebDriver driver;
    String trendingHeading = "SELLING OUT";

    @Test
    public void verifySubTextUsingMainText() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.prettylittlething.com/multi-christmas-tree-bow-oversized-knitted-christmas-jumper.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();
        //WebElement trendingCountMessage = driver.findElement(By.xpath("//strong[text()='"+trendingHeading+"']/parent::div/following-sibling::div"));
        WebElement trendingCountMessage = driver.findElement(By.xpath("//strong[@class='font-brand-medium']/../following-sibling::div"));
        String trendingCount = trendingCountMessage.getText();
        System.out.println("trendingCount :: " + trendingCount);
        String[] trendingActual =  trendingCount.split(" ");

        Assert.assertEquals(Integer.parseInt(trendingActual[0]), 126);
    }
}
