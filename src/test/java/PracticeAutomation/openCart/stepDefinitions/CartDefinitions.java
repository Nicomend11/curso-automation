package PracticeAutomation.openCart.stepDefinitions;

import PracticeAutomation.Hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
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

    @Cuando("el usuario selecciona el producto, elige una opcion y lo agrega al carrito")
    public void elUsuarioSeleccionaElProductoEligeUnaOpcionYLoAgregaAlCarrito() {
        cartPage.seleccionarCamara();
        Assert.assertTrue(cartPage.nombreCamara());
        cartPage.seleccionarOpciones();
        cartPage.seleccionarColor();
        cartPage.agregarAlCarrito();
    }
    @Cuando("el usuario ingresa al carrito")
    public void elUsuarioIngresaAlCarrito() {
        cartPage.seleccionarCarrito();
        cartPage.verCarrito();
    }
    @Entonces("el usuario posee un producto en el carrito")
    public void elUsuarioPoseeUnProductoEnElCarrito() {
        Assert.assertTrue(cartPage.existeUnProucto());
    }
}
