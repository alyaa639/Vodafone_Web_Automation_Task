package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage{

    private By accountProfileIcon= By.cssSelector(".same-style.account-setting");
    private By registerOption = By.cssSelector("a[href='/register']");

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnAccountProfileIcon(){
        findElement(accountProfileIcon).click();
    }
    public void clickOnRegisterOptionInProfileIconDropdownMenu(){
        findElement(registerOption).click();
    }
}
