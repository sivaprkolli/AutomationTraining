package com.ft.oops.inheritance;

public class Parent {
    int a=10;
    static Parent parent;

    public void test1(){
        System.out.println("Test 1");
    }

    public static void test2(){
        System.out.println("Test 2");
    }

    public Parent(){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        parent = new Parent();
    }
}
