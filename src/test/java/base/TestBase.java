package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigHandler;

import java.util.Properties;

public class TestBase {
    protected WebDriver driver;
    public static Properties properties = new Properties();
    protected static Properties registeartionTestData;
    public void driverSetUp() {
        properties = ConfigHandler.getGeneralDataProperties();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("WebsiteURL"));
    }
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
