package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            // Find the element using the locator
            WebElement element = driver.findElement(locator);
            // Scroll to the element
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found for scrolling down: " + locator);
        }
    }

    // Method to scroll up to an element
    public void scrollUp(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            // Find the element using the locator
            WebElement element = driver.findElement(locator);
            // Scroll to the element
            js.executeScript("arguments[0].scrollIntoView(false);", element);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found for scrolling up: " + locator);
        }
    }

    public WebElement findElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            System.out.println("Element located by " + locator + " not visible after 10 seconds");
            return null;
        }
    }
    public void doubleClick(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + locator);
        }
    }
    public void clickWithJS(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(locator));
    }
}
