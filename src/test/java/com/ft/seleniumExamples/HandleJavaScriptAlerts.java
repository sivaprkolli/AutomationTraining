package com.ft.seleniumExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleJavaScriptAlerts extends BaseSelenium {
    Alert alert;

    @BeforeClass
    public void initialize() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.switchTo().alert()
    }

    @Test
    public void verifyJSAlert() {
        WebElement jsAlertButton = driver.findElement(By.cssSelector("[onclick^='jsAlert']"));
        jsAlertButton.click();
        driver.switchTo().alert().accept();

        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Result')]/following-sibling::p"));
        Assert.assertTrue(result.getText().contains("clicked"));
    }

    @Test
    public void verifyJSConfirmAlert(){
        WebElement jsAlertButton = driver.findElement(By.cssSelector("[onclick^='jsConfirm']"));
        jsAlertButton.click();
        driver.switchTo().alert().dismiss();
        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Result')]/following-sibling::p"));
        Assert.assertTrue(result.getText().contains("Cancel"));
    }

}
