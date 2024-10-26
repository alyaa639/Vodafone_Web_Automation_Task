package registeration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    @CucumberOptions(
            features = "src/test/java/registeration/Registration.feature",
            glue = "src/test/java/registeration",
            plugin = {
                    "pretty",
                   // "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                    "json:target/cucumber-report.json"
            }
    )

    public class RegistrationRunner extends AbstractTestNGCucumberTests {

    }
