package Register;

import Pages.RegisterContiunePage;
import Pages.RegisterPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @Test
    public  void RegisterTestsFun()
    {
        RegisterPage registerPage= homePage.clickbuttonRegister();
        registerPage.setgenderFemaleField("Female");
        registerPage.setFirstnameField("Alyaa");
        registerPage.setLastNameField("ALi");
        registerPage.setDateOfBirthDayField("18");
        registerPage.setDateOfBirthMonthField("April");
        registerPage.setDateOfBirthYearField("2000");
        registerPage.setPasswordField("Alyaa12345678");
        registerPage.setConfirmPasswordField("Alyaa12345678");
        registerPage.setEmailField("AlyaaAli@gmail.com");
        RegisterContiunePage RegisterContiunePage= registerPage.setregisterButton();
         RegisterContiunePage.clickContinue();


    }
}
