package com.ft.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class WebDriverCreation {

    @Test
    public void createObject(){
        //WebDriver driver = new SafariDriver();
        //WebDriver chromeDriver = new ChromeDriver();
        //ChromeDriver chromeDriver1 = new ChromeDriver();
        //FirefoxDriver firefoxDriver = new FirefoxDriver();
        RemoteWebDriver fireFoxDriver1 = new FirefoxDriver();
        WebDriver ff2 = new FirefoxDriver();
        ChromiumDriver cc = new EdgeDriver();
        RemoteWebDriver rc = new FirefoxDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
    }
}
