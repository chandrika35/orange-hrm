package com.orangehrmlive.demo.pages;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By userTab = By.xpath("//span[normalize-space()='User Management']");
    By jobTab           = By.xpath("//span[normalize-space()='Job']");
    By organizationTabs = By.xpath("//span[normalize-space()='Organization']");


    public void clickOnUserManagement(){
        clickOnElement(userTab);
    }
    public void clickOnJobTab(){
        clickOnElement(jobTab);
    }
    public void clickOnOrganizationTabs(){
        clickOnElement(organizationTabs);
    }
}
