package com.ft.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            String s = null;
            s = s.concat("Test");
            System.out.println(s);
            File file = new File("Test.xlsx");
            FileInputStream fileInputStream = new FileInputStream(file);

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException are) {
            are.printStackTrace();
        } catch (IndexOutOfBoundsException ie) {
            ie.printStackTrace();
        } catch (ArithmeticException re) {
            re.printStackTrace();
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println("NullPointerException");
        } catch (Exception ae) {
            ae.printStackTrace();
            System.out.println("Exception");
        }
    }
}
