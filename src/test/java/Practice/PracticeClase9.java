package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeClase9 extends BaseTest {

    @Test
    public void ingresaAlHome() {
                this.getDriver().get("http://www.automationpractice.pl/index.php?");
    }

    @Test
    public void loginCorrecto() {
        this.driver.get("http://www.automationpractice.pl/index.php?");

        //Acceso a la pagina
        WebElement signInBtn = this.wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
        signInBtn.click();

        // Ingreso email y password
        WebElement emailInput = this.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        emailInput.sendKeys("noreply9@gmail.com");

        WebElement passInput = this.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
        passInput.sendKeys("noreply9");

        WebElement loginBtn = this.wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        loginBtn.click();

        //Validacion del Login
        boolean titlePage =
                this.wait.until(ExpectedConditions.textToBe(By.xpath("//h1[@class = 'page-heading']"), "MY ACCOUNT"));

        Assert.assertTrue(titlePage, "El titulo no coincide");

    }
}

//noreply9@gmail.com
//        noreply9