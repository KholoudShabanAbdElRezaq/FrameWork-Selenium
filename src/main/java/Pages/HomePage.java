package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class HomePage {
    private WebDriver webDriver;
    private By Register = By.linkText("Register");
    //Log in
    private By Log = By.linkText("Log in");
    private By Computer = By.linkText("Computers");
    private By SoftwareItem = By.linkText("Software");
    private  By selectwindowss=By.linkText("Windows 8 Pro");
    private By addToCartWindowsProductt = By.xpath("//button[@id='add-to-cart-button-11']");
    private  By goToCartButtonn = By.xpath("//button[@class='button-1 cart-button']");
    private By checkOutButtonn = By.id("checkout");
    private By CheckoutasGuestt = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    private By saveBuildingAddressBtnnn = By.xpath("//button[@onclick=\"Billing.save()\"]");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Step
    public RegisterPage clickbuttonRegister() {
        webDriver.findElement(Register).click();
        return new RegisterPage(webDriver);
    }

    @Step
    public LoginPage clickbuttonLogin() {
        webDriver.findElement(Log).click();
        return new LoginPage(webDriver);
    }

    public ShoppingCartPage setbuttonshopping() {
        webDriver.findElement(Computer).click();
        return new ShoppingCartPage(webDriver);
    }
    public SoftwareCatagory setbuttonSoftwareCatagory() {
        webDriver.findElement(SoftwareItem).click();
        return new SoftwareCatagory(webDriver);
    }
    public SoftwareCatagory setbuttonwinsowsCatagory() {
        webDriver.findElement(selectwindowss).click();
        return new SoftwareCatagory(webDriver);
    }
    public SelectWindows addtocartt() {
        webDriver.findElement(addToCartWindowsProductt).click();
        return new SelectWindows(webDriver);
    }

    public SelectWindows Gotocartt() {
        webDriver.findElement(goToCartButtonn).click();
        return new SelectWindows(webDriver);
    }

    public Checkout clickonbuttonc()
    {
        webDriver.findElement(checkOutButtonn).click();
        return  new Checkout(webDriver);

    }
    public CheckAsGuest clickonbuttonCheckAsGuest()
    {
        webDriver.findElement(CheckoutasGuestt).click();
        return  new CheckAsGuest(webDriver);
    }
    public  viewDetails clickoncontintosavedetails()
    {
        webDriver.findElement(saveBuildingAddressBtnnn).click();
        return  new viewDetails(webDriver);
    }


}
