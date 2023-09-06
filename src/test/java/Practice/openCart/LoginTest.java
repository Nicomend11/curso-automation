package Practice.openCart;

import Practice.BaseTest;
import org.example.ClaseAutomation.OpenCart.HomePage;
import org.example.ClaseAutomation.OpenCart.LoginPage;
import org.example.ClaseAutomation.OpenCart.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        homePage.accederAlLogin();
        loginPage.login("pepe@pepe.com.ar", "12345678");

        Assert.assertTrue(myAccountPage.tituloEsVisible());
    }

}
