package com.ft.strings;

public class StringsComparisons {
    static String s = "Java";
    static String s0 = "java";
    static String s3 = "Java Automation";

    static String s1 = new String("Java");
    static String s2 = new String("Java");

    public static void main(String[] args) {
     boolean b = (s == s0);
     System.out.println(b);
     System.out.println(s == s0); // memory location/address
     System.out.println(s.equals(s0)); // value of the string
     System.out.println(s.equalsIgnoreCase(s0)); // true

     System.out.println(s.contains(s3)); // false
     System.out.println(s3.contains(s)); // true

     System.out.println(s3.startsWith("Java"));
     System.out.println(s3.endsWith("Automation"));
    }
}
