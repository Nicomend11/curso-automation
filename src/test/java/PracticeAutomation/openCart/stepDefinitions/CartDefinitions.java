package PracticeAutomation.openCart.stepDefinitions;

import PracticeAutomation.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import org.example.ClaseAutomation.OpenCart.CartPage;
import org.example.ClaseAutomation.OpenCart.MyAccountPage;
import org.testng.Assert;

public class CartDefinitions {
    private MyAccountPage myAccountPage;
    private CartPage cartPage;

    public CartDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.cartPage = new CartPage(Hooks.getDriver());
    }

    @Cuando("el usuario selecciona el producto y elige una opcion")
    public void elUsuarioSeleccionaElProductoYEligeUnaOpcion() {
        cartPage.seleccionarCamara();
        Assert.assertTrue(cartPage.nombreCamara());
        cartPage.seleccionarOpciones();
        cartPage.seleccionarColor();
        cartPage.agregarAlCarrito();
    }

}
