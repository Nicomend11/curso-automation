package org.example.ClaseAutomation.OpenCart;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends Page {

    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By phone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By policyCheckbox = By.name("agree");
    private By continueBtn = By.xpath("//input[@value='Continue']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(this.firstName, firstName);
        sendKeys(this.lastName, lastName);
        sendKeys(this.email, email);
        sendKeys(this.phone, phone);
        sendKeys(this.password, password);
        sendKeys(this.confirmPassword, password);
        click(this.policyCheckbox);
        click(this.continueBtn);
    }

    public void crearCuenta() {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        Faker faker = new Faker();

        homePage.accederARegistro();
        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );
    }
}