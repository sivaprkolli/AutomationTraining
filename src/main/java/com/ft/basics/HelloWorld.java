package com.ft.basics;

public class HelloWorld {

    static int a;
    static String s;

    /**
     * public - access modifier
     * static - object not required to call method/variables
     * void - returns nothing
     * main - Engine
     * @param args
     */
    // Static variables/Blocks will be loaded before object creation
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test1();
        test2();
    }

    public void test1(){
        System.out.println("Automation Testing");
    }

    public static void test2(){
        System.out.println("Selenium Testing");
    }

    static {
        System.out.println("Java Learning");
        System.out.println(s);
        System.out.println(a);
    }

}
