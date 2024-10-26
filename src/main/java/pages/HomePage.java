package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By homeTitle= By.xpath("//a[text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
   public Boolean getHomeTitle(){
        return findElement(homeTitle).isDisplayed() ;
   }
}
