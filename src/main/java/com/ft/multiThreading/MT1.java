package com.ft.multiThreading;

public class MT1 extends Thread{

    public void automation() {
        for(int i=0; i<5; i++) {
            System.out.println("Selenium");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
