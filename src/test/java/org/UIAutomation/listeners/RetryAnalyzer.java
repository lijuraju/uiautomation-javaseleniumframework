package org.UIAutomation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3; // Set the max retry count


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount){
            retryCount++;
            //System.out.println("Retrying test " + result.getName() + " attempt " + retryCount + " of " + maxRetryCount);
            return true;
        }
        return false;
    }
}
