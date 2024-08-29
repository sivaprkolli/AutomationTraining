package com.ft.oops.polymorphism;

public class Child extends Parent{

    @Override
    public void register(){
        System.out.println("Test register");
        int a = 10, b= 20, c;
        c = a+b;
        System.out.println(c);
    }
}
