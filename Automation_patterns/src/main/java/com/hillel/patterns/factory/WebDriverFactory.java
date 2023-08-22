package com.hillel.patterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory() {}

    public static WebDriver getByName(BrowserName browserName) {
        switch(browserName) {
            case CHROME:
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                return new ChromeDriver();
            case EDGE :
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
                return new EdgeDriver();
        }
    }
}
