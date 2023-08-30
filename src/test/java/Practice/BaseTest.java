package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

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

        this.getDriver().get("http://www.automationpractice.pl/index.php?");
    }

    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
