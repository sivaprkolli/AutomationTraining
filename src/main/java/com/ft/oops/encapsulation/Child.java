package com.ft.oops.encapsulation;

public class Child {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setId(30);
        parent.setName("Vizag");

        System.out.println(parent.getId());
        System.out.println(parent.getName());
    }
}
