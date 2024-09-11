package com.ft.strings;

public class StringsMethods {

    public static void main(String[] args) {
        String s = "Hello Java";
        String s1 = "";
        char c = 'A';

        String s2 = "Test@123";
        String s3 = "ABCDwxyz1234$%^&*";

        System.out.println(s.substring(0,5));
        System.out.println(s.substring(6));

        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());

        System.out.println(s.indexOf('J'));
        System.out.println(s.indexOf("J"));
        System.out.println(s.indexOf("J", 1)); // need to check

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s2.replaceAll("[A-Z]", ""));
        System.out.println(s2.replaceAll("[0-9]", ""));

        System.out.println(s3.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(s3.replaceAll("[A-Za-z]", ""));
        System.out.println(s3.replaceAll("[^A-Za-z0-9]", ""));

        System.out.println(s3.replaceAll("$","!")); // need to check
    }
}
