package com.ft.collectionFramework;

public class GenericsTest<T> {
    T t;

    public void test1(){
        System.out.println(t.getClass());
    }

    public static void main(String[] args) {
        GenericsTest<Integer> genericsTest = new GenericsTest<Integer>();
        GenericsTest<String> genericsTest1 = new GenericsTest<String>();
        GenericsTest<Double> genericsTest2 = new GenericsTest<Double>();

        GenericsTest genericsTest3 = new GenericsTest();
        GenericsTest genericsTest4 = new GenericsTest();
        genericsTest.t = 10;
        genericsTest.t = 20;
        genericsTest1.t = "Playwright";
        genericsTest2.t = 100.00;
        genericsTest.test1();
        genericsTest1.test1();
        genericsTest2.test1();
        genericsTest3.t = 10.1f;
        genericsTest3.test1();
        genericsTest3.t = "Selenium";
        genericsTest3.test1();
        genericsTest3.t = new String(String.valueOf(genericsTest4));
        genericsTest3.test1();
        genericsTest3.t = genericsTest4;
        genericsTest3.test1();


    }
}
