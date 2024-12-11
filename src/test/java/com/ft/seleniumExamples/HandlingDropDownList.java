package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandlingDropDownList extends BaseSelenium{

    @Test
    public void verifyDropDownSelectedValue(){
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        WebElement jobTitleDropDown = driver.findElement(By.cssSelector("select[id^=UserTitle]"));

        Select dropDown = new Select(jobTitleDropDown);
        dropDown.selectByValue("Marketing_PR_Manager_ANZ");
        dropDown.selectByIndex(4);
        dropDown.selectByVisibleText("Developer / Software Engineer");

        String selectedOption = dropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(selectedOption, "Developer / Software Engineer");

        List<WebElement> listOfOptions = dropDown.getOptions();

        WebElement numberOfEmpsList = driver.findElement(By.name("CompanyEmployees"));
        Select empSelect = new Select(numberOfEmpsList);

        List<WebElement> options = empSelect.getOptions();
        List<String> optionsText = new ArrayList<>();

        for (WebElement option: options){
            optionsText.add(option.getText());
        }
        System.out.println(optionsText);
    }

}
