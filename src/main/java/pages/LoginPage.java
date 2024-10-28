package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By emailField= By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[text()='Login']") ;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterEmailInEmailField(String email){
        findElement(emailField).sendKeys(email);
    }
    public void enterPasswordInPasswordField(String password){findElement(passwordField).sendKeys(password);}
    public void clickOnLoginButton(){ findElement(loginButton).click();}



}
