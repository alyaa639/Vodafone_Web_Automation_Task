package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopProductPage extends BasePage{
    private By dellLaptop = By.xpath("//a[contains(text(), 'Dell Chromebook 11 3120')]") ;
    private By addToCartButton = By.xpath("//button[normalize-space()='Add To Cart']") ;
    public LaptopProductPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnDellLaptop(){
        scrollUp(dellLaptop);
        findElement(dellLaptop).click();
    }
    public String getLaptopProduct(){
       return findElement(dellLaptop).getText() ;
    }
    public void clickOnAddToCartButton() {
        findElement(addToCartButton).click();
    }
}
