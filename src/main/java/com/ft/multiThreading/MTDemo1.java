package com.ft.multiThreading;

public class MTDemo1 {

    public static void main(String[] args) {
        Thread th1 = new Test1();
        Thread th2 = new Test2();

        th1.start();
        System.out.println(th1.getId());
        System.out.println(th1.getName());
        th2.start();
        System.out.println(th2.getId());
        System.out.println(th2.getName());

        Test3 test3 = new Test3();
        Test4 test4 = new Test4();


        Thread th3 = new Thread(test3);
        Thread th4 = new Thread(test4);

        th3.start();
        System.out.println(th3.getId());
        System.out.println(th3.getName());
        th4.start();

        System.out.println(th4.getId());
        System.out.println(th4.getName());
    }


    static class Test1 extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Selenium");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Test2 extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Appium");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Test3 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Selenium");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Test4 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Appium");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
