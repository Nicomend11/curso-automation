package Nicomend11;

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

public class EsperasTest {

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

//        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void waitUntilTest() {
        this.driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

//        WebElement startBtn = this.driver.findElement(By.xpath("//div[@id='start']/button"));
//        startBtn.click();
//        WebElement titulo = this.driver.findElement(By.xpath("//div[@id='finish']/h4"));
//        Assert.assertEquals(titulo.getText(), "Hello World!");

        WebElement startBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']/button")));
        startBtn.click();

        boolean estado = wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id='finish']/h4"), "Hello World!"));

        Assert.assertTrue(estado);
    }

    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}