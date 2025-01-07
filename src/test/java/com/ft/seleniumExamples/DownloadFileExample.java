package com.ft.seleniumExamples;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class DownloadFileExample extends BaseSelenium {


    @Test
    public void downloadFile() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.cssSelector("[href='download/SOLID_IMP.pdf']")).click();

        Thread.sleep(3000);
        File file = new File(System.getProperty("user.dir")+"/downloads/SOLID_IMP.pdf");
        Assert.assertTrue(file.exists());
        file.delete();
    }
}
