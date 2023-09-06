package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    private By title = By.xpath("//h1[text()='Account']");
    private By succesLink = By.xpath("//a[text()='Success']");

    private WebDriver driver;
    private WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean tituloEsVisible() {
        WebElement titleElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return titleElement.isDisplayed();
    }

    public boolean successLinkEsVisible() {
        WebElement successElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(succesLink));
        return successElement.isDisplayed();
    }
}

