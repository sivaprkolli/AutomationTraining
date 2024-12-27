package com.ft.AutomationTestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage {
    private SeleniumActions seleniumActions;

    public SauceLoginPage(WebDriver driver){
        seleniumActions = new SeleniumActions(driver);
    }

    private By userNameInputBox = By.cssSelector("#user-name");
    private By passwordInputBox = By.cssSelector("[data-test='password']");
    private By loginButton = By.cssSelector("[value='LOGIN']");

    public void login(String username, String password){
        seleniumActions.enterValue(userNameInputBox, username);
        seleniumActions.enterValue(passwordInputBox, password);
        seleniumActions.clickOnElement(loginButton);
    }

}
