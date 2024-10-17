package com.ft.basics;

public class Casting {

    public static void main(String[] args) {
        String s = "5";
        int i = Integer.parseInt(s);
        String s1 = String.valueOf(i);
        System.out.println(s1);
        System.out.println((i+5));
        System.out.println(s+5);

        float f = 1.2f;
        int a = (int)f;

        System.out.println(a);
        byte b = (byte)a;
        double d = (double) b;
        System.out.println(d);

    }
}
