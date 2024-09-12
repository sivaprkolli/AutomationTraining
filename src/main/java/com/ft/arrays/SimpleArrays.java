package com.ft.arrays;

import java.util.Arrays;

public class SimpleArrays {

    // fixed size and same data type
    public static void main(String[] args) {
        String[] s= {"Selenium", "Playwright"}; // prefer this
        String s1[]= {"Selenium", "Playwright"}; // correct but
        String s2 = "WebDriverIO";

        char ch1 = 'D';
        char[] ch = {'E','s','p','r','e','s','s','o'};
        Arrays.sort(ch);

        int[] a = {33,55,99,66,44,22,11};

        int[] b = new int[5];
        int[] c = new int[]{33,55,99,66,44,22,11};

        System.out.println(ch.length);
        System.out.println(s.length);
        System.out.println(s2.length());

        boolean[] b2 = {true, false, true, true, false};

        int[][] d =
                {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}

                };

        System.out.println(d[0][0]);
        System.out.println(d[0][1]);
        System.out.println(d[0][2]);
        System.out.println(d[0][3]);



    }
}
