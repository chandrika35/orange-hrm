package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
        By displayLogo = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
        By UserProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/i[1]");
        By MouseHover = By.xpath("//a[contains(text(),'Logout')]");
        By PMI        = By.xpath("//a[normalize-space()='']");
        By leave        = By.xpath("//a[normalize-space()='']");
        By dashboard    =By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]");

        public String verifyDisplayLogo(){
                return getTextFromElement(displayLogo);
        }
        public void clickOnUserProfileLogo(){
                clickOnElement(UserProfileLogo);
        }
        public void clickMouseHoverToLogo(){
                mouseHoverToElementAndClick(MouseHover);
        }
        public void clickOnPMI(){
                clickOnElement(PMI);
        }
        public void clickOnLeave(){
                clickOnElement(leave);
        }
        public void clickDashboard(){
                clickOnElement(dashboard);
        }


    }

