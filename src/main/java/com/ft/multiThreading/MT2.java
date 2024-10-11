package com.ft.multiThreading;

public class MT2 extends Thread{
    public void automation(){
        for(int i=0; i<5; i++) {
            System.out.println("Appium");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
