package org.UIAutomation.tests.orangeHR;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.UIAutomation.base.CommonToAllTest;
import org.UIAutomation.driver.DriverManager;
import org.UIAutomation.pages.pageobjectmodel.orangehr.DashBoardPage;
import org.UIAutomation.pages.pageobjectmodel.orangehr.LoginPage;
import org.UIAutomation.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OrangeHr extends CommonToAllTest {


    @Owner("Liju")
    @Description("Verify that the login to the OrangeeHR ")
    @Test
    public void testLoginPositive() {
        LoginPage loginPagePomOhr = new LoginPage(DriverManager.getDriver());
        loginPagePomOhr.loginToHRCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));


        DashBoardPage dashboardPagePom = new DashBoardPage(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("ohr_expected_username"));



    }
}
