package org.UIAutomation.pages.pageobjectmodel.vmo;

import org.UIAutomation.base.CommonToAllPages;
import org.UIAutomation.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPages {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    // Step 1 - Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // If you are not using it , don't keep.


    // Step 2 - Page Actions

    public String loginToVWOLoginInvalidCreds(String user, String pwd) {

        driver.get(PropertiesReader.readKey("url"));
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;

    }

    public void loginToVWOLoginValidCreds(String user, String pwd) {

        driver.get(PropertiesReader.readKey("url"));
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}