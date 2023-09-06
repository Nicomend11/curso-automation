package Practice.openCart;

import Practice.BaseTest;
import org.example.ClaseAutomation.OpenCart.AccountPage;
import org.example.ClaseAutomation.OpenCart.HomePage;
import org.example.ClaseAutomation.OpenCart.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void crearCuenta() {
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        homePage.accederARegistro();
        registerPage.completarFormulario(
                "cesar",
                "mejia",
                "cesar2@gmail.com.ar",
                "1111111111",
                "12345678"
        );

        Assert.assertTrue(accountPage.successLinkEsVisible());
        Assert.assertTrue(accountPage.tituloEsVisible());
    }
}
