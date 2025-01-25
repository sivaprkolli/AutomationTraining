package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyColourOfTheElement extends BaseSelenium{

    @Test
    public void verifyColourOfTheElement() throws InterruptedException {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");

        WebElement logo = driver.findElement(By.cssSelector("[alt=\"Poco Electro\"]"));
        System.out.println(logo.getCssValue("color"));

        Color color = Color.fromString(logo.getCssValue("color"));
        String hexaCode = color.asHex();
        System.out.println("hexaCode :: " + hexaCode );
        Assert.assertEquals(hexaCode, "#0a848c");
    }
}
