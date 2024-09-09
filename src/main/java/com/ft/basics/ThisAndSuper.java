package com.ft.basics;

public class ThisAndSuper extends SuperParent {

    int a,b;
    String s;


    public void getA(int a){
        int b=0;
        this.b = b;
        this.a = a;
        this.s = "";
        this.getS();
    }

    public void getS(){
        System.out.println("S");
        super.superMethod();
        this.superMethod();
    }


    public void superMethod(){
        System.out.println("Super Child");
    }

}
