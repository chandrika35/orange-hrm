package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Test
    public void verifyUserShouldLoginSuccessFully() {

        loginPage.enterUsernameField("Admin");
        loginPage.enterPasswordField("admin123");
        loginPage.clickOnLoginButton();
    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage() {
        homePage.verifyDisplayLogo();
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully()  {
        loginPage.LoginToApplication("Admin", "admin123");
        homePage.clickOnUserProfileLogo();
        homePage.clickMouseHoverToLogo();
        loginPage.verifyLogin();
    }
}
