package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver webDriver;
    private By Computers = By.linkText("Computers");


    public ShoppingCartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SoftwareCatagory setSelectButton() {
        webDriver.findElement(Computers).click();
        return new SoftwareCatagory(webDriver);
    }


}
