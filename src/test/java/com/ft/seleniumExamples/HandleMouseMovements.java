package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleMouseMovements extends BaseSelenium{
    SeleniumActions seleniumActions;

    @BeforeClass
    public void initializePages(){
        seleniumActions = new SeleniumActions();
    }

    @Test
    public void verifyDynamicDropDownIsHandled() throws InterruptedException {
        driver.get("https://thesoftwarepractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement parentElement = driver.findElement(By.xpath("(//li/a[text()='Industries'])[2]"));

        WebElement childElement = driver.findElement(By.xpath("(//a[text()='Transportation'])[2]"));

        Actions action = new Actions(driver);
        action.moveToElement(parentElement);
        action.perform();
        action.click(childElement);
        action.perform();
        action.release();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".title"), "TRANSPORTATION"));

        Assert.assertEquals(driver.getTitle(), "TSP : Industries - Transportation");

    }

    @Test
    public void verifyDragAndDropFunctionality() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement leftSideBox = driver.findElement(By.cssSelector("#column-a"));
        WebElement rightSideBox = driver.findElement(By.cssSelector("#column-b"));

        Actions action = new Actions(driver);
        action.dragAndDrop(rightSideBox, leftSideBox);
        action.pause(Duration.ofSeconds(1));
        //action.release();
        action.perform();
        //action.build();
        System.out.println("");
    }

    @Test
    public void verifyDragAndDropFunctionality1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement leftSideBox = driver.findElement(By.cssSelector("#column-a"));
        WebElement rightSideBox = driver.findElement(By.cssSelector("#column-b"));

        Actions actions = new Actions(driver);
        Action dragAndDrop = actions.clickAndHold(leftSideBox)
                        .moveToElement(rightSideBox)
                                .release(rightSideBox).build();
        System.out.println("");
    }
}
