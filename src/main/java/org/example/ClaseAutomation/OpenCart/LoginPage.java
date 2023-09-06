package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By emailInput = By.id("input-email");
    private By passInput = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void login(String email, String password) {
        WebElement emailInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.emailInput));
        emailInputElement.sendKeys(email);

        WebElement passInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.passInput));
        passInputElement.sendKeys(password);

        WebElement loginBtnElement = wait.until(ExpectedConditions.elementToBeClickable(this.loginBtn));
        loginBtnElement.click();
    }
}
