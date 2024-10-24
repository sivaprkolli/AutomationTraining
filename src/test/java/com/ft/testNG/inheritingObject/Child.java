package com.ft.testNG.inheritingObject;

import org.testng.annotations.Test;

public class Child extends Parent{

    @Test
    public void simpleTest(){
        parent.login();
    }
}
