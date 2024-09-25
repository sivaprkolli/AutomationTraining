package com.ft.basics;

public class DataTypesAndMethods {

    public int a1 = 20;
    public static int a = 10;
    public static int b;
    public static String s = "Selenium";
    public static String s1 = "Playwright";
    public String s2;
    public boolean b1;
    public double d1;
    public char c1;
    public byte b2;
    public float f1;

    public static void main(String[] args) {
        DataTypesAndMethods dataTypesAndMethods = new DataTypesAndMethods();
        int a1 = dataTypesAndMethods.a1 + 20;
        System.out.println(a1);
        int d = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("**********************************************");
        System.out.println(b);
        System.out.println(dataTypesAndMethods.s2);
        System.out.println(dataTypesAndMethods.b1);
        System.out.println(dataTypesAndMethods.d1);
        System.out.println(dataTypesAndMethods.c1);
        System.out.println(dataTypesAndMethods.b2);
        System.out.println(dataTypesAndMethods.f1);
    }

    public void test2(){
        System.out.println("Testing");
        test1();
    }

    public static void test1(){
        System.out.println(a);
    }
}
