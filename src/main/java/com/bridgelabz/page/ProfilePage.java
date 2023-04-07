package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseClass {

    @FindBy(xpath = "//span[contains(text(),'John Smith')]")
    private WebElement profileLinK;
    @FindBy(xpath = "//span[contains(text(),'Edit profile')]")
    private WebElement editProfileLink;

    // initialization
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyProfilePageTitle() {
        return driver.getTitle();
    }

    public EditProfilePage gotoEditProfile() throws InterruptedException {
        Thread.sleep(3000);
         profileLinK.click();
         Thread.sleep(3000);
        editProfileLink.click();
        return new EditProfilePage();
    }

}
