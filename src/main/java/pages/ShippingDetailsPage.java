package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingDetailsPage extends BasePage{
    private By countriesDropdownMenu = By.xpath("//select[@name='rcrs-country']") ;
    private By regionDropDownMenu = By.xpath("//select[@name='rcrs-region']") ;
    private By firstAdressField = By.xpath("//input[@name='address1']") ;
    private By postalCodeInputField = By.xpath("//input[@name='postalcode']") ;
    private By phoneNumberField = By.xpath("//input[@name='contact']") ;
    private By cashOnDelieveryCheckBox = By.xpath("//label[contains(text(), 'Cash on Delivery')]/input[@type='checkbox']") ;
    private By confirmButton = By.xpath("//button[contains(@class, 'btn-hover') and text()='Confirm']") ;
    public ShippingDetailsPage(WebDriver driver) {
        super(driver);
    }
    public void selectOnEgyptCountry() throws InterruptedException {
        Thread.sleep(2000);
       scrollDown(countriesDropdownMenu);
        selectCountryOption(driver , countriesDropdownMenu, "Egypt") ;
    }
    public void clickOnAlexandriaRegionOption( ){
        findElement(regionDropDownMenu).click();
        selectCountryOption(driver ,regionDropDownMenu, "Alexandria") ;
    }
    public void enterAddressInAddressField(String address){
        findElement(firstAdressField).sendKeys(address);
    }
    public void enterCodeInPostalCodeField(String code){
        findElement(postalCodeInputField).sendKeys(code);
    }
    public void enterPhoneNumberInPhoneNumberField(String phoneNum){
        findElement(phoneNumberField).sendKeys(phoneNum);
    }
    public void clickOnCashInDeliveryCheckBox(){
        findElement(cashOnDelieveryCheckBox).click();
    }
    public void clickOnconfirmButton(){
        findElement(confirmButton).click();
    }
    public void selectCountryOption(WebDriver driver, By dropdownLocator, String countryName) {
        WebElement selectElement = driver.findElement(dropdownLocator);
        Select countryDropdown = new Select(selectElement);
        try {
            countryDropdown.selectByVisibleText(countryName);
            System.out.println("Country found and selected: " + countryName);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Country not found: " + countryName);
        }
    }
}
