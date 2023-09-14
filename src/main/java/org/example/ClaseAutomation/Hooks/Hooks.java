package org.example.ClaseAutomation.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("--ignore-certificate-errors");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        driver = new ChromeDriver(options);
        // this.getDriver().get("https://opencart.abstracta.us/");

    }

    public static WebDriver getDriver() { return driver; }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
