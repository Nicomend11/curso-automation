package PracticeAutomation;


import org.example.ClaseAutomation.ClasesOpenCart.HomePage;
import org.example.ClaseAutomation.ClasesOpenCart.LoginPage;
import org.example.ClaseAutomation.ClasesOpenCart.myAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        myAccountPage myAccountPage = new myAccountPage(getDriver());

        homePage.accederAlLogin();

        loginPage.login("noreply@gmail.com", "Nicolas1");

         Assert.assertTrue(myAccountPage.tituloEsVisible("MY ACCOUNT"));
    }

}
