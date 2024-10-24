package com.ft.testNG.inheritingObject;

import org.testng.annotations.*;


public class Parent {
    public Parent parent;

    @BeforeSuite
    public void initializeObject(){
        parent = new Parent();
    }

    public void login(){
        System.out.println("Login Test");
    }
}
