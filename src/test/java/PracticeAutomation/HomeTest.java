package PracticeAutomation;


import org.example.ClaseAutomation.ClasesOpenCart.HomePage;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Ignore
    @Test
    public void ingresarAlHome() {
        this.getDriver().get("https://opencart.abstracta.us/");
    }
    @Test
    public void validarHome() {
        HomePage homePage = new HomePage(getDriver());

        Assert.assertTrue(homePage.busquedaInputEsVisible());
        Assert.assertTrue(homePage.titleEsVisible());
        Assert.assertTrue(homePage.accesoLoginEsVisible());
        Assert.assertTrue(homePage.menuEsVisible());
    }

}