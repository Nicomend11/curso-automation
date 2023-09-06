package Practice;


import org.example.ClaseAutomation.Clases.HomePage;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Ignore
    @Test
    public void ingresarAlHome() {
        this.getDriver().get("http://www.automationpractice.pl/index.php?");
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