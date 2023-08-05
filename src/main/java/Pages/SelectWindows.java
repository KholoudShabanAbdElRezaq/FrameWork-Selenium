package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectWindows {
    private WebDriver webDriver;
    //Shopping cart
    private By addToCartWindowsProduct = By.xpath("//button[@id='add-to-cart-button-11']");
    private  By goToCartButton = By.xpath("//button[@class='button-1 cart-button']");

    private By Shopping = By.linkText("Shopping cart");

    public SelectWindows(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Checkout addtocart() {
        webDriver.findElement(addToCartWindowsProduct).click();
        return new Checkout(webDriver);
    }
    public Checkout clickGoToCart(){
        webDriver.findElement(Shopping).click();
        return new Checkout(webDriver);


    }



}
