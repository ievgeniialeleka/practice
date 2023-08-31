package com.hillel.patterns.pageobjectmodel.sunglasshut.logintest;

import com.hillel.patterns.factory.BrowserName;
import com.hillel.patterns.factory.WebDriverFactory;
import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.login.LoginFlow;
import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.login.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static com.hillel.patterns.pageobjectmodel.sunglasshut.utils.PopUpUtils.acceptCookies;
import static com.hillel.patterns.pageobjectmodel.sunglasshut.utils.PopUpUtils.closeCountryPopup;

class LoginFlowTest {

    private static LoginPage loginPage;
    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.sunglasshut.com/uk");
//        driver.navigate().to("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
       // loginPage.getPOPUP().click();
        closeCountryPopup(driver);
        acceptCookies(driver);
    }

    @Test
    void testLogin() {

        loginPage.getLOGIN_FIELD().sendKeys("someemail@gmail.com");
        loginPage.getLOGIN_BUTTON().click();
        Assertions.assertEquals("This field is required", loginPage.getPASSWORD_ERROR().getText());
        loginPage.getREGISTER_BUTTON().click();
    }

    @Test
    void testLogin2() {

        loginFlow.login("someemail@gmail.com", "");
        Assertions.assertEquals("This field is required", loginPage.getPASSWORD_ERROR().getText());
        loginFlow.navigateToRegistrationPage();
    }

    @Test
    void testLoginNavigation() {
        loginFlow.getHeaderFlow().navigateToLogin();
        Assertions.assertTrue(driver.getCurrentUrl().contains("myaccount"));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}