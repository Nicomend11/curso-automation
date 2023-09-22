package PracticeAutomation.openCart.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import PracticeAutomation.Hooks.Hooks;
import org.example.ClaseAutomation.OpenCart.HomePage;
import org.example.ClaseAutomation.OpenCart.LoginPage;
import org.example.ClaseAutomation.OpenCart.MyAccountPage;
import org.testng.Assert;

public class WishDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public WishDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }
    @Dado("que el usuario se encuentra en la pagina de su cuenta")
    public void queElUsuarioSeEncuentraEnLaPaginaDeSuCuenta() {
        homePage.abrirPagina("https://opencart.abstracta.us/");
        homePage.accederAlLogin();
        loginPage.login("noreply@gmail.com", "Nicolas1");
        Assert.assertTrue(myAccountPage.tituloEsVisible());
    }
    @Cuando("el usuario ingresa en la seccion Cameras")
    public void elUsuarioIngresaEnLaSeccionCameras() {
        myAccountPage.accederACameras();
        Assert.assertTrue(myAccountPage.tituloCameraVisible());
    }
    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {
        myAccountPage.agregarAFavorites();
    }
    @Cuando("el usuario ingresa a la lista de Deseos")
    public void elUsuarioIngresaIngresaALaListaDeDeseos() {
        myAccountPage.ingresarAListaDeseos();
        Assert.assertTrue(myAccountPage.tituloListaDeseos());
    }
    @Entonces("el usuario posee un producto en favoritos")
    public void elUsuarioPoseeUnProductoEnFavoritos() {
        Assert.assertTrue(myAccountPage.nombreProducto());
    }

}
