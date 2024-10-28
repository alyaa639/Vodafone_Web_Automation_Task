package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.io.IOException;

public class TestBase {

   protected LandingPage landingPage = new LandingPage(driver);
   public RegistrationPage registrationPage = new RegistrationPage(driver);
   public LoginPage loginPage= new LoginPage(driver) ;
    public HomePage homePage = new HomePage(driver) ;
   public ProductsPage productsPage = new ProductsPage(driver) ;
   public KeyboardProductPage keyboardProductPage = new KeyboardProductPage(driver) ;
   public WebsiteHeader websiteHeader = new WebsiteHeader(driver) ;
    public static WebDriver driver;


    public void driverSetUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-react.sdetunicorns.com/");


    }
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
