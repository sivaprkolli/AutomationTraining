package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavascriptExecutorTests extends BaseSelenium {
    JavascriptExecutor jse;

    @BeforeClass
    public void initialize(){
        jse = (JavascriptExecutor) driver;
    }

    @Test
    public void clickUsingJS() {
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement acceptAllButton = driver.findElement(By.xpath("//button[text()='Accept All']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String eleClick = "arguments[0].click()";
        ((JavascriptExecutor) driver).executeScript(eleClick, acceptAllButton);
        WebElement addToBagButton = driver.findElement(By.id("add-to-bag-button"));
        boolean getStatusOdAddToBagButton = addToBagButton.isEnabled();
        System.out.println("getStatusOfAddToBagButton :: " + getStatusOdAddToBagButton);

        WebElement size = driver.findElement(By.xpath("//span[text()='S']"));
        ((JavascriptExecutor) driver).executeScript(eleClick, size);

        System.out.println("addToBagButton status :: " + addToBagButton.isEnabled());
    }

    @Test
    public void typeValueUsingJS() {
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        WebElement firstNameInput = driver.findElement(By.cssSelector("input[id^='UserFirstName']"));
        firstNameInput.clear();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String typeValueInElement = "arguments[0].value='Siva'";
        jse.executeScript(typeValueInElement, firstNameInput);
    }

    @Test
    public void changeAttributeValue(){
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        System.out.println(clickHereLink.getAttribute("target")); // deprecated in current version 4.27
        System.out.println(clickHereLink.getDomAttribute("target"));
        System.out.println(clickHereLink.getDomProperty("target"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String changeAttribute = "arguments[0].setAttribute('target','_self')";
        jse.executeScript(changeAttribute, clickHereLink);
        clickHereLink.click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".example>h3")).getText(), "New Window");
    }

    @Test
    public void scrollToElement(){
        driver.get("https://the-internet.herokuapp.com/");

        WebElement abtestLink = driver.findElement(By.cssSelector("[href*='abtest']"));
        WebElement editorLink = driver.findElement(By.cssSelector("[href*='forgot_password']"));

        // based on the pixel
        jse.executeScript("window.scrollBy(0,200)");

        // Bottom of the page
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        // scroll to the element
        jse.executeScript("arguments[0].scrollIntoView(true)", abtestLink);
    }

    @Test
    public void typeValueUsingJsId(){
        //document.getElementById("user-name")
        driver.get("https://www.saucedemo.com/");
        jse.executeScript("document.getElementById(\"user-name\").value='Selenium'");
        jse.executeScript("document.getElementById(\"password\").value='Selenium'");
        jse.executeScript("document.getElementById('login-button').click()");
    }

    @Test
    public void typeValueUsingQuerySelector(){
        driver.get("https://www.saucedemo.com/");
        jse.executeScript("document.querySelector('[name=\"user-name\"]').value=''");
        jse.executeScript("document.querySelector('[name=\"user-name\"]').value='Selenium'");
    }

    @Test
    public void getTestUsingJS() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        String heading = jse.executeScript("return document.querySelector('.login_logo').innerText").toString();
        System.out.println("heading :: " + heading);
        jse.executeScript("alert('Welcome to SDET Training by Siva')");
        System.out.println();
    }
}
