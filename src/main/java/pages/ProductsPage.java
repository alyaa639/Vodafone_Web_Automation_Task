package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
     private By KeyboardProducts = By.xpath("//a[contains(text(), 'Keyboard')]") ;
     private By KeyBoardAndMouseProduct = By.xpath("//a[text()='Logitech Wireless Keyboard and Mouse Combo - Black (MK270)']") ;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public Boolean checkElementsContainKeyboard(){
        return findElement(KeyboardProducts).isDisplayed() ;
    }
    public void clickOnKeyBoardItem(){
        scrollUp(KeyBoardAndMouseProduct);
        findElement(KeyBoardAndMouseProduct).click();
    }
}
