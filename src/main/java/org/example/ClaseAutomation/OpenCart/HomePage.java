package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By myAccountDropdown = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']");
    private By registerBtn = By.xpath("//a[text()='Register']");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void accederAlLogin() {
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(this.myAccountDropdown));
        myAccount.click();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(this.loginBtn));
        login.click();
    }

    public void accederARegistro() {
        WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(this.myAccountDropdown));
        myAccount.click();

        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(this.registerBtn));
        register.click();
    }
}
