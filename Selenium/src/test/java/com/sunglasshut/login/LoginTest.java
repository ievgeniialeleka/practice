package com.sunglasshut.login;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest {

    private static WebDriver chromeDriver;

    @BeforeAll
    static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); //для исправления бага, возможно не нужен
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://www.sunglasshut.com/uk");
        WebElement popup = chromeDriver.findElement(By.xpath("//span[@class='common__icon common__icon--ma-close-black']"));
        popup.click();
    }

    @Test
    void testLogin() throws InterruptedException {

        WebElement loginIcon = chromeDriver.findElement(By.xpath("//span[@class='common__icon common__icon--medium common__icon--account-icon']"));
        loginIcon.click();
        Thread.sleep(3000);

        String link = chromeDriver.getCurrentUrl();
        //Assertions.assertEquals("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount", link);
        Assertions.assertTrue(link.contains("login"));


        WebElement inputLogin = chromeDriver.findElement(By.xpath("//input[@id='login-input-email']"));
        inputLogin.sendKeys("mylogin@gmail.com");
        WebElement inputPassword = chromeDriver.findElement(By.xpath("//input[@id='login-input-password']"));
        //inputPassword.sendKeys("somePassword");

        WebElement loginButton = chromeDriver.findElement(By.xpath("//button[@data-element-id='X_X_Login_Login']"));
       // loginButton.click();

      //  Thread.sleep(5000);
        inputPassword.click();
        inputPassword.clear();
        Thread.sleep(5000);
        loginButton.click();
        Thread.sleep(5000);
        WebElement errorPasswordMessage = chromeDriver.findElement(By.xpath("//div[@class='eAForm-input-name_error font-sans text-red-berry2 text-tiny font-normal mt-3']/span"));
        Assertions.assertTrue(errorPasswordMessage.isDisplayed());
        Assertions.assertEquals("This field is required", errorPasswordMessage.getText());
    }

    @Test
    void testProductCurrency() {
        chromeDriver.navigate().to("https://www.sunglasshut.com/uk/womens-sunglasses?facet=ads_f70083_ntk_cs%253A%2522Ray-Ban%2522");
        List<WebElement> productPrices = chromeDriver.findElements(By.xpath("//div[@class='flex flex-col']/span"));
       // List<WebElement> productPrices = chromeDriver.findElements(By.xpath(
      //          "//span[@class='sgh-tile__price text-tiny text-black uppercase font-bold leading-6 text-right flex sm:block']"));
        Assertions.assertTrue(productPrices.stream()
                .map(WebElement:: getText)
                .allMatch(c -> c.contains("£")));

    }

    @AfterAll
    static void tearDown() {
        chromeDriver.quit();
    }
}
