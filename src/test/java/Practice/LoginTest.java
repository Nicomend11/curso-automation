package Practice;


import org.example.ClaseAutomation.HomePage;
import org.example.ClaseAutomation.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        homePage.accederAlLogin();

        loginPage.login("pepe@pepe.com", "123456789");

        // Validacion del login
        boolean titleIsPresent =
                this.getWait().until(ExpectedConditions.textToBe(By.xpath("//h1[@class='page-heading']"), "MY ACCOUNT"));

        Assert.assertTrue(titleIsPresent, "El titulo no coincide");
    }

}
