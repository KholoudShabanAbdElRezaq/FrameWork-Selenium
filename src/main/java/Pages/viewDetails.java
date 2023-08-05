package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class viewDetails {
    private WebDriver webDriver;
    private By FirstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By LastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By Email = By.xpath("//input[@id='BillingNewAddress_Email']");
    private By countryField = By.xpath("//select[@data-trigger=\"country-select\"]");
    private By cityField = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    private By addressField = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");

    private By postalCodeField = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    private By phoneNumberField = By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    private By saveBuildingAddressBtn = By.xpath("//button[@onclick=\"Billing.save()\"]");


    public viewDetails(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setFirstName(String FirstNamee) {
        webDriver.findElement(FirstName).sendKeys(FirstNamee);

    }

    public void setLastName(String LastNamee) {
        webDriver.findElement(LastName).sendKeys(LastNamee);

    }

    public void setEmailll(String Emaillll) {
        webDriver.findElement(Email).sendKeys(Emaillll);

    }

    public void setCountryField(String countryFieldddd) {
        webDriver.findElement(countryField).sendKeys(countryFieldddd);

    }

    public void setCityField(String cityFieldddd) {
        webDriver.findElement(cityField).sendKeys(cityFieldddd);

    }

    public void setAdreesField(String addressFieldddd) {
        webDriver.findElement(addressField).sendKeys(addressFieldddd);

    }

    public void setpostalCodeField(String postalCodeFielddddd) {
        webDriver.findElement(postalCodeField).sendKeys(postalCodeFielddddd);

    }

    public void setPhoneNumberField(String phoneNumberFieldddd) {
        webDriver.findElement(phoneNumberField).sendKeys(phoneNumberFieldddd);

    }

    public Shippingaddress setsavebutton()
    {
        webDriver.findElement(saveBuildingAddressBtn).click();
        return  new Shippingaddress(webDriver);

    }






}
