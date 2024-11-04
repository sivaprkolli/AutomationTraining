package com.ft.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTests {
    @Test
    public void registration1(){
        System.out.println("registration1");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void registration2() {
        System.out.println("registration2");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        Assert.assertEquals(2, 2);
    }
}
