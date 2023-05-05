package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By clickAdmin = By.xpath("//a[normalize-space()='']");
    By verifySystemUsersText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    By AddButton = By.xpath("//button[normalize-space()='Add']");
    By VerifyAddUser = By.xpath("//h6[normalize-space()='Add User']");
    By selectAdminDrop = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By SelectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By EnterEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By EnterEmpName = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Kiyara  Hu')]");
    By EnterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]");
    By selectStatus = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By selectDisable = By.xpath("//div[contains(text(),'Disabled')]");
    By EnterPassword = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By EnterConfirmPassword = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By clickOnSave = By.xpath("//button[normalize-space()='Save']");


    public void clickOnAdmin() {
        clickOnElement(clickAdmin);
    }

    public void getSystemUsersText() {
        getTextFromElement(verifySystemUsersText);
    }

    public void clickAddButton() {
        clickOnElement(AddButton);
    }

    public String verifyAddUser() {
        return getTextFromElement(VerifyAddUser);
    }

    public void selectAdminRole() {
        clickOnElement(selectAdminDrop);
        clickOnElement(SelectAdmin);
    }

    public void enterEmployeeName() {
        sendTextToElement(EnterEmployeeName, "k");
        clickOnElement(EnterEmpName);
    }

    public void enterUserName() {
        sendTextToElement(EnterUsername, "bharat");
    }

    public void selectDisable() {
        clickOnElement(selectStatus);
        clickOnElement(selectDisable);
    }

    public void enterPassword() {
        sendTextToElement(EnterPassword, "India123");
    }

    public void enterConfirmPassword() {
        sendTextToElement(EnterConfirmPassword, "India123");
    }

    public void clickOnSave() {
        clickOnElement(clickOnSave);
    }

}