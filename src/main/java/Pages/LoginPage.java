package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By EmailField = By.xpath("//input[@id='Email']");
    private By PasswordField = By.xpath("//input[@id='Password']");
    private final By loginConfButton =By.xpath("//button[@class='button-1 login-button']");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setEmailField(String Email) {
        webDriver.findElement(EmailField).sendKeys(Email);

    }

    public void setPasswordField(String password) {
        webDriver.findElement(PasswordField).sendKeys(password);

    }
    public HomePage setLoginButton() {
        webDriver.findElement(loginConfButton).click();
        return new HomePage(webDriver);
    }



}
