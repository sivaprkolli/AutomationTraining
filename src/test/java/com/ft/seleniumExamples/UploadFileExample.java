package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileExample extends BaseSelenium{

    /**
     * Test case name, define parameters
     */
    @Test
    public void upLoadFile(){
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        chooseFileButton.sendKeys(System.getProperty("user.dir")+"/exceptions.txt");
        driver.findElement(By.id("file-submit")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".example>h3")).getText(), "File Uploaded!");
    }
}
