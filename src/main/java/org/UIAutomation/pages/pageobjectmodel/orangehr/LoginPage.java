package org.UIAutomation.pages.pageobjectmodel.orangehr;

import org.UIAutomation.base.CommonToAllPages;
import org.UIAutomation.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends CommonToAllPages {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    // page locators
    private By username = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By submit_btn = By.xpath("//button[normalize-space()='Login']");


    // page actions

    public void loginToHRCreds(String user, String pwd) {
        driver.get(PropertiesReader.readKey("orange_hr_url"));
        visibilityOfElement(username);
        enterInput(username, user);
        enterInput(password, pwd);
        clickElement(submit_btn);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
