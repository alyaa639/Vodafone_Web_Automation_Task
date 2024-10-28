package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebsiteHeader extends BasePage{
    private By emptyCartIcon = By.xpath("//span[@class='count-style' and text()='0']") ;
    private By cartContainOneElement = By.xpath("//span[@class='count-style' and text()='1']") ;
    private By productSectionIcon = By.xpath("//a[@href='/shop-grid-standard' and text()='Products']") ;
    public WebsiteHeader(WebDriver driver) {
        super(driver);
    }
    public Boolean getEmptyCart(){
        return findElement(emptyCartIcon).isDisplayed() ;
    }
    public Boolean getCartContainOneElement(){
        return findElement(cartContainOneElement).isDisplayed() ;
    }
    public void clickOnProductSectionIcon(){
        findElement(productSectionIcon).click();
    }
}
