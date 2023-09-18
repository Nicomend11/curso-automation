package org.example.ClaseAutomation.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Page {

    private By title = By.xpath("//h2[text()='My Account']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean tituloEsVisible() {
        return isDisplayed(title);
    }
}