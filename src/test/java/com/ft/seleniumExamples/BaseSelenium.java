package com.ft.seleniumExamples;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class BaseSelenium {
    public WebDriver driver;

    //@BeforeSuite
    public void launchBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String, String> map = new HashMap<>();
        map.put("download.default_directory", System.getProperty("user.dir")+"/downloads");
        chromeOptions.setExperimentalOption("prefs", map);
        driver  = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @BeforeSuite
    public void launchBrowser1(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        HashMap<String, String> map = new HashMap<>();
//        map.put("download.default_directory", System.getProperty("user.dir")+"/downloads");
//        chromeOptions.setExperimentalOption("prefs", map);
        driver  = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterSuite
    public void killSession(){
        //driver.close();
        driver.quit();
    }

    @BeforeTest
    public void verifyDeleteButtons() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @AfterMethod
    public void takeScreenshotWhenTestFails(ITestResult iTestResult) throws IOException {
        if (ITestResult.FAILURE == 2){
            getScreenShot();
        }

    }

    public void getScreenShot() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir")+"/screenshots/image.png");
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
