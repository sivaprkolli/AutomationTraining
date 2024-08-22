package com.ft.oops.accessMofiers2;

import com.ft.oops.accessModifiers.AMTest1;

public class AMTest3 {
    public static void main(String[] args) {
        AMTest1 amTest1 = new AMTest1();

        // this is outside package and can be access only public variables/methods
        amTest1.test1();
        System.out.println(amTest1.a);
    }
}
