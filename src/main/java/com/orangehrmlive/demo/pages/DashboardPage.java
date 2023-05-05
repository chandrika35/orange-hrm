package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By DashboardText = By.xpath("//h6[normalize-space()='Dashboard']");

    public String verifyDashboardText(){
        return getTextFromElement(DashboardText);
    }

}
