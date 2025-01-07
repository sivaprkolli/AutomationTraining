package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SVGElements extends BaseSelenium{

    @Test
    public void handleSVGElement(){

        driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
        driver.findElement(By.cssSelector("#UppyImageUploader")).click();
        driver.findElement(By.xpath("//div[text()='My Device']/preceding-sibling::*[name()='svg']")).click();
    }
}
