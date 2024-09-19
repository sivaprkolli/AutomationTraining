package com.ft.exceptions;

public class Verifications {
    static String s = "Selenium";

    public static void main(String[] args) {

        if (s.equalsIgnoreCase("selenium")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        boolean b = verifyMessage(null);
        System.out.println("b :: " + b);
    }

    // todo
    public static boolean verifyMessage(String message) {
        try {
            return message.equals("selenium");
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
