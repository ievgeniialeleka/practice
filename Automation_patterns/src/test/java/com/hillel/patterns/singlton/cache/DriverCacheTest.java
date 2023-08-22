package com.hillel.patterns.singlton.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DriverCacheTest {

    private WebDriver driver;

    @BeforeEach
    void initDriver() {
        driver = DriverCache.getDriver();
    }

    @Test
    void testCache() {
        //new driver instantiated
        driver.get("https://www.google.com/");
    }

    @Test
    void testCache2() {
        //driver object already exists so we use an existing one
        driver.get("https://www.google.com/");
    }



}
