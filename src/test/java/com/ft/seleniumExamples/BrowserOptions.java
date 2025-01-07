package com.ft.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BrowserOptions {

    @Test
    public void verifyChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();

        Map<String, String> map = new HashMap<>();
        map.put("deviceName","iPhone SE");
        //chromeOptions.setExperimentalOption("mobileEmulation", map);
        chromeOptions.setBrowserVersion("129");
        chromeOptions.setAcceptInsecureCerts(false);
        WebDriver driver = new ChromeDriver(chromeOptions);
        //driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.get("http://www.cacert.org/");
    }
}
