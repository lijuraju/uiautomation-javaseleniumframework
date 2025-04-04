package org.UIAutomation.tests.sample;

import org.testng.annotations.Test;

public class SampleTest2 {

    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("SampleTest2.testMethod1 - Thread: " + Thread.currentThread().getId());
        System.out.println("This is test method 1");
    }

    @Test(groups = {"sanity"})
    public void testMethod2() {
        System.out.println("SampleTest2.testMethod2 - Thread: " + Thread.currentThread().getId());
        System.out.println("This is test method 2");
    }

    @Test(groups = {"regression"})
    public void testMethod3() {
        System.out.println("SampleTest2.testMethod3 - Thread: " + Thread.currentThread().getId());
        System.out.println("This is test method 3");
    }
}
