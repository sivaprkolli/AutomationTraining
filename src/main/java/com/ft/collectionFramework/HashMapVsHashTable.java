package com.ft.collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapVsHashTable {

    public static void main(String[] args) {
        Map<Integer, String> studentData = new HashMap<>();
        studentData.put(1, "Akhil");
        studentData.put(2, "Brain");
        studentData.put(3, "Catherine");
        studentData.put(4, "Danny");
        studentData.put(5, "Eagle");
//        studentData.put(null, null);
//        studentData.put(null, null);
        studentData.put(5, "Harry");
        studentData.put(5, "Ferry");

        System.out.println(studentData);

        System.out.println("*********************************");

        Map<Integer, String> studentData1 = new Hashtable<>();
        studentData1.put(1, "Akhil");
        studentData1.put(2, "Brain");
        studentData1.put(3, "Catherine");
        studentData1.put(4, "Danny");
        studentData1.put(5, "Eagle");
        studentData1.put(5, "Ferry");
        studentData1.put(5, "Ferry");
        studentData1.put(5, "Ferry");


        System.out.println(studentData1);


    }
}
