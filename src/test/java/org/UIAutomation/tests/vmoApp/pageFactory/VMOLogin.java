package org.UIAutomation.tests.vmoApp.pageFactory;


import org.UIAutomation.base.CommonToAllPages;
import org.UIAutomation.base.CommonToAllTest;
import org.UIAutomation.driver.DriverManager;
import org.UIAutomation.listeners.RetryAnalyzer;
import org.UIAutomation.pages.pageobjectmodel.vmo.LoginPage;
import org.UIAutomation.utils.PropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(retryAnalyzer = RetryAnalyzer.class)
public class VMOLogin extends CommonToAllPages {

    private static final Logger logger = LogManager.getLogger(VMOLogin.class);

    @Test
    public void testLoginNegativeVWO_PF() {

        logger.info("Starting the Testcases Page Factory");
        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage loginPage_PF = new LoginPage(driver);
        String error_msg = loginPage_PF.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
        logger.info("End of the Testcase!!");
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));

    }
}
