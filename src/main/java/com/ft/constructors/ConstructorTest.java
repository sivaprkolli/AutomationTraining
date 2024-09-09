package com.ft.constructors;

public class ConstructorTest {

    int a;

    public ConstructorTest(){
        System.out.println(a);
        System.out.println("Automation Testing");
    }

    public ConstructorTest(int a){
        System.out.println(a);
        System.out.println("Automation Testing");
    }

    public ConstructorTest(int a, int b){
        System.out.println(a+b);
        System.out.println("Automation Testing");
    }


    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest(5);
        ConstructorTest constructorTest1 = new ConstructorTest(5, 5);
    }

    public String testAuto(){
        return "Selenium";
    }
}
