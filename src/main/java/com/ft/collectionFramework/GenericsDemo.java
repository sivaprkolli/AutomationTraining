package com.ft.collectionFramework;

public class GenericsDemo<T> {

    public static void main(String[] args) {
        GenericsDemo<Integer> genericsDemo = new GenericsDemo<Integer>();
        GenericsDemo<String> genericsDemo1 = new GenericsDemo<String>();
        GenericsDemo<Double> genericsDemo2 = new GenericsDemo<Double>();
        GenericsDemo genericsDemo3 = new GenericsDemo();
    }
}
