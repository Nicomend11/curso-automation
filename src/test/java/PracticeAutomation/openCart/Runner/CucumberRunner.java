package PracticeAutomation.openCart.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"PracticeAutomation.openCart.stepDefinitions","PracticeAutomation.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
