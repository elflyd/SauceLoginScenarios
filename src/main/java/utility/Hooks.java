package utility;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    WebDriver driver;
    Properties properties;


    @Before
    public void before(){
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties= ConfigReader.initialize_Properties();
        driver= DriverFactory.initalize_Driver(browser);
    }

    @After
    public void after(){
        driver.quit();
    }

}
