package com.ft.oops.abstraction;

public class TestExecutions extends AbstractImplementation{

    public static void main(String[] args) {
        TestExecutions testExecutions = new TestExecutions();
        testExecutions.payment();
        testExecutions.products();

        AbstractImplementation abstractImplementation = new AbstractImplementation();
        abstractImplementation.payment();
        abstractImplementation.products();
        AbstractImplementation abstractImplementation1 = new TestExecutions();

        AbstractSample abstractSample = new TestExecutions();
        abstractSample.payment();



    }
}
