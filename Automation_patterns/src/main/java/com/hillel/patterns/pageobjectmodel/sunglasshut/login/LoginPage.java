package com.hillel.patterns.pageobjectmodel.sunglasshut.login;

import com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By LOGIN_FIELD = By.xpath("//input[@id='login-input-email']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='login-input-password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@data-element-id='X_X_Login_Login']");
    private static final By POPUP = By.xpath("//span[@class='common__icon common__icon--ma-close-black']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLOGIN_FIELD() {
        return driver.findElement(LOGIN_FIELD);
    }

    public WebElement getPASSWORD_FIELD() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public WebElement getPOPUP() {
        return driver.findElement(POPUP);
    }
}
