package com.ft.basics;

public class DataTypes {
    // Primitive datatype - int, float, boolean, double, char,long, short, byte
    // Non-Primitive datatype - String , Classes, Interfaces

    Integer i = new Integer(5);
    String s = "Selenium"; // s - global variable
    String s1 = new String("Appium");

    public void test1(){
        System.out.println(s);
    }

    public String test2(){
        return "Playwright";
    }

    public int total(){
        return 5;
    }

    public boolean decide(){
        return true;
    }

    public static void main(String[] args) {
        int i = 9;
        String s = "Java"; // s - local/method level
        DataTypes dataTypes = new DataTypes();
        dataTypes.test1();

        String p = dataTypes.test2();
        System.out.println(p);

        System.out.println(i+i);
        String s1 = dataTypes.s;
        System.out.println(dataTypes.s);
        System.out.println(s);

        boolean b = dataTypes.decide();
        System.out.println(b);
        System.out.println(dataTypes.total());
    }

}
