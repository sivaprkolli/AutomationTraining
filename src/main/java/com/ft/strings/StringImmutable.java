package com.ft.strings;

public class StringImmutable {

    public static void main(String[] args) {
        String s = "Selenium";
        //s = s + " Automation";
        s.concat(" Automation");
        System.out.println(s);

        String s1;
        //s1 = s+" Test";
        s1 = s.concat(" Test Automation");
        System.out.println("s1 :: "+ s1);

        String s2 = new String("Playwright");
        String s3;
        s3 = s2.concat(" Automation");
        System.out.println(s3);
    }
}
