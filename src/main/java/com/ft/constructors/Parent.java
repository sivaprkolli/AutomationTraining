package com.ft.constructors;

public class Parent extends Ancestor{

    public Parent(){
        System.out.println("Parent Constructor");
    }

    public Parent(String s){
        System.out.println("Parent Constructor :: " + s);
    }

    public Parent(int  a, int b){
        super(a,b);
        System.out.println("Parent Constructor :: " + (a+b));
    }

}
