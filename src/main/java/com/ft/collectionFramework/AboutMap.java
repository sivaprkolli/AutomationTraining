package com.ft.collectionFramework;

import java.util.*;

public class AboutMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("WebAT", "Selenium");
        map.put("MobileAT", "Appium");

        List list = new ArrayList<>();
        list.add("Selenium");
        list.add("Appium");

        System.out.println(list);

        System.out.println(map);
        System.out.println(map.get("MobileAT"));

        Map<Integer, String> studentData = new HashMap<>();
        studentData.put(1, "Akhil");
        studentData.put(2, "Brain");
        studentData.put(3, "Catherine");
        studentData.put(4, "Danny");
        studentData.put(5, "Eagle");

        System.out.println("************************");

        System.out.println(studentData);

        System.out.println(studentData.keySet());
        System.out.println(studentData.values());
        System.out.println(studentData.entrySet());

        String[] s = {"Rest", "Assured"};

        for (String s1: s){

        }

        for (Map.Entry m:studentData.entrySet()){
            System.out.println(m.getKey() + " :: " + m.getValue());
        }

        System.out.println("********");

        Iterator iterator = studentData.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(studentData.size());
        System.out.println(studentData.containsKey(5));
        System.out.println(studentData.containsKey(6));



    }
}
