package purchase_products;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/purchase_products/PurchaseProduct.feature",
        glue = {"registeration" ,"purchase_products"} ,
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-report.json"
        }
)

public class PurchaseProductsrRunner extends AbstractTestNGCucumberTests{
}
