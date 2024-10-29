package purchase_products;
import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static pages.CartPage.trimPrice;

public class PurchaseProductStepDefs extends TestBase {
    @When("click on login option in profile icon drop down menu in landing screen")
    public void clickOnLoginOptionInProfileIconDropDownMenuInLandingScreen(){
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
    public void clickOnApplyButtonInHomePage() throws InterruptedException {
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

    @When("click on laptop product in laptops page")
    public void clickOnLaptopProductInLaptopsPage() {
        laptopProductPage.clickOnDellLaptop();
    }
    @When("click on add to cart button in laptops page")
    public void clickOnAddToCartButtonInLaptopsPage() {
        laptopProductPage.clickOnAddToCartButton();
    }

    @When("click on cart button in the header")
    public void clickOnCartButtonInTheHeader() {
        websiteHeader.clickOnShoppingCartIcon();
    }

    @When("click in view cart button in the header")
    public void clickInViewCartButtonInTheHeader() {
        websiteHeader.clickOnViewCartOption();
    }

    @Then("title and price for products appear successfully in cart page")
    public void titleAndPriceForProductsAppearSuccessfullyInCartPage() {
        Assert.assertTrue( cartPage.getKeyboardPrice());
        Assert.assertTrue(cartPage.getKeyboardName());
        Assert.assertTrue(cartPage.getLaptopName());
        Assert.assertTrue(cartPage.getLaptopPrice());
    }

    @Then("total price should be equal to the sum of the products in cart page")
    public void totalPriceShouldBeEqualToTheSumOfTheProductsInCartPage() {
      int keyboardPrice = Integer.parseInt(trimPrice(cartPage.getKeyboardPriceValue()));
      int laptopPrice = Integer.parseInt(trimPrice(cartPage.getLaptopPriceValue()));
      int grandTotal = Integer.parseInt(trimPrice(cartPage.getGrandTextValue()));
      int totalSumOfProductsValue = keyboardPrice + laptopPrice ;
      Assert.assertEquals(grandTotal ,totalSumOfProductsValue );
    }

    @When("click on proceed to checkout button in cart page")
    public void clickOnProceedToCheckoutButtonInCartPage() {
        cartPage.clickOnProceedToCheckoutButton();
    }

    @When("select country Egypt and region cairo in shipping details page")
    public void selectCountryAndRegionInShippingDetailstPage() throws InterruptedException {
        shippingDetailsPage.selectOnEgyptCountry();
        shippingDetailsPage.clickOnAlexandriaRegionOption();
    }

    @When("enter address {string} in address field and postal code {string} in code field  and phone number {string} in phone field in shipping details page")
    public void enterAddressInAddressFieldAndPostalCodeInCodeFieldAndPhoneNumberInPhoneFieldInShippingDetailsPage(String address, String code , String phoneNum) {
        shippingDetailsPage.enterAddressInAddressField(address);
        shippingDetailsPage.enterCodeInPostalCodeField(code);
        shippingDetailsPage.enterPhoneNumberInPhoneNumberField(phoneNum);
    }

    @When("click on cash on delivery check box in shipping details page")
    public void clickOnCashOnDeliveryCheckBoxInShippingDetailsPage() {
        shippingDetailsPage.clickOnCashInDeliveryCheckBox();
    }

    @When("click on confirm button in shipping details page")
    public void clickOnConfirmButtonInShippingDetailsPage() {
        shippingDetailsPage.clickOnconfirmButton();
    }

    @When("click on the order number in order summary page")
    public void clickOnTheOrderNumberInOrderSummaryPage() {
        orderSummaryPage.clickOnOrderNumber();
    }

    @Then("shipping address should be {string} in order summary page")
    public void shippingAddressShouldBeInOrderSummaryPage(String shippingAddress) {
        Assert.assertEquals( orderSummaryPage.getShippingAddress() ,shippingAddress );

    }


    @Then("laptop name should be  {string} in laptop screen")
    public void laptopNameShouldBeInLaptopScreen(String laptopProduct) {
        Assert.assertTrue(laptopProductPage.getLaptopProduct().contains(laptopProduct), "Text does not contain the expected partial text.");

    }
    @Then("total price should be equal {string} in order summary page")
    public void totalPriceShouldBeEqualInOrderSummaryPage(String totalPrice) {
       Assert.assertEquals(orderSummaryPage.getTotalPrice() ,totalPrice );
    }
}
