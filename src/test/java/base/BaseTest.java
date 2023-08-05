package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver webDriver;
    protected HomePage homePage;
   @BeforeClass
   public  void SetUp()
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        webDriver=new ChromeDriver(co);
        webDriver.get("https://demo.nopcommerce.com/");
        webDriver.manage().window().maximize();
        homePage=new HomePage(webDriver);
    }
   // @AfterClass
    public void  TearDown()
    {
        webDriver.quit();
    }


}
