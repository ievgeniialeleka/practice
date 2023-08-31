package com.hillel.patterns.pageobjectmodel.sunglasshut.pages.login;

import com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion.AbstractPage;
import com.hillel.patterns.pageobjectmodel.sunglasshut.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AbstractPage {

    private static final By LOGIN_FIELD = By.xpath("//input[@id='login-input-email']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='login-input-password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@data-element-id='X_X_Login_Login']");
    //private static final By POPUP = By.xpath("//span[@class='common__icon common__icon--ma-close-black']");
    private static final By PASSWORD_ERROR = By.xpath("//div[@class='flex flex-col field mb-6']//span");
   // private static final By COOKIES_ACCEPT_BUTTON = By.xpath("//div[@class='privacy_prompt_content21']/button[@id='consent_prompt_submit']");
    private static final By REGISTER_BUTTON = By.xpath("//div[@class='flex justify-center mt-4']//button[@class='primary']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLOGIN_FIELD() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_FIELD));
       // driver.findElement(LOGIN_FIELD);
    }

    public WebElement getPASSWORD_FIELD() {

        return WaiterManager.waitUntilElementIsVisible(driver, PASSWORD_FIELD);
                //driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }

//    public WebElement getPOPUP() {
//        return driver.findElement(POPUP);
//    }

    public WebElement getPASSWORD_ERROR() {
        return driver.findElement(PASSWORD_ERROR);
    }
    public WebElement getREGISTER_BUTTON() {
        return driver.findElement(REGISTER_BUTTON);
    }
//    public WebElement getCOOKIES_ACCEPT_BUTTON() {
//        return driver.findElement(COOKIES_ACCEPT_BUTTON);
//    }
}
