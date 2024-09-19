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

    public void multipleExceptionInSameCatchBlock(){
        try{
            int a=5;
            int b = a/0; // ArithmeticException
            int[] c = {1,2,4};
            System.out.println(c[5]); // ArrayIndexOutOfBoundsException
        }catch (ArithmeticException | IndexOutOfBoundsException exception){
            System.out.println(exception.toString());
        }
    }
}
