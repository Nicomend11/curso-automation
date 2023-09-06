package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {
        WebElement firstNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.firstName));
        firstNameElement.sendKeys(firstName);

        WebElement lastNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.lastName));
        lastNameElement.sendKeys(lastName);

        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.email));
        emailElement.sendKeys(email);

        WebElement phoneElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.phone));
        phoneElement.sendKeys(phone);

        WebElement passElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.password));
        passElement.sendKeys(password);

        WebElement confirmPassElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.confirmPassword));
        confirmPassElement.sendKeys(password);

        WebElement policyElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.policyCheckbox));
        policyElement.click();

        WebElement continueElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.continueBtn));
        continueElement.click();
    }

}
