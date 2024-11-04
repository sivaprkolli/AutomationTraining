package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTests2 {

    @Test
    public void login1(){
        System.out.println("login1");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void login2(){

        System.out.println("login2");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

}
