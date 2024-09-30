package com.ft.collectionFramework;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        Queue queue = new LinkedList();

        list.add("Selenium");
        list.add("Playwright");
        list.add("WebDriverIO");
        list.add( "Appium");

        System.out.println(list);
        System.out.println(list.size());

        list.add(1, "TestCafe");

        System.out.println(list);
        System.out.println(list.indexOf("TestCafe"));
    }
}
