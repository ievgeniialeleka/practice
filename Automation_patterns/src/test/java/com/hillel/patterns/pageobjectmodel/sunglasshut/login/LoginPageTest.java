package com.hillel.patterns.pageobjectmodel.sunglasshut.login;

import com.hillel.patterns.factory.BrowserName;
import com.hillel.patterns.factory.WebDriverFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest {

    private static LoginPage loginPage;
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        loginPage.getPOPUP().click();
    }

    @Test
    void testLogin() {
        loginPage.getLOGIN_FIELD().sendKeys("someemail@gmail.com");
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}