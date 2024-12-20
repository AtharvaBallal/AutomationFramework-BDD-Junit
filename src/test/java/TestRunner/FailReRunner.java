package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@src/test/resources/RerunLog/Rerun.txt",
        glue = {"StepDefinitions", "AppHooks"},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:src/test/resources/Reports/test-output-thread/",
                "rerun:src/test/resources/RerunLog/Rerun.txt"
        }

)
public class FailReRunner {

}
