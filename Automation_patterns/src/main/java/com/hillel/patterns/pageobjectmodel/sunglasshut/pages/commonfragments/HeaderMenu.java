package com.hillel.patterns.pageobjectmodel.sunglasshut.pages.commonfragments;

import com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderMenu extends AbstractPage {

    private static final By LOGIN_ICON = By.xpath("");
    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginIcon() {
        return driver.findElement(LOGIN_ICON);
    }
}
