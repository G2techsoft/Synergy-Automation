package TestRunner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"src/test/java/Features/Login.feature"},
                glue = {"Glues"},
                monochrome = true,
                dryRun =false,
                plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

public class Testrunner{
}
