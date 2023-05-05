package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginpage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() {
        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickOnAdmin();
        viewSystemUsersPage.getSystemUsersText();
        viewSystemUsersPage.clickAddButton();
        viewSystemUsersPage.verifyAddUser();
        viewSystemUsersPage.selectAdminRole();
        viewSystemUsersPage.enterConfirmPassword();
        viewSystemUsersPage.enterUserName();
        viewSystemUsersPage.selectDisable();
        viewSystemUsersPage.enterPassword();
        viewSystemUsersPage.enterConfirmPassword();
        viewSystemUsersPage.clickOnSave();
    }
    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickOnAdmin();
        viewSystemUsersPage.getSystemUsersText();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatusDisable();
        addUserPage.ClickSearchButton();
        addUserPage.VerifyResultList();

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickOnAdmin();
        viewSystemUsersPage.getSystemUsersText();


    }



}
