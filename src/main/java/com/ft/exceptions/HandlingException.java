package com.ft.exceptions;

public class HandlingException {

    public static void main(String[] args) {
        int a=5, b=0;
        int[] c = {1,2,4,5,6};
        try{
            b = a/1;
            System.out.println(c[5]);

        }catch (ArithmeticException  ae){
            System.out.println(ae.toString());
            b = a/1;
        } catch (ArrayIndexOutOfBoundsException aie){
            System.out.println(aie.toString());
            System.out.println(c[4]);
        }
        System.out.println("b ::" + b );
    }
}
