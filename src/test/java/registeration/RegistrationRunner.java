package registeration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
    @CucumberOptions(
            features = "registeration/Registration.feature",
            glue = "registeration",
            plugin = {
                    "pretty",
                    "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                    "json:target/cucumber-report.json"
            }
    )

    public class RegistrationRunner extends AbstractTestNGCucumberTests {

    }
