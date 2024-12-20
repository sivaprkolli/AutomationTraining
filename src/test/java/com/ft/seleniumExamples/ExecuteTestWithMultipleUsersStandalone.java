package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExecuteTestWithMultipleUsersStandalone {
    WebDriver driver;
    WebDriverWait webDriverWait;
    @BeforeTest
    public void launchApplication(){
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }


    @DataProvider(name = "loginUsers")
    public Object[][] sauceUsers(){
        return new Object[][]  {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"}
        };
    }


    @Test (dataProvider = "loginUsers")
    public void verifySuccessMessage(String userName, String password){

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement passwordInputBox = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("[type='submit']"));

        By userNameInputField = By.xpath("//input[@placeholder='Username']");
        By passwordInputField = By.cssSelector("#password");
        By submitButton = By.cssSelector("[type='submit']");

        userNameInputBox.clear();
        enterValue(userNameInputBox, userName);
        passwordInputBox.clear();
        enterValue(passwordInputField, password);
        clickOnElement(loginButton);

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.title")));
        WebElement productsHeading = driver.findElement(By.cssSelector("span.title"));
        String productsPageHeading = getTextMessage(productsHeading);
        Assert.assertEquals(productsPageHeading, "Products");

        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
        clickOnElement(menu);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        clickOnElement(logoutLink);

    }

    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void enterValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public void enterValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

}
