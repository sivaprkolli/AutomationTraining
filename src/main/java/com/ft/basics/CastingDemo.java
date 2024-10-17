package com.ft.basics;

public class CastingDemo {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        Child c = new Child();

        new Child().demo();
        new Child().demo1();

        Parent p1 = (Parent) new Child(); // upcasting
        p1.demo();

        // JavascriptExecutor jse = (JavaScriptExecutor) driver;
        Child c = (Child) p1; // down casting
        c.demo();
        c.demo1();
    }
}
