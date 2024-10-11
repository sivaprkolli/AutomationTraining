package com.ft.multiThreading;

public class MTDemo {

    public static void main(String[] args) throws InterruptedException {
        MT1 mt1 = new MT1();
        MT2 mt2 = new MT2();

//        mt1.start();
//        Thread.sleep(10);
//        mt2.start();



       mt1.automation(); //
        mt2.automation(); //
    }
}
