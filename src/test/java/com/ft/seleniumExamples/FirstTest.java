package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class FirstTest {

    public void launchBrowser() {

        //WebDriver chromeDriver1 = new WebDriver();
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();
        WebDriver safariDriver = new SafariDriver();

        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
        safariDriver.quit();
    }

    @Test
    public void loginToSauceDemo() {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.saucedemo.com/");
        try {
            chromeDriver.findElement(By.id("")).sendKeys("standard_user");
            Thread.sleep(2000);
            chromeDriver.findElement(By.name("password")).sendKeys("secret_sauce");
            Thread.sleep(3000);
            chromeDriver.findElement(By.id("login-button")).click();
        } catch (NoSuchElementException nse) {
        } catch (InvalidSelectorException ise) {
        } catch (InterruptedException e) {
        }
        chromeDriver.quit();
    }
}
