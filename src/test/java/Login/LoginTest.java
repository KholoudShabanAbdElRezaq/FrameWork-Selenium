package Login;

import Pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTestsFun() {
        LoginPage loginPage = homePage.clickbuttonLogin();
        loginPage.setEmailField("AlyaaAli@gmail.com");
        loginPage.setPasswordField("Alyaa12345678");
        loginPage.setLoginButton();
        ShoppingCartPage shoppingCartPage = homePage.setbuttonshopping();
        SoftwareCatagory softwareCatagory = homePage.setbuttonSoftwareCatagory();
        softwareCatagory = homePage.setbuttonwinsowsCatagory();
        SelectWindows selectWindows = homePage.addtocartt();
        selectWindows.clickGoToCart();
        Checkout checkout=homePage.clickonbuttonc();
        checkout.closeTermOfServiceBox();
        checkout.clickTermOfServiceBox();
        homePage.clickonbuttonc();
        CheckAsGuest checkAsGuest=homePage.clickonbuttonCheckAsGuest();
        viewDetails viewDetailsss=homePage.clickoncontintosavedetails();
        viewDetailsss.setFirstName("Kholoud");
        viewDetailsss.setLastName("Shaban");
        viewDetailsss.setEmailll("AlyaaAli@gmail.com");
        viewDetailsss.setCountryField("Egypt");
        viewDetailsss.setCityField("Cairo");
        viewDetailsss.setAdreesField("Cairo");
        viewDetailsss.setpostalCodeField("12345678");
        viewDetailsss.setPhoneNumberField("01286214591");
        viewDetailsss.setsavebutton();


    }


}
