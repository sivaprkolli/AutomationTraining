package com.ft.oops.abstraction;

public class InterfaceImplementation implements InterfaceSample{

    @Override
    public void login() {
        System.out.println("Login");
    }

    @Override
    public void register() {
        System.out.println("Register");
    }
}
