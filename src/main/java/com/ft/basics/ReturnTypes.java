package com.ft.basics;

public class ReturnTypes {

    public static void main(String[] args) {
        ReturnTypes returnTypes = new ReturnTypes();

        returnTypes.sum(10000, 5000);
        int a = returnTypes.total(2009898, 25878);
        System.out.println(a);

        double d = returnTypes.total();
        System.out.println(d);

    }

    public void sum(){
        int a=5, b = 5, c;
        c = a+b;
        System.out.println(c);
    }

    public void sum(int a, int b){
        int c;
        c = a+b;
        System.out.println(c);
    }

    public int total(int a, int b){
        return a+b;
    }

    public double total(){
        return 9.9;
    }
}
