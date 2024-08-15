package com.ft.loopsAndConditions;

public class SwitchCase {

    public static void main(String[] args) {
        String s = "RestAssured";
        switch (s){
            case "Selenium":
                System.out.println("Web Automation Tool");
                break;
            case "Appium":
                System.out.println("Mobile Automation Tool");
                break;
            case "RestAssured":
                System.out.println("API Automation Tool");
                break;
            case "Pynt":
                System.out.println("Security Test Tool");
                break;
            case "K6":
                System.out.println("Load Test Tool");
                break;
            default:
                System.out.println("Provide right tool");
        }

        if(s.equals("selenium")){
            System.out.println("Web Automation Tool");
        } else if(s.equals("Appium")) {
            System.out.println("Mobile Automation Tool");
        } else if(s.equals("RestAssured")) {
            System.out.println("API Automation Tool");
        } else {
            System.out.println("Provide right tool");
        }
    }
}
