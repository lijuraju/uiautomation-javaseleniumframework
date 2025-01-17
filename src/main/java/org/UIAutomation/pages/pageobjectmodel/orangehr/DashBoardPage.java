package org.UIAutomation.pages.pageobjectmodel.orangehr;

import org.UIAutomation.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends CommonToAllPages {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }



    // Page Locators
    By userNameOnDashboard = By.xpath("//h6[normalize-space()='PIM']");


    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
