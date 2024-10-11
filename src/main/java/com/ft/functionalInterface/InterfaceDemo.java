package com.ft.functionalInterface;

public class InterfaceDemo {


    public static void main(String[] args) {
        InterfaceTest1 it1 = (int i) ->
        {
            System.out.println("payment");

        };

        it1.payment(10);
    }
}
