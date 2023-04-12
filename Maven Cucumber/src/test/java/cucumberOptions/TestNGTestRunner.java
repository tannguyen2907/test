package cucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/java/features/searchProduct.feature",
        glue = "stepDefinitions",
        dryRun = true,
        monochrome = true
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
