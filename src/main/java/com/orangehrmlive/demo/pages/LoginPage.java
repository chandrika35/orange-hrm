package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By VerifyLogin = By.xpath("//h5[normalize-space()='Login']");
    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By hrLogo      =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]");



    public String verifyLogin() {
        return getTextFromElement(VerifyLogin);
    }

    public void enterUsernameField(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getHrLogo(){
        return getTextFromElement(hrLogo);
    }

    public void LoginToApplication(String username, String password) {
        enterUsernameField(username);
        enterPasswordField(password);
        clickOnLoginButton();

    }
}
