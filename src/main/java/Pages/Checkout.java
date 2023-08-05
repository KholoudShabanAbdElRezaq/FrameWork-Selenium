package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    private WebDriver webDriver;
    private By checkOutButton = By.id("checkout");
    private By termOfSeviceBox = By.id("termsofservice");
    private final By Close = By.xpath("//button[@title='Close']");

    public Checkout(WebDriver webDriver) {
        this.webDriver = webDriver;


    }

    public void clickTermOfServiceBox() {
        webDriver.findElement(termOfSeviceBox).click();
    }
    public void closeTermOfServiceBox() {
        webDriver.findElement(Close).click();
    }

    public CheckAsGuest clickCheckOutBtn() {
        webDriver.findElement(checkOutButton).click();
        return new CheckAsGuest(webDriver);
    }

}
