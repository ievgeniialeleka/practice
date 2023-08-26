package com.hillel.patterns.pageobjectmodel.sunglasshut.flows.commonflows;

import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.commonfragments.HeaderMenu;
import org.openqa.selenium.WebDriver;

public class HeaderFlow {

    private HeaderMenu headerMenu;

    public HeaderFlow(WebDriver webDriver) {
        this.headerMenu = new HeaderMenu(webDriver);
    }

    public void navigateToLogin() {
        headerMenu.getLoginIcon().click();
    }
}
