package com.ft.loopsAndConditions;

public class LoopsAndConditions {

    public static void main(String[] args) {
        int age=18;
        String s = "Selenium";
        char c = 'A';

        if(c == 'B'){
            System.out.println(c);
        }else if(c == 'A'){
            System.out.println("2nd condition");
            System.out.println(c);
        } else if(c == 'a'){
            System.out.println(c);
        }else {
            System.out.println("Provide right char");
        }



        if(false){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        if(s == "Selenium"){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        if(s.equals("Selenium")){
            System.out.println("Eligible to vote");
        }else if(s.contains("Sele")){
            System.out.println("Not eligible to vote");
        }

    }
}
