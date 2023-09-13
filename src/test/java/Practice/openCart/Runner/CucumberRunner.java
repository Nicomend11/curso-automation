package Practice.openCart.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.ClaseAutomation.stepDefinitions","org.example.ClaseAutomation.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
