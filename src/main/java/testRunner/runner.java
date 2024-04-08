package testRunner;
import org.openqa.selenium.WebDriver;

import utility.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions","Util"},
        tags =   "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html"
        }

)


public class runner  extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();

}