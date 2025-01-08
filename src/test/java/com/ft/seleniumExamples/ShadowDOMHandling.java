package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShadowDOMHandling extends BaseSelenium {

    @Test
    public void handleShadowRootElement(){
        driver.get("https://books-pwakit.appspot.com/");

        SearchContext shadowRootElement = driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
//        WebElement element = driver.findElement(By.xpath(""));
//        element.findElement(By.xpath("")).click();
        shadowRootElement.findElement(By.cssSelector("[aria-label=\"Search Books\"]")).sendKeys("Selenium");

    }

    @Test
    public void handleShadowRootElementUsingJS(){
        driver.get("https://books-pwakit.appspot.com/");
        WebElement shadowRootElement = driver.findElement(By.cssSelector("[apptitle='BOOKS']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement showRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowRootElement);
        showRoot.findElement(By.cssSelector("[aria-label=\"Search Books\"]")).sendKeys("Selenium");
    }
}
