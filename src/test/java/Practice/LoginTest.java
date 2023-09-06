package Practice;


import org.example.ClaseAutomation.Clases.HomePage;
import org.example.ClaseAutomation.Clases.LoginPage;
import org.example.ClaseAutomation.Clases.myAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        myAccountPage myAccountPage = new myAccountPage(getDriver());

        homePage.accederAlLogin();

        loginPage.login("pepe@pepe.com", "123456789");

         Assert.assertTrue(myAccountPage.tituloEsVisible("MY ACCOUNT"));
    }

}
