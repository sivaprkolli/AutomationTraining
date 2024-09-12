package com.ft.strings;

public class ProgramsOnStrings {

    public static void main(String[] args) {
        getSpecificStringFromGivenString();
    }

    public static void getSpecificStringFromGivenString(){
        String s = "Your payment is completed and cashback $10 will be credited back to your account";

        int indexOfDollar = s.indexOf('$');
        System.out.println("indexOfDollar :: " + indexOfDollar);

        String stringFromDollar = s.substring(indexOfDollar);
        System.out.println(stringFromDollar);

        int indexOfSecondString = stringFromDollar.indexOf("will");
        System.out.println("indexOfSecondString :: " + indexOfSecondString);

        System.out.println(stringFromDollar.substring(0,indexOfSecondString));

    }

}
