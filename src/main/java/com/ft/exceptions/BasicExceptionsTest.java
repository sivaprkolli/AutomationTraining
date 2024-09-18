package com.ft.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BasicExceptionsTest {
    public static void main(String[] args) {

        try {
            int a = 5, c = 0;
            int b = a / c;
            System.out.println("Test Pass");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Test Fail");
            System.out.println("Arthematic Exception");
        }
        getFile();
        System.out.println("Test Automation");
    }

    public static void getFile() {
        File file = new File("Test.xlsx");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            //throw new FileNotFoundException("Please provide right file path");
        }
    }
}
