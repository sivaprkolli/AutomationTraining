package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CalenderExampleTest extends BaseSelenium{

    @Test
    public void selectDates(){
        driver.get("https://www.makemytrip.com/");
        WebElement closeButton = driver.findElement(By.cssSelector("[data-cy=\"closeModal\"]"));


        List<WebElement> years = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'2025')]"));
        WebElement month = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]"));

        WebElement date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]/../following-sibling::div[@class=\"DayPicker-Body\"]/descendant::p[not(@class)]"));



    }


}
