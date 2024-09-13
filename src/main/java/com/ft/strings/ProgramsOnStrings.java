package com.ft.strings;

public class ProgramsOnStrings {

    public static void main(String[] args) {
        //getSpecificStringFromGivenString();
        //reverseAString();
        //reverseAString("malayalam");
        //getDuplicateCharactersFromString("java java");
        //getMaxValue();
        getVowelsFromString();
    }

    public static void getSpecificStringFromGivenString() {
        String s = "Your payment is completed and cashback $10 will be credited back to your account";

        int indexOfDollar = s.indexOf('$');
        System.out.println("indexOfDollar :: " + indexOfDollar);

        String stringFromDollar = s.substring(indexOfDollar);
        System.out.println(stringFromDollar);

        int indexOfSecondString = stringFromDollar.indexOf("will");
        System.out.println("indexOfSecondString :: " + indexOfSecondString);

        System.out.println(stringFromDollar.substring(0, indexOfSecondString));

    }

    public static void reverseAString() {
        String s = "selenium";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        for (int j = s.length() - 1; j >= 0; j--) {
            System.out.print(s.charAt(j));
        }
    }

    public static void reverseAString(String s) {
        char[] ch = s.toCharArray(); // {'a','b','c','d'}

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void getDuplicateCharactersFromString(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);
                }
            }
        }
    }

    public static void getMaxValue() {
        int[] a = {11, 44, 66, 22, 88, 33, 0, 99, 777, 111};
        int max = a[0];

        for(int i=0; i<a.length; i++){

            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }

    public static void getVowelsFromString(){
        String s = "webdriverio";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                System.out.println(s.charAt(i));
            }
        }
    }

}
