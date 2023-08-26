package com.hillel.patterns.pageobjectmodel.sunglasshut.flows.login;

import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        this.loginPage = new LoginPage(webDriver);
    }

    public void enterEmail(String email) {
        loginPage.getLOGIN_FIELD().sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPage.getPASSWORD_FIELD().sendKeys(password);
    }

    public void submitLoginInfo() {
        loginPage.getLOGIN_BUTTON().click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        submitLoginInfo();
    }

//    public void acceptCookies() {
//        loginPage.getCOOKIES_ACCEPT_BUTTON().click();
//    }

    public void navigateToRegistrationPage() {
        loginPage.getREGISTER_BUTTON().click();
    }
}
