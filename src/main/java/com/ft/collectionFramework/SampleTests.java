package com.ft.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SampleTests {

    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println(a[6]);
        }catch (ArrayIndexOutOfBoundsException aei){
            System.out.println(aei.toString());
        }


        ArrayList arrayList = new ArrayList();
        try {
            System.out.println(arrayList.get(6));
        }catch (IndexOutOfBoundsException aei){
            System.out.println(aei.toString());
        }

        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(1);
//        ar.add(2);

        System.out.println(ar.indexOf(4));
        System.out.println(ar.contains(5));

        Iterator<Integer> it = ar.iterator();
        System.out.println(it.next());

        List list = Arrays.asList("Selenium", "4.24", "Appium", "2.15", "WebDriverIO", "7.12");

        List<Integer> integerList = Arrays.asList(11,99,66,33,44,22);





    }
}
