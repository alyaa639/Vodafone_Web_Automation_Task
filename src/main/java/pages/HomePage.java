package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By homeTitle = By.xpath("//a[text()='Home']");
    private By keyboardCheckBox = By.xpath("//button[contains(text(), 'keyboard')]");
    private By applyButton = By.xpath("//button[text()='Apply']");
    private By laptopCheckBox = By.xpath("//button[span[@class='checkmark'] and contains(text(), 'laptop')]") ;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public Boolean getHomeTitle() {
        return findElement(homeTitle).isDisplayed();
    }
    public void clickOnKeyboardCheckBox() {
        findElement(keyboardCheckBox).click();
    }
    public void clickOnApplyButton() {
        scrollToElement(applyButton);
        findElement(applyButton).click();
    }
    public void clickOnLaptopCheckBox(){
        findElement(laptopCheckBox).click();
    }
}