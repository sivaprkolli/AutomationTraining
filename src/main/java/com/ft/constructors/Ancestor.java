package com.ft.constructors;

public class Ancestor {

    public Ancestor(){
        System.out.println("Ancestor Constructor");
    }

    public Ancestor(String s){
        System.out.println("Ancestor Constructor :: " + s);
    }

    public Ancestor(int a, int b){
        System.out.println(a+b);
    }
}
