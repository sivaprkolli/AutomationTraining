package com.ft.testNG.retryForFailedTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int counter =0;
    int retryLimit = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        System.out.println(iTestResult.getStatus());
        System.out.println(ITestResult.FAILURE);
        if(counter<retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
