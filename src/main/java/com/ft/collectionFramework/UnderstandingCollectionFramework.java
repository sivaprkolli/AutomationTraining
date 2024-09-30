package com.ft.collectionFramework;

import com.microsoft.schemas.office.visio.x2012.main.SectionType;

import java.util.*;

public class UnderstandingCollectionFramework {

    public static void main(String[] args) {
        UnderstandingCollectionFramework un = new UnderstandingCollectionFramework();
        int[] aaa = new int[1];
        Integer aa = new Integer(4);
        String ss = new String("Selenium");

        int[] a = {1,2,3,4,5};
        System.out.println(a.length);

        int[] b = new int[5];

        System.out.println(a[4]); // 5
        System.out.println(b[4]); // 0 - default value

        int[][] c = new int[4][5];

        for(int i=0; i<4; i++){
            for (int j=0; j<5; j++){

                System.out.print(c[i][j]);
            }
            System.out.println();
        }

        String[] d = {"Selenium", "Appium", "WebDriverIO", "Playwright"};
        String[] e = new String[5];
        e[0] = "Selenium";
        e[1] = "Appium";
        System.out.println(e.length);

        System.out.println(e[4]);

        // [] person = {"Siva", "123", "QA", "Location"}

        Iterable iterable = new ArrayList();
        Collection collection = new ArrayList();

        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        System.out.println(collection);

        for (Object i : collection){
            System.out.println((Integer) i);
        }

        Collection<Integer> collection1 = new ArrayList();
        collection1.add(3);
        collection1.add(34);
        collection1.add(35);
        collection1.add(36);

        for (int i: collection1){
            System.out.println(i);
        }


        Set set = new HashSet();
        Set set1 = new LinkedHashSet();

        set.add("Selenium");
        set.add("Playwright");
        set.add("WebDriverIO");
        set.add( "Appium");

        System.out.println(set);






    }

}
