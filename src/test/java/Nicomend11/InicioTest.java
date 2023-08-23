package Nicomend11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class InicioTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);
    }

    @Test
    public void ingresarAlInicio() {
        this.driver.get("http://www.automationpractice.pl/index.php?");
    }

    @Test
    public void validarHome() {
        this.driver.get("http://www.automationpractice.pl/index.php?");

        WebElement busquedaInput = this.driver.findElement(By.id("search_query_top"));
        WebElement title = this.driver.findElement(By.xpath("//a[@title='My Shop']"));
        WebElement accesoALoginBtn = this.driver.findElement(By.className("login"));
        WebElement menu = this.driver.findElement(By.id("block_top_menu"));

        Assert.assertTrue(busquedaInput.isDisplayed());
        Assert.assertTrue(title.isDisplayed());
        Assert.assertTrue(accesoALoginBtn.isDisplayed());
        Assert.assertTrue(menu.isDisplayed());
   }

    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

}