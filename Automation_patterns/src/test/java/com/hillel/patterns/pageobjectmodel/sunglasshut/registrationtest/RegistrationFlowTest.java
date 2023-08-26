package com.hillel.patterns.pageobjectmodel.sunglasshut.registrationtest;

import com.hillel.patterns.factory.BrowserName;
import com.hillel.patterns.factory.WebDriverFactory;
import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.login.LoginFlow;
import com.hillel.patterns.pageobjectmodel.sunglasshut.flows.register.RegistrationFlow;
import com.hillel.patterns.pageobjectmodel.sunglasshut.pages.login.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.hillel.patterns.pageobjectmodel.sunglasshut.utils.PopUpUtils.acceptCookies;
import static com.hillel.patterns.pageobjectmodel.sunglasshut.utils.PopUpUtils.closeCountryPopup;

public class RegistrationFlowTest {

    private static LoginFlow loginFlow;

    private static LoginPage loginPage;
    private static RegistrationFlow registrationFlow;
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        loginFlow = new LoginFlow(driver);
        registrationFlow = new RegistrationFlow(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        //loginPage.getPOPUP().click();
        //loginFlow.acceptCookies();
        closeCountryPopup(driver);
        acceptCookies(driver);

    }

    @Test
    void testNavigationToRegister() throws InterruptedException {

        loginFlow.login("someemail@gmail.com", "");
        Assertions.assertEquals("This field is required", loginPage.getPASSWORD_ERROR().getText());
        loginFlow.navigateToRegistrationPage();
        String pageTitle = "Create an account";
        Thread.sleep(1000);
        Assertions.assertEquals(pageTitle, registrationFlow.getPageTitle());
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
