package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class HandleSwitchingWindows extends BaseSelenium{

    @Test
    public void verifySwitchingWindow() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String parentWindowId = driver.getWindowHandle();

        System.out.println("parentWindow :: "  +parentWindowId);

        Set<String> allWindowIds = driver.getWindowHandles();
        System.out.println("allWindowIds :: " + allWindowIds);

        for (String window: allWindowIds){
            driver.switchTo().window(window);
        }

        Thread.sleep(3000);
        WebElement newWindowText = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(newWindowText.isDisplayed());
        driver.close();
        driver.switchTo().window(parentWindowId);
        Assert.assertTrue(clickHereLink.isDisplayed());
    }
}
