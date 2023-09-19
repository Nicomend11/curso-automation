package PracticeAutomation.openCart.stepDefinitions;

import PracticeAutomation.Hooks.Hooks;
import org.example.ClaseAutomation.OpenCart.HomePage;
import org.example.ClaseAutomation.OpenCart.LoginPage;
import org.example.ClaseAutomation.OpenCart.MyAccountPage;
import org.example.ClaseAutomation.OpenCart.RegisterPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;


public class RegisterDefinitions {
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    public RegisterDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }
    @Dado("que el usuario accede al registro en la pagina opencart")
    public void queElUsuarioAccedeAlRegistroEnLaPaginaOpencart() {
        homePage.abrirPagina("https://opencart.abstracta.us/");
        homePage.accederARegistro();
    }

    @Cuando("el usuario completa sus datos personales obligatorios")
    public void elUsuarioCompletaSusDatosPersonalesObligatorios() {
        registerPage.completarFormulario("Nicolas",
                "Mendoza", "noreply2@cba.gov.ar", "3515283896", "Nicolas2");
    }

    @Entonces("el usuario ya se encuentra registrado en la pagina")
    public void elUsuarioYaSeEncuentraRegistradoEnLaPagina() {
          Assert.assertTrue(myAccountPage.mensajeDeErrorEsVisible2());
    }

    @Entonces("el usuario se encuentra registrado en la pagina")
    public void elUsuarioSeEncuentraRegistradoEnLaPagina() {
        registerPage.crearCuenta();
    }

    @Cuando("el usuario no completa su email como dato obligatorio")
    public void elUsuarioNoCompletaSuEmailComoDatoObligatorio() {
        registerPage.completarFormulario("Roberto", "Perez",
                "", "3518888888", "Roberto1");
    }

    @Entonces("el usuario no se registra en la pagina")
    public void elUsuarioNoSeRegistraEnLaPagina() {
        Assert.assertTrue(myAccountPage.mensajeDeErrorEmail());
    }
}

