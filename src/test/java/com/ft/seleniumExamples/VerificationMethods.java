package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class VerificationMethods {

    WebDriver driver;

    @Test
    public void verificationsInSelenium(){
        driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
        System.out.println(driver);
        WebElement headerOfTheHomePage = driver.findElement(By.cssSelector(".login_logo"));
        System.out.println(headerOfTheHomePage);
        boolean isDisplayedHeadingOfTheHomePage = headerOfTheHomePage.isDisplayed();
        System.out.println(isDisplayedHeadingOfTheHomePage);

        driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        WebElement mainServicesAgreementCheckBox = driver.findElement(By.cssSelector("#SubscriptionAgreement"));

        boolean isSelectedMSAgreement = mainServicesAgreementCheckBox.isSelected();
        System.out.println("Before isSelectedMSAgreement :: " + isSelectedMSAgreement);

        WebElement uiCheckBox = driver.findElement(By.xpath("//a[text()='Main Services Agreement']/../preceding-sibling::div"));
        uiCheckBox.click();

        // locators for above checkbox
        //input[@id='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']
        //#SubscriptionAgreement + .checkbox-ui

        boolean isSelectedMSAgreementAfterClick = mainServicesAgreementCheckBox.isSelected();
        System.out.println("Before isSelectedMSAgreementAfterClick :: " + isSelectedMSAgreementAfterClick);
    }


    @Test
    public void isElementEnabled() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.prettylittlething.com/multi-christmas-tree-bow-oversized-knitted-christmas-jumper.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();

        WebElement addToBagButton = driver.findElement(By.id("add-to-bag-button"));
        boolean getStatusOdAddToBagButton = addToBagButton.isEnabled();
        System.out.println("getStatusOfAddToBagButton :: " + getStatusOdAddToBagButton);
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//span[text()='M']"));
        size.click();

        System.out.println("addToBagButton status :: " + addToBagButton.isEnabled());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
