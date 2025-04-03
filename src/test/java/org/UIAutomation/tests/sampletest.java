package org.UIAutomation.tests;

import org.UIAutomation.listeners.RetryAnalyzer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampletest {

    @Test
    public void sampleTest() {
        System.out.println("This is a sample test");
    }

    private WebDriver driver;
    private static  int clickCount =0;

    @BeforeMethod
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testButtonClickRetry() {
        WebElement button = driver.findElement(By.id("myButton"));
        clickCount++;

        if (clickCount < 3) { // Simulate failure for the first 2 clicks
            System.out.println("Simulating failure on click attempt: " + clickCount);
            Assert.fail("Simulated failure.");
        }

        button.click();
        System.out.println("Button clicked successfully after " + clickCount + " attempts.");
        Assert.assertTrue(true); // Ensure test passes after successful click
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
