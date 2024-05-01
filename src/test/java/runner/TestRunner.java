package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = "src/test/java/feature/",
        glue={"stepDefinition"},
        monochrome = true
        )

public class TestRunner {

}