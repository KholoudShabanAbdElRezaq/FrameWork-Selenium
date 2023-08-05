package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver webDriver;
    private By genderFemaleField = By.xpath("//input[@value='F']");
    private By FirstnameField = By.xpath("//input[@id='FirstName']");
    private By LastNameField = By.xpath("//input[@id='LastName']");
    private By DateOfBirthDayField = By.xpath("//select[@name='DateOfBirthDay']");
    private By DateOfBirthMonthField = By.xpath("//select[@name='DateOfBirthMonth']");
    private By DateOfBirthYearField = By.xpath("//select[@name='DateOfBirthYear']");
    private By emailField = By.xpath("//input[@id='Email']");
    private By PasswordField = By.xpath("//input[@id='Password']");
    private By ConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    private By registerButton = By.xpath("//button[@id='register-button']");

    public RegisterPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setgenderFemaleField(String genderFemale) {
        webDriver.findElement(genderFemaleField).sendKeys(genderFemale);

    }

    public void setFirstnameField(String Firstname) {
        webDriver.findElement(FirstnameField).sendKeys(Firstname);
    }

    public void setLastNameField(String Lastname) {
        webDriver.findElement(LastNameField).sendKeys(Lastname);
    }

    public void setDateOfBirthDayField(String DateOfBirthDay) {
        webDriver.findElement(DateOfBirthDayField).sendKeys(DateOfBirthDay);
    }

    public void setDateOfBirthMonthField(String DateOfBirthMonth) {
        webDriver.findElement(DateOfBirthMonthField).sendKeys(DateOfBirthMonth);
    }

    public void setDateOfBirthYearField(String DateOfBirthYear) {
        webDriver.findElement(DateOfBirthYearField).sendKeys(DateOfBirthYear);
    }

    public void setEmailField(String EmailField) {
        webDriver.findElement(emailField).sendKeys(EmailField);
    }

    public void setPasswordField(String Password) {
        webDriver.findElement(PasswordField).sendKeys(Password);
    }

    public void setConfirmPasswordField(String ConfirmPassword) {
        webDriver.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
    }

    public RegisterContiunePage setregisterButton() {
        webDriver.findElement(registerButton).click();
        return new RegisterContiunePage(webDriver);
    }


}
