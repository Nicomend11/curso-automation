package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    private By emailInput = By.id("input-email");
    private By passInput = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By alert = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        sendKeys(this.emailInput, email);
        sendKeys(this.passInput, password);
        click(this.loginBtn);
    }

    public boolean mensajeDeErrorEsVisible(String warning) {
        return isDisplayed(alert);
    }

}