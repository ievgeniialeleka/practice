package com.hillel.patterns.pageobjectmodel.sunglasshut.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpUtils {

    private static final By COUNTRY_POPUP = By.xpath("//span[@class='common__icon common__icon--ma-close-black']");
    private static final By ACCEPT_COOKIES = By.xpath("//div[@class='privacy_prompt_content21']/button[@id='consent_prompt_submit']");

    private PopUpUtils() {}

    public static void closeCountryPopup(WebDriver webDriver) {
        webDriver.findElement(COUNTRY_POPUP).click();
    }

    public static void acceptCookies(WebDriver webDriver) {
        webDriver.findElement(ACCEPT_COOKIES).click();
    }
}
