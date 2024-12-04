package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyCheckBox {

    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyCheckBoxIsSelected() {
       // System.setProperty("webdriver.chrome.driver", ".exe path");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        boolean checkBoxBefore = driver.findElement(By.xpath("(//form[@id='checkboxes']/input)[1]")).isSelected();
        System.out.println("checkBoxBefore :: " + checkBoxBefore);
        driver.findElement(By.xpath("(//form[@id='checkboxes']/input)[1]")).click();
        boolean checkBoxAfter = driver.findElement(By.xpath("(//form[@id='checkboxes']/input)[1]")).isSelected();
        System.out.println("checkBoxAfter :: " + checkBoxAfter);
    }

    @AfterTest
    public void killSession() {
        driver.close();
    }
}
