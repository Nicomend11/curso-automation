package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeClase9 {

    private WebDriver driver;

    private WebDriverWait wait;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);

        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    @Test
    public void ingresaAlHome() {
        this.driver.get("http://www.automationpractice.pl/index.php?");
    }

    @Test
    public void loginCorrecto() {
        this.driver.get("http://www.automationpractice.pl/index.php?");

        //Acceso a la pagina
        WebElement signInBtn = this.wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
        signInBtn.click();

        // Ingreso email y password
        WebElement emailInput = this.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        emailInput.sendKeys("noreply9@gmail.com");

        WebElement passInput = this.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
        passInput.sendKeys("noreply9");

        WebElement loginBtn = this.wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        loginBtn.click();

        //Validacion del Login
        boolean titlePage = this.wait.until(ExpectedConditions.textToBe(By.xpath("//h1[@class = 'page-heading']"), "MY ACCOUNT"));

    }

    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}

//noreply9@gmail.com
//        noreply9