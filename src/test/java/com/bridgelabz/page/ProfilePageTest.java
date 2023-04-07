package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;

    EditProfilePage editProfilePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("8109555221", "Test12345");
        profilePage = new ProfilePage();
        editProfilePage=new EditProfilePage();
    }

    @Test
    public void verifyProfilePageTitleTest() {
        String proPageTitle = profilePage.verifyProfilePageTitle();
        Assert.assertEquals(proPageTitle, "John Smith|Facebook");
    }

    @Test
    public void gotoEditProfileTest() throws InterruptedException {
        editProfilePage = profilePage.gotoEditProfile();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
