package com.ft.collectionFramework;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        int[] a = {1,55,11,44,88,110,99};

       // Arrays.sort(a);
        Arrays.parallelSort(a);

        for (int i=0; i<a.length; i++){
            System.out.print(" ");
            System.out.print(a[i]);
        }

        String[] s = {"test", "estt", "ttes", "etts"};

        for (int i=0; i<s.length; i++){

            String s2 = new String(sortString(s[i]));
            System.out.println();
            System.out.println(s2);
            if (s2.equals("estt")){
                System.out.println("Test Pass");
            } else{
                System.out.println("Test Fail");
            }
        }
    }

    public static char[] sortString(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println();
        for (char c:ch){
            System.out.print(" ");
            System.out.print(c);
        }
        return ch;
    }
}
