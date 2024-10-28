package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyboardProductPage extends BasePage{
     private By keyboardProductName = By.xpath("//h2[contains(text(), 'Logitech Wireless Keyboard')]") ;
     private By keyboardProductPrice = By.xpath("//span[text()='$33']") ;
     private By addToCartButton = By.xpath("//button[text()=' Add To Cart ']") ;
     private By successMessage = By.xpath("//div[text()='Added To Cart']") ;
    public KeyboardProductPage(WebDriver driver) {
        super(driver);
    }
    public String getKeyboardProductName(){
        return findElement(keyboardProductName).getText() ;
    }
    public String getKeyboardProductPrice(){
        return findElement(keyboardProductPrice).getText() ;
    }
    public String getSuccessMessage(){
        return findElement(successMessage).getText() ;
    }
    public void clickOnAddToCartButton(){
        findElement(addToCartButton).click();
    }
}
