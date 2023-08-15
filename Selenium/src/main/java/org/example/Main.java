package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); //для исправления бага, возможно не нужен


        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        System.out.println(options.getBrowserName());
        System.out.println(options.getBrowserVersion());

        WebDriver chromeDriver = new ChromeDriver(options);


//        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver.exe");
//        WebDriver edgeDriver = new EdgeDriver();

//        chromeDriver.get("https://www.sunglasshut.com/uk");
        chromeDriver.navigate().to("https://www.sunglasshut.com/uk");
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.navigate().forward();

        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        chromeDriver.navigate().to("https://argparse4j.github.io/");
        chromeDriver.switchTo().newWindow(WindowType.TAB);

//        chromeDriver.switchTo().alert();
//        chromeDriver.switchTo().frame(...);

        chromeDriver.manage().window().fullscreen();
        Thread.sleep(2000);
        chromeDriver.manage().window().maximize();
        Thread.sleep(2000);
        chromeDriver.manage().window().minimize();
        chromeDriver.manage().window().setSize(new Dimension(1200, 1200));

        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());

//        WebElement element = chromeDriver.findElement();
//        List<WebElement> elements = chromeDriver.findElements();


        chromeDriver.close(); //объект драйвера = null
        chromeDriver.quit(); //убивает объект драйвера
    }
}
