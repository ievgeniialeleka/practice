package com.hillel.patterns.pageobjectmodel.sunglasshut.flows.register;

import com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion.AbstractFlow;
import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.register.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow extends AbstractFlow {

    private RegistrationPage registrationPage;

    public RegistrationFlow(WebDriver webDriver) {
        super(webDriver);
        this.registrationPage = new RegistrationPage(webDriver);
    }

    public String getPageTitle() {
        return registrationPage.getPAGE_TITLE().getText();
    }

    public boolean isEmailFieldDisplayed() {
        return registrationPage.getEMAIL_FIELD().isDisplayed();
    }
}
