package com.ft.oops.accessModifiers;

public class AMTest1 {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void test1() {
        System.out.println("Test1");
    }

    private void test2() {
        System.out.println("Test2");
    }

    protected void test3() {
        System.out.println("Test3");
    }

    void test4() {
        System.out.println("Test4");
    }

    public static void main(String[] args) {
        AMTest1 amTest1 = new AMTest1();
        int c = amTest1.b;
        amTest1.test2();
    }
}
