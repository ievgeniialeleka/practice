package com.hillel.patterns.factory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FactoryTest {

    private static WebDriver driver;

    @BeforeAll
    static void init() {
        driver = WebDriverFactory.getByName(BrowserName.valueOf(System.getProperty("browserName")));

    }
    //mvn clean test -DbrowserName=EDGE or mvn clean test -DbrowserName=CHROME
    @Test
    void testMvnParamsForBrowserValue() {
        driver.navigate().to("https://www.google.com");
    }

//    @Test
//    void testFactoryEdge() {
//        WebDriverFactory.getByName(BrowserName.valueOf(System.getProperty("browserName"))).get("https://www.google.com/");
//
//    }

//    @Test
//    void testFactoryChrome() {
//        WebDriverFactory.getByName(BrowserName.CHROME).get("https://www.google.com/");
//    }
}
