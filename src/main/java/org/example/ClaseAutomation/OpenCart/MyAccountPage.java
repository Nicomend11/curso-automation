package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Page {

    private By title = By.xpath("//h2[text()='My Account']");
    private By alertAccount = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean tituloEsVisible() {
        return isDisplayed(title);
    }
    public boolean mensajeDeErrorEsVisible2() {
        return isDisplayed(alertAccount);
    }
}