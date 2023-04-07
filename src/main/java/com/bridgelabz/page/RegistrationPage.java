package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {

    @FindBy(linkText = "Create new account")
    private WebElement regBtn;

    @FindBy(name = "firstname")
    private WebElement FirstName;

    @FindBy(name = "lastname")
    private WebElement LastName;

    @FindBy(name = "reg_email__")
    private WebElement RegMail;

    @FindBy(name = "reg_email_confirmation__")
    private WebElement ConfRegMail;

    @FindBy(name = "reg_passwd__")
    private WebElement RegPass;

    @FindBy(id = "day")
    private WebElement Day;

    @FindBy(id = "month")
    private WebElement Month;

    @FindBy(id = "year")
    private WebElement Year;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    private WebElement Gender;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage register(String fname, String lname, String regemail, String confregmail, String regpass, String day, String month, String year) {
        regBtn.click();
        FirstName.sendKeys(fname);
        LastName.sendKeys(lname);
        RegMail.sendKeys(regemail);
        ConfRegMail.sendKeys(confregmail);
        RegPass.sendKeys(regpass);
        Day.sendKeys(day);
        Month.sendKeys(month);
        Year.sendKeys(year);
        Gender.click();

      return new LoginPage();

    }

}
