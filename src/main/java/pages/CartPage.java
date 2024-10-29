package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    private By keyboardName = By.xpath("//td[@class='product-name']/a[text()='Logitech Wireless Keyboard and Mouse Combo - Black (MK270)']") ;
    private By laptopName = By.xpath("//a[contains(text(), 'Dell Chromebook 11 3120')]") ;
    private By keyboardPrice = By.xpath("//span[text()='$33.00']") ;
    private By laptopPrice = By.xpath("//td[@class='product-subtotal' and text()='$700.00']") ;
    private By grandTotal = By.xpath("//span[contains(text(), '$733.00')]") ;
    private By proceedToCheckout = By.xpath("//a[text()='Proceed to Checkout']") ;
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public Boolean getKeyboardName(){
      return   findElement(keyboardName).isDisplayed() ;
    }
    public Boolean getLaptopName(){
        scrollDown(laptopName);
        return   findElement(laptopName).isDisplayed() ;
    }
    public Boolean getKeyboardPrice(){
        return   findElement(keyboardPrice).isDisplayed() ;
    }
    public Boolean getLaptopPrice(){
        return   findElement(laptopPrice).isDisplayed() ;
    }
    public String getKeyboardPriceValue(){
        return  findElement(keyboardPrice).getText() ;
    }
    public String getLaptopPriceValue(){
        return  findElement(laptopPrice).getText() ;
    }
    public String getGrandTextValue(){
        scrollDown(grandTotal);
        return findElement(grandTotal).getText() ;
    }
    public void clickOnProceedToCheckoutButton(){
        scrollDown(proceedToCheckout);
        findElement(proceedToCheckout).click();
    }
    public static String trimPrice(String price) {
        String trimmedPrice = price.replace("$", "");
        int decimalIndex = trimmedPrice.indexOf(".");
        if (decimalIndex != -1) {
            trimmedPrice = trimmedPrice.substring(0, decimalIndex);
        }
        return trimmedPrice.trim();
    }

}
