package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CalenderExampleTest extends BaseSelenium {

    String year = "2025";
    String month = "August";
    String date = "15";

    @Test
    public void selectDates() {
        driver.get("https://www.makemytrip.com/");
        WebElement closeButton = driver.findElement(By.cssSelector("[data-cy=\"closeModal\"]"));
        closeButton.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement departureDate = driver.findElement(By.cssSelector("[for=\"departure\"]"));
        jse.executeScript("arguments[0].click()", departureDate);
/*
        List<WebElement> years = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'2025')]"));
        WebElement month = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]"));
        WebElement date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]/../following-sibling::div[@class=\"DayPicker-Body\"]/descendant::p[not(@class)]"));
*/
        WebElement nextButton = driver.findElement(By.cssSelector("[aria-label='Next Month']"));

        while (true) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'" + year + "')]")).size() > 0) {
                System.out.println(year + " found");
                break;
            } else {
                    nextButton.click();
            }
        }

        while (true) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]")).size() > 0) {
                System.out.println(month + " found");
                break;
            } else {
                nextButton.click();
            }
        }

        String dateXpath = "//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div[@class='DayPicker-Body']/descendant::p[text()='"+date+"']";
        WebElement date = driver.findElement(By.xpath(dateXpath));
        date.click();
        List<WebElement> fullDate = driver.findElements(By.xpath("//p[@data-cy='departureDate']/span[text()]"));
        List<String> dateInfo = new ArrayList<>();

        for (int i=0; i< fullDate.size(); i++){
            dateInfo.add(fullDate.get(i).getText());
        }
        System.out.println(dateInfo);
    }
}
