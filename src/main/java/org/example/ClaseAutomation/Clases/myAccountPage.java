package org.example.ClaseAutomation.Clases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class myAccountPage {

    private By title = By.xpath("//h1[@class='page-heading']");

    private WebDriver driver;
    private WebDriverWait wait;

    public myAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean tituloEsVisible(String titleEsperado) {
        return this.wait.until(ExpectedConditions.textToBe(title, titleEsperado));
    }
}