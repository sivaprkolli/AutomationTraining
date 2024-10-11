package com.ft.functionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceTest fit = new FunctionalInterfaceTest() {
            public void registration(int i ,int j){
                System.out.println("sum :: "+ (i+j));
            }
        };

        fit.registration(10, 10);
    }
}
