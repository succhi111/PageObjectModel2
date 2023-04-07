package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseClass {
RegistrationPage registrationPage;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        registrationPage=new RegistrationPage();
    }
    @DataProvider
    public Object[][] getRegisterTestData() {
        return Utility.getTestData("register");
    }

    @Test(dataProvider = "getRegisterTestData")
    public void registerTest(String FirstName ,String LastName,String RegMail,String ConfRegMail,String RegPass,String Day,String Month,String Year) {
       loginPage = registrationPage.register(FirstName,LastName,RegMail,ConfRegMail,RegPass,Day,Month,Year);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}