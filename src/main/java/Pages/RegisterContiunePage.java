package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterContiunePage {
    private WebDriver webDriver;
    private By continueBtn = By.xpath("//a[@class='button-1 register-continue-button']");


    public RegisterContiunePage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public HomePage clickContinue(){
        webDriver.findElement(continueBtn).click();
        return  new HomePage(webDriver);
    }

}
