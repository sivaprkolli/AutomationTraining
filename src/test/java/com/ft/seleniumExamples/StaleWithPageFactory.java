package com.ft.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StaleWithPageFactory {

    public StaleWithPageFactory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user-name")
    WebElement usernameInputBox;

    @FindBy(how = How.ID, using = "user-name")
    WebElement submit;

    public void typeValue(){
        usernameInputBox.sendKeys("Selenium");
    }
}
