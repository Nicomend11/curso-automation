package org.example.ClaseAutomation.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.ClaseAutomation.stepDefinitions"}
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
