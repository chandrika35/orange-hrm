package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By EnterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]");
    By UserRoleSelect = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By SelectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By StatusSelect = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    By SelectDisable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By SelectEnable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By clickSearch = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By VerifyResult = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By ClickCheckbox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    By ClickDelete = By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i[1]");
    By PopUp = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]");
    By VerifyMessage = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By SearchButton = By.xpath("//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]");
    By VerifyNoRecord = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");

    public void enterUser() {
        sendTextToElement(EnterUsername, "Sitaram");
    }

    public void SelectUserRole()  {
        clickOnElement(UserRoleSelect);
        clickOnElement(SelectAdmin);
    }

    public void SelectStatusDisable ()  {
        clickOnElement(StatusSelect);
        clickOnElement(SelectDisable);
    }

    public void SelectStatusEnable ()  {
        clickOnElement(StatusSelect);
        clickOnElement(SelectEnable);
    }

    public void ClickSearchButton() {
        clickOnElement(clickSearch);
    }

    public String VerifyResultList() {
        return getTextFromElement(VerifyResult);
    }

    public void clickOnCheckbox() {
        clickOnElement(ClickCheckbox);
    }

    public void ClickOnDelete()  {
        clickOnElement(ClickDelete);

    }

    public void clickPopUp()  {
        clickOnElement(PopUp);

    }

    public void VerifyMessage() {
        clickOnElement(VerifyMessage);
    }

    public void SearchButtonDelete() {
        clickOnElement(SearchButton);
    }

    public String VerifyNoRecordFound() {
        return getTextFromElement(VerifyNoRecord);
    }

    }
