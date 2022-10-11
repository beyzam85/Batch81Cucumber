package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
       // tags = "@grup1 or @grup2",
        tags = "@Background",
        dryRun = false // true yapınca browser caliştırmadan test eder


)


public class Runner2 {
}
