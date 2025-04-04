package org.UIAutomation.tests.sample;

import org.testng.annotations.*;

public class SampleTest3 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("SampleTest3.beforeTest - Thread: " + Thread.currentThread().getId());
        System.out.println("Before Test");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("SampleTest3.beforeSuite - Thread: " + Thread.currentThread().getId());
        System.out.println("Before Suite");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("SampleTest3.beforeClass - Thread: " + Thread.currentThread().getId());
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("SampleTest3.beforeMethod - Thread: " + Thread.currentThread().getId());
        System.out.println("Before Method");
    }

    @Test
    public void testSample(){
        System.out.println("SampleTest3.testSample - Thread: " + Thread.currentThread().getId());
        System.out.println("This is a sample test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("SampleTest3.afterMethod - Thread: " + Thread.currentThread().getId());
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("SampleTest3.afterClass - Thread: " + Thread.currentThread().getId());
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("SampleTest3.afterTest - Thread: " + Thread.currentThread().getId());
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("SampleTest3.afterSuite - Thread: " + Thread.currentThread().getId());
        System.out.println("After Suite");
    }
}
