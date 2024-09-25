package com.ft.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowAndThrows {

    public static void main(String[] args) throws InterruptedException {

        useThrowKeyWord();

        Thread.sleep(1000);
        System.out.println("Test Automation");
        Thread.sleep(1000);
        try {
            getFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        getFile1();
    }

    public static void useThrowKeyWord() {
        try {
            int a = 0;
            int b = a / 0;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            throw new ArithmeticException("Please write correct math");
        }
    }

    public static void getFile() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("");
    }

    public static void getFile1() {

        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
