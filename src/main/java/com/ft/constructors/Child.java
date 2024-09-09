package com.ft.constructors;

public class Child extends Parent{

    public Child(){
        System.out.println("Child Constructor");
    }

    public Child(String s){
        super("Appium");
        System.out.println("Child Constructor with parameter :: " + s);
    }

    public Child(int a, int b){
        super(a,b);
        System.out.println("");

    }

    public static void main(String[] args) {
//        Child child = new Child(); // all parents
//        Parent parent = new Child();// all parents
//        Parent parent1 = new Parent(); // all parents, if it's not having any parent class then it will execute itself

        Child child1 = new Child(10, 20);
    }
}
