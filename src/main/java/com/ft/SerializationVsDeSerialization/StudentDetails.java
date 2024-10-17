package com.ft.SerializationVsDeSerialization;

import java.io.Serializable;

public class StudentDetails implements Serializable {
    int id;
    String name;

    public StudentDetails(int id, String name){
        this.id = id;
        this.name = name;
    }
}
