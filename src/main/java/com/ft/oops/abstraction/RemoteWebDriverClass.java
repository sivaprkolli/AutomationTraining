package com.ft.oops.abstraction;

public class RemoteWebDriverClass implements WebDriverInterface{
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void sendKeys() {
        System.out.println("Type");
    }
}
