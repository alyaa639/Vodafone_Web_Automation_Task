package registeration;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Fakers;

public class RegistrationStepDefs extends TestBase {
    @Given("unicorn website opened successfully")
    public void unicornWebsiteOpenedSuccessfully() {

    }

    @When("click on profile icon in landing screen")
    public void clickOnProfileIconInLandingScreen() {
        landingPage.clickOnAccountProfileIcon();
    }

    @When("click on register option in profile icon drop down menu in landing screen")
    public void clickOnRegisterOptionInProfileIconDropDownMenuInLandingScreen() {
        landingPage.clickOnRegisterOptionInProfileIconDropdownMenu();
    }

    @When("enter username in username field in registration page")
    public void enterUsernameInUsernameFieldInRegistrationPage() {
        registrationPage.enterUserNameInUsernameField(Fakers.generateRandomName());
    }

    @When("enter email in email field in registration page")
    public void enterEmailInEmailFieldInRegistrationPage() {
        registrationPage.enterEmailInEmailField(Fakers.generateRandomEmail());
    }

    @When("enter password in password field in registration page")
    public void enterPasswordInPasswordFieldInRegistrationPage() {
        registrationPage.enterPasswordInPasswordField(Fakers.generateRandomPassword(8));
    }

    @When("select the gender {string} from gender drop down list in registration page")
    public void selectTheGenderFromGenderDropDownListInRegistrationPage(String gender) {
        registrationPage.selectGenderFromGenderDropdownMenu(gender);
    }

    @When("click on register button in registration page")
    public void clickOnRegisterButtonInRegistrationPage()  {
        registrationPage.clickOnRegisterButton();
    }

    @Then("home page appeared successfully")
    public void homePageAppearedSuccessfully()  {
        Assert.assertTrue(homePage.getHomeTitle());
    }
}
