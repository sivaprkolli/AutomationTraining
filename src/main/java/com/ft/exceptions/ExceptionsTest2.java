package com.ft.exceptions;

public class ExceptionsTest2 {
    public static void main(String[] args) {
        try{
            int[] c = {1,2,3};
            System.out.println(c[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.toString());
        } finally {
            System.out.println("Test finally");
        }
    }
}
