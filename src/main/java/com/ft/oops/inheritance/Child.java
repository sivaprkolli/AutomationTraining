package com.ft.oops.inheritance;

public class Child extends Parent {

    public static void main(String[] args) {

        // inheritance - relationship
        Child child = new Child();
        int c = child.a;
        child.test1();
        test2();

        // Without inheritance - no relationship
        Parent parent = new Parent();
        int b = parent.a;
        parent.test1();
        Parent.test2();

        //parent1.test1();
    }
}
