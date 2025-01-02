package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyErrorMessages {

    WebDriver driver;
    String lastNameErrorMessage = "Enter your last name";
    String jobTitleErrorMessage = "Select your title";

    @Test
    public void verifyErrorMessage(){
        driver = new FirefoxDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement startMyFreeTrailButton = driver.findElement(By.cssSelector(".form_submit_button.submitButton"));
        startMyFreeTrailButton.click();

        //WebElement errorMessageOfLastNameInputBox = driver.findElement(By.cssSelector("span[id^='UserLastName']"));
        WebElement errorMessageOfLastNameInputField = driver.findElement(By.xpath("//label[starts-with(@for,'UserLastName')]/following-sibling::span"));
        String actualErrorMessage = errorMessageOfLastNameInputField.getText();
        System.out.println("actualErrorMessage :: " + actualErrorMessage);
        Assert.assertEquals(actualErrorMessage, lastNameErrorMessage);

        WebElement jobTitleDropDownErrorMessage = driver.findElement(By.xpath("//span[text()='"+jobTitleErrorMessage+"']"));
        Assert.assertTrue(jobTitleDropDownErrorMessage.isDisplayed());
    }


    @Test
    public void verifyErrorMessages(){
        driver = new FirefoxDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement startMyFreeTrailButton = driver.findElement(By.cssSelector(".form_submit_button.submitButton"));
        startMyFreeTrailButton.click();

        System.out.println(getErrorMessage("Phone"));

        List<String> labels = new ArrayList<>();
        labels.add("First name");
        labels.add("Last name");
        labels.add("Email");
        labels.add("Job Title");
        labels.add("Company");
        labels.add("Employees");
        labels.add("Phone");

        List<String> expectedErrorMessages = Arrays.asList("Enter your first name", "Enter your last name", "Enter a valid email address", "Select your title", "Enter your company name", "Select the number of employees", "Enter a valid phone number");
        List<String> actualErrorMessages = new ArrayList<>();

        for (int i=0; i<labels.size(); i++){
            actualErrorMessages.add(getErrorMessage(labels.get(i)));
        }

        System.out.println(actualErrorMessages);

        Assert.assertEquals(actualErrorMessages, expectedErrorMessages);
    }

    public String getErrorMessage(String field){
        return driver.findElement(By.xpath("//label[normalize-space(text())='"+field+"']/following-sibling::span")).getText();
    }

    @AfterClass
    public void killSession(){
        driver.quit();
    }
}
