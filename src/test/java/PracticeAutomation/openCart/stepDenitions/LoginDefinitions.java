package PracticeAutomation.openCart.stepDenitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import PracticeAutomation.Hooks.Hooks;
import org.example.ClaseAutomation.OpenCart.HomePage;
import org.example.ClaseAutomation.OpenCart.LoginPage;
import org.example.ClaseAutomation.OpenCart.MyAccountPage;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario accede al login de la pagina opencart")
    public void queElUsuarioAccedeAlLoginDeLaPaginaOpencart() {
        homePage.abrirPagina(Hooks.getProperties().getProperty("url"));
        homePage.accederAlLogin();
    }

    @Cuando("el usuario ingresa email y contraseña validas")
    public void elUsuarioIngresaEmailYContrasenaValidas() {
        loginPage.login(
                Hooks.getProperties().getProperty("username"),
                Hooks.getProperties().getProperty("password")
        );
    }

    @Entonces("el usuario se encuentra en la pantalla de su cuenta")
    public void elUsuarioSeEncuentraEnLaPantallaDeSuCuenta() {
        Assert.assertTrue(myAccountPage.tituloEsVisible());
    }

}