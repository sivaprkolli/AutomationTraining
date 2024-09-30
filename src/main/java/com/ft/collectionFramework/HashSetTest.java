package com.ft.collectionFramework;

import java.util.*;

public class HashSetTest {
    /**
     * insertion order
     * duplicates
     * get method/ indexing
     *
     * @param args
     */

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Selenium");
        set.add("TestCafe");
        set.add("Playwright");
        set.add("WebDriverIO");
        set.add("TestCafe");
        set.add( "Appium");
        set.add("Playwright");
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);

        System.out.println(set.size());
        set.add("RestAssured");
        System.out.println(set);

        System.out.println("##########################");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object s: set){
            System.out.println(s);
        }

        System.out.println("**********************");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Selenium");
        linkedHashSet.add("Playwright");
        linkedHashSet.add("Playwright");
        linkedHashSet.add("WebDriverIO");
        linkedHashSet.add("TestCafe");
        linkedHashSet.add("TestCafe");
        linkedHashSet.add( "Appium");
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(null);


        System.out.println(linkedHashSet);

        System.out.println("**********************");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Selenium");
        treeSet.add("Playwright");
        treeSet.add("WebDriverIO");
        treeSet.add("TestCafe");
        treeSet.add( "Appium");
        System.out.println(treeSet);
    }
}
