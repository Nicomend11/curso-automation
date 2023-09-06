package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By phone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By policyCheckbox = By.name("agree");
    private By continueBtn = By.xpath("//input[@value='Continue']");

    private WebDriver driver;
    private WebDriverWait wait;

}
