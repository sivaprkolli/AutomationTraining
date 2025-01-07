package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

    @Test
    public void uploadFileUsingRobotClass() throws AWTException, InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFileButton = driver.findElement(By.cssSelector("[id=\"drag-drop-upload\"]"));
       chooseFileButton.click();

        Robot robot = new Robot();
        StringSelection file = new StringSelection(System.getProperty("user.dir") + "\\downloads\\SOLID_IMP.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
    }
}
