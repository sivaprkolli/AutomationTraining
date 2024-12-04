package com.ft.oops.abstraction;


import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void automationTesting(){
        WebDriverInterface wdI = new ChromeDriverClass();
        wdI.click();
        wdI.sendKeys();
    }

}
