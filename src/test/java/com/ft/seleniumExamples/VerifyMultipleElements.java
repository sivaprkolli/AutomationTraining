package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerifyMultipleElements {

    //Correct
    public VerifyMultipleElements(){

    }

    // Wrong
    public void VerifyMultipleElements(){

    }

    public WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        driver  = new FirefoxDriver();
    }

    @AfterTest
    public void killSession(){
        driver.close();
    }

    @Test
    public void verifyDeleteButtons(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick^='addElement']"));

        for (int i=0; i<5; i++){
            addButton.click();
        }

        List<WebElement> deleteButtons = driver.findElements(By.cssSelector(".added-manually"));

        System.out.println("deleteButtons :: " + deleteButtons);

        List<String> deleteButtonsText = new ArrayList<>();

        System.out.println("No: of delete buttons :: " + deleteButtons.size());
        int numberOfButtons = deleteButtons.size();
        Assert.assertEquals(numberOfButtons, 5);

        for (int i=0; i<numberOfButtons; i++){
           deleteButtonsText.add(deleteButtons.get(i).getText());
        }
        System.out.println(deleteButtonsText);

        Set<String> deleteButtonsTextMessage = new HashSet<>(deleteButtonsText);
        System.out.println(deleteButtonsTextMessage);
    }


    @Test
    public void verifyMultipleElementsWhenElementNotFound(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.cssSelector("button[onclick^='addElement']"));

        for (int i=0; i<5; i++){
            //addButton.click();
            //clickOnAddButton();
            clickOnElement(addButton);
        }

        String addButtonText = getTextMessage(addButton);
        System.out.println(addButtonText);
        Assert.assertEquals(addButtonText, "Add Element");

        List<WebElement> deleteButtons = driver.findElements(By.cssSelector(".added-manually"));

        System.out.println("deleteButtons :: " + deleteButtons.size());
        System.out.println("deleteButtons List :: " + deleteButtons);

        driver.findElement(By.cssSelector(".added-manually")).click();
        driver.findElements(By.cssSelector(".added-manually")).get(0).click();
    }

    public void clickOnAddButton(){
        driver.findElement(By.cssSelector("button[onclick^='addElement']")).click();
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public String getButtonText(){
        return driver.findElement(By.cssSelector("button[onclick^='addElement']")).getText();
    }
    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public WebElement getElement(){
        return driver.findElement(By.cssSelector("button[onclick^='addElement']"));
    }

    public List<WebElement> getAllElements(){
        return driver.findElements(By.cssSelector(".added-manually"));
    }



}
