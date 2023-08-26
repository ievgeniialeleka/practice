package com.hillel.patterns.pageobjectmodel.sunglasshut.pages.register;

import com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath("//div[@class='wrap-login-registration']//div[@class='sgh-container-join']/div");
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getPAGE_TITLE() {
        return driver.findElement(PAGE_TITLE);
    }
}
