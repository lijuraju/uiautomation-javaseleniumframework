package org.UIAutomation.tests.vmoApp.pageobjectmodel.pageobjectmodel;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.UIAutomation.base.CommonToAllTest;
import org.UIAutomation.driver.DriverManager;
import org.UIAutomation.pages.pageobjectmodel.vmo.DashboardPage;
import org.UIAutomation.pages.pageobjectmodel.vmo.LoginPage;
import org.UIAutomation.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VMOLogin extends CommonToAllTest {

    @Owner("Liju")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO() {

        LoginPage loginPagePom = new LoginPage(DriverManager.getDriver());
        String error_msg = loginPagePom.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }

    @Owner("Liju")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPositive() {

        LoginPage loginPagePom = new LoginPage(DriverManager.getDriver());
        loginPagePom.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashboardPage dashboardPagePom = new DashboardPage(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("expected_username"));


    }

}
