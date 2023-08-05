package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckAsGuest {
    private WebDriver webDriver;
    private By CheckoutasGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    //Checkout as Guest

    public CheckAsGuest(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public viewDetails ClickonbuttonCheckAsGuest()
    {
        webDriver.findElement(CheckoutasGuest).click();
        return new viewDetails(webDriver);
    }

}
