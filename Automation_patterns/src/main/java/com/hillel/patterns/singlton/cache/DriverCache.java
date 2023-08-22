package com.hillel.patterns.singlton.cache;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Objects;

public class DriverCache {
    private static WebDriver driver;

    private DriverCache() {
    }

    public static WebDriver getDriver() {
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        return driver;
    }
}
