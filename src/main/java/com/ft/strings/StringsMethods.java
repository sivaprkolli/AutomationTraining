package com.ft.strings;

import org.apache.commons.lang3.StringUtils;


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

        System.out.println(s3.replaceAll("\\$","!"));
        System.out.println(s3.replace("$","!"));

        String s4 = "           Mobile Automation ";
        String s5 = "Mobile Automation";
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
        String s6 = s4.trim();
        System.out.println(s6.length());
        System.out.println(s5.length());
        System.out.println( s6.equals(s5));


        char[] ch = {'A','p','p','i','u','m'};
        String s7 = new String(ch);
        System.out.println(s7);

        String s9 = "           Mobile Automation ";
        System.out.println(s9.length());
        System.out.println(StringUtils.normalizeSpace(s9).length());
        System.out.println(StringUtils.normalizeSpace(s9) == s5);// false
    }
}
