package com.hillel.patterns.pageobjectmodel.sunglasshut.abstracttion;

import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.commonfragments.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Добавляем сюда HeaderMenu info, если у нас нет HeaderFlow, но мы хотим юзать headerMenu на всех страницах
public abstract class AbstractPage {

    public static final Duration TIMEOUT = Duration.ofSeconds(10);
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    //   private HeaderMenu headerMenu;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, TIMEOUT);
 //       this.headerMenu = new HeaderMenu(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

//    public HeaderMenu getHeaderMenu() {
//        return headerMenu;
//    }
}
