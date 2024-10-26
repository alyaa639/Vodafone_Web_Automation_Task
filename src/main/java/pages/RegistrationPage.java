package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{
    private By usernameField = By.xpath("//input[@id='username']") ;
    private By emailField = By.xpath("//input[@type='email']") ;
    private By passwordField = By.xpath("//input[@type='password']") ;
    private By genderDropDownMenu = By.xpath("//select[@name='gender']") ;
    private By femaleOption = By.xpath("//option[@value='male']") ;
    private By maleOption = By.xpath("//option[@value='female']") ;
    private By registerButton = By.xpath("//button[@type='submit']") ;
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void  clickOnRegisterButton()  {
        clickWithJS(registerButton) ;
    }
    public void enterUserNameInUsernameField(String username){
        findElement(usernameField).sendKeys(username);
    }
    public void enterEmailInEmailField(String email){
        findElement(emailField).sendKeys(email);
    }
    public void enterPasswordInPasswordField(String password){
        findElement(passwordField).sendKeys(password);
    }
    public void selectGenderFromGenderDropdownMenu(String gender){
        findElement(genderDropDownMenu).click();
        if ("male".equals(gender) ){
            findElement(maleOption).click();
        }else {
            findElement(femaleOption).click();
        }
    }

}
