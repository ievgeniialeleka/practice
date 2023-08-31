package com.hillel.patterns.pageobjectmodel.sunglasshut.flows.navigation;

import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.login.LoginFlow;
import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.register.RegistrationFlow;
import org.openqa.selenium.WebDriver;

public class RegistrationNavigationFlow {

    private LoginFlow loginFlow;
    private RegistrationFlow registrationFlow;

    public RegistrationNavigationFlow(WebDriver webDriver) {
        this.registrationFlow = new RegistrationFlow(webDriver);
        this.loginFlow = new LoginFlow(webDriver);
    }

    public void navigateToRegistrationPageFromLoginPage() {
        loginFlow.navigateToRegistrationPage();
    }
}
