package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwareCatagory {
    private WebDriver webDriver;
    private By Software = By.linkText("Software");
    private  By selectwindows=By.linkText("Windows 8 Pro");


    public SoftwareCatagory(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SelectWindows setSelectButton() {
        webDriver.findElement(Software).click();
        return new SelectWindows(webDriver);
    }
    public SelectWindows setSelectButtonwinsows() {
        webDriver.findElement(selectwindows).click();
        return new SelectWindows(webDriver);
    }


}
