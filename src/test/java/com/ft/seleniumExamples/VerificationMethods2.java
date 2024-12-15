package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerificationMethods2 extends BaseSelenium{

    @Test
    public void isElementDisplayed(){
        driver.get("https://the-internet.herokuapp.com/");

        String s = "Test";
        WebElement abTestLink = driver.findElement(By.cssSelector("[href$='abtest']"));
//        abTestLink.click();
//        getAbTestLink().click();

        boolean abTestLinkIsDisplayed = abTestLink.isDisplayed();

        System.out.println("abTestLinkIsDisplayed :: " + abTestLinkIsDisplayed);

        Assert.assertTrue(abTestLinkIsDisplayed);

        System.out.println("********************************");
        System.out.println(abTestLink.getAttribute("href"));
        System.out.println(abTestLink.getDomProperty("href"));
        System.out.println(abTestLink.getDomAttribute("href"));
        System.out.println(abTestLink.getTagName());

        Assert.assertTrue(abTestLink.getDomProperty("href").equals("https://the-internet.herokuapp.com/abtest"));
        Assert.assertTrue(abTestLink.getDomAttribute("href").equals("/abtest"));
        Assert.assertEquals(abTestLink.getTagName(), "a");
    }

    @Test
    public void isElementSelected(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#checkboxes input"));
        List<WebElement> checkBoxesList = driver.findElements(By.xpath("(//form[@id='checkboxes']/input)"));

        WebElement checkBox1 =  driver.findElement(By.cssSelector("#checkboxes input"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//form[@id='checkboxes']/input)[2]"));

        System.out.println(checkBox2.isSelected());
        System.out.println(checkBox1.isSelected());

        System.out.println(checkBoxes);
        System.out.println(checkBoxes.size());
        System.out.println(checkBoxes.get(0));
        System.out.println(checkBoxes.get(1));
       // System.out.println(checkBoxes.get(2));

        System.out.println("*****************************");
        for (int i=0; i<checkBoxesList.size(); i++){
            System.out.println(checkBoxesList.get(i).isSelected());
        }

    }

    @Test
    public void isElementEnabled() throws InterruptedException {
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Accept All']")).click();


        WebElement addToCartButton = driver.findElement(By.cssSelector("button#add-to-bag-button"));
        System.out.println(addToCartButton.isEnabled());
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//span[text()='M']"));
        size.click();
        System.out.println(addToCartButton.isEnabled());
    }


    public List<WebElement> getCheckBoxes(){
        return driver.findElements(By.cssSelector("#checkboxes input"));
    }

    public WebElement getAbTestLink(){
        return driver.findElement(By.cssSelector("[href$='abtest']"));
    }

    public String getTest(){
        return "Test";
    }

}
