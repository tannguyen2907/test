package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//feature
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        //dryrun = true is for the clean step in testing
        glue = "stepDefinitions", tags = "@Tester", dryRun = true,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"})
public class TestRunner {

}
