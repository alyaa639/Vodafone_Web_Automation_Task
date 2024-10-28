package purchase_products;
import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PurchaseProductStepDefs extends TestBase {
    @When("click on login option in profile icon drop down menu in landing screen")
    public void clickOnLoginOptionInProfileIconDropDownMenuInLandingScreen() {
        landingPage.clickOnLoginOptionInProfileIconDropdownMenu();
    }

    @When("enter email {string} in email field in login page")
    public void enterUsernameInUsernameFieldInLoginPage(String email) {
        loginPage.enterEmailInEmailField(email);
    }

    @When("enter password in password {string} field in login page")
    public void enterPasswordInPasswordFieldInLoginPage(String password) {
        loginPage.enterPasswordInPasswordField(password);
    }

    @When("click on login button in login page")
    public void clickOnLoginButtonInLoginPage() {
        loginPage.clickOnLoginButton();
    }

    @When("click on keyboard checkbox in Categories section in home page")
    public void clickOnKeyboardCheckboxInCategoriesSectionInHomePage() {
        homePage.clickOnKeyboardCheckBox();
    }

    @When("click on apply button in home page")
    public void clickOnApplyButtonInHomePage() {
        homePage.clickOnApplyButton();
    }

    @Then("All items appear should be keyboard items only in products page")
    public void allItemsAppearShouldBeKeyboardItemsOnlyInProductsPage() {
      Assert.assertTrue(productsPage.checkElementsContainKeyboard());
    }

    @When("click on keyboard product in products page")
    public void clickOnKeyboardProductInProductsPage() {
        productsPage.clickOnKeyBoardItem();
    }

    @Then("product name {string} and product price {string} should appear in keyboard page")
    public void productNameAndProductPriceShouldAppearInKeyboardPage(String keyboardProduct, String price) {
        Assert.assertEquals(keyboardProductPage.getKeyboardProductName() ,keyboardProduct );
        Assert.assertEquals(keyboardProductPage.getKeyboardProductPrice() ,price );
    }

    @Then("cart should be empty in the header")
    public void cartShouldBeEmptyInTheHeader() {
        Assert.assertTrue(websiteHeader.getEmptyCart());
    }

    @When("click on add to cart button in keyboard page")
    public void clickOnAddToCartButtonInKeyboardPage() {
        keyboardProductPage.clickOnAddToCartButton();
    }

    @Then("success message {string} should appear successfully keyboard page")
    public void successMessageShouldAppearSuccessfullyKeyboardPage(String successMessage) {
        Assert.assertEquals(keyboardProductPage.getSuccessMessage() , successMessage);

    }

    @Then("cart should contain one element in the header")
    public void cartShouldContainOneElementInTheHeader() {
        Assert.assertTrue(websiteHeader.getCartContainOneElement());
    }

    @When("click on products button in the header")
    public void clickOnProductsButtonInTheHeader() {
        websiteHeader.clickOnProductSectionIcon();
    }

    @When("Click on laptop checkbox in categories section in home page")
    public void clickOnLaptopCheckboxInCategoriesSectionInHomePage() {
        homePage.clickOnLaptopCheckBox();
    }

    @When("click on laptop product {string} in laptops page")
    public void clickOnLaptopProductInLaptopsPage(String arg0, String arg1) {
    }

    @When("click on add to cart button in laptops page")
    public void clickOnAddToCartButtonInLaptopsPage() {
    }

    @When("click on cart button in the header")
    public void clickOnCartButtonInTheHeader() {
    }

    @When("click in view cart button in the header")
    public void clickInViewCartButtonInTheHeader() {
    }

    @Then("title and price for products appear successfully in cart page")
    public void titleAndPriceForProductsAppearSuccessfullyInCartPage() {
    }

    @Then("total price should be equal to the sum of the products in cart page")
    public void totalPriceShouldBeEqualToTheSumOfTheProductsInCartPage() {
    }

    @When("click on proceed to checkout button in cart page")
    public void clickOnProceedToCheckoutButtonInCartPage() {
    }

    @When("select country {string} and region {string} in shipping details section in cart page")
    public void selectCountryAndRegionInShippingDetailsSectionInCartPage(String arg0, String arg1, String arg2, String arg3) {
    }

    @When("enter address {string} in address field and postal code {string} in code field  and phone number {string} in phone field in shipping details section in cart page")
    public void enterAddressInAddressFieldAndPostalCodeInCodeFieldAndPhoneNumberInPhoneFieldInShippingDetailsSectionInCartPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
    }

    @When("click on cash on delivery check box in shipping details section in cart page")
    public void clickOnCashOnDeliveryCheckBoxInShippingDetailsSectionInCartPage() {
    }

    @When("click on confirm button in shipping details section in cart page")
    public void clickOnConfirmButtonInShippingDetailsSectionInCartPage() {
    }

    @When("click on the order number in order summary page")
    public void clickOnTheOrderNumberInOrderSummaryPage() {
    }

    @Then("shipping address should be {string} in order summary page")
    public void shippingAddressShouldBeInOrderSummaryPage(String arg0, String arg1) {
    }
}
