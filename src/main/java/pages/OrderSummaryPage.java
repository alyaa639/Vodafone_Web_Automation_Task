package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends BasePage{
    private By orderNumber =  By.xpath("//h3[@class='panel-title']") ;
    private By shippingAddress = By.xpath("//h4[@class='mx-4' and contains(text(),'Address 1')]");
    private By totalPrice = By.xpath("//h4[contains(text(), 'Total')]") ;
    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnOrderNumber(){
        findElement(orderNumber).click();
    }
    public String getShippingAddress(){
       return findElement(shippingAddress).getText() ;
    }
    public String getTotalPrice(){
        return findElement(totalPrice).getText() ;
    }
}
