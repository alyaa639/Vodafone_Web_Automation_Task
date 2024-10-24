package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{

    private By accountProfileIcon= By.cssSelector(".same-style.account-setting");
    private By registerOption = By.cssSelector("a[href='/register']");  // More specific, targets the exact link


    public void clickOnAccountProfileIcon(){
        findElement(accountProfileIcon).click();
    }
 public void clickOnRegisterOptionInProfileIconDropdownMenu(){
        findElement(registerOption).click();
 }
}
