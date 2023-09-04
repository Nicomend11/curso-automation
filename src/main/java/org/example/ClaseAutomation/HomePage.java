package org.example.ClaseAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HomePage {
    private By busquedaInput = By.id("search_query_top");
    private By title = By.xpath("//a[@title='My Shop']");
    private By accesoLogin = By.className("login");
    private By menu = By.id("block_top_menu");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean busquedaInputEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(busquedaInput));
        return element.isDisplayed();
    }

    public boolean titleEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(title));
        return element.isDisplayed();
    }

    public boolean accesoLoginEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(accesoLogin));
        return element.isDisplayed();
    }

    public boolean menuEsVisible() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(menu));
        return element.isDisplayed();
    }

    public void accederAlLogin() {
        WebElement element = this.wait.until(ExpectedConditions.elementToBeClickable(accesoLogin));
        element.click();
    }
}


