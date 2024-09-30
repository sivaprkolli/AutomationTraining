package com.ft.collectionFramework;

import java.util.*;

public class ArrayListTest {
     // Array vs ArrayList
    /*
     - Size
     - type of elements/data type
     - adding elements, add()
     - get()
     */

    public static void main(String[] args) {
        List collection = new ArrayList();
        System.out.println(collection);
        System.out.println(collection.size());

        List list1 = new ArrayList();
        list1.add("Selenium");
        list1.add('H');
        list1.add(true);
        list1.add(7);
        list1.add("Appium");
        list1.add(2.45);

        System.out.println(list1);
        System.out.println(list1.get(4));
        System.out.println(list1.remove(5));
        System.out.println(list1);
        System.out.println(list1.remove("Selenium"));
        System.out.println(list1);

        System.out.println(list1.indexOf("Appium"));
        System.out.println(list1.lastIndexOf(true));

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
       // list2.remove(6);

        List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("Playwright");
        list.add("WebDriverIO");
        list.add( "Appium");
        list.add("Selenium");
        list.add("Selenium");
        list.add("Selenium");
        list.add("Selenium");

        /*System.out.println(list);
        list.add(0, "RestAssured");
        System.out.println(list);*/

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("****************");
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<String> list4 = Arrays.asList("RestAssured","RestSharp","Pynt","Ruby");

        list.addAll(list4);
        System.out.println(list);




    }
}
