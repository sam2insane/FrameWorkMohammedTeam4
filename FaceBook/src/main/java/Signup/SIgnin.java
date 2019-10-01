package Signup;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class SIgnin extends CommonAPI {

    @FindBy(name = "firstname")
    WebElement firstName;
    @FindBy(name = "lastname")
    WebElement lastName;
    @FindBy(name = "reg_email__")
    WebElement mobileNumberOrEmail;
    @FindBy(name = "reg_email_confirmation__")
    WebElement reEnterEmail;
    @FindBy(name = "reg_passwd__")
    WebElement newPassword;
    @FindBy(xpath = "//*[@id=\"u_0_a\"]")
    WebElement clickForMale;
    @FindBy(css = "#u_0_9")
    WebElement genderFemaleSelection;

    @FindBy(css = "#u_0_a")
    WebElement genderMaleSelection;

    @FindBy(css = "#u_0_b")
    WebElement genderCustomSelection;
    @FindBy(css = "#month")
    WebElement birthdayMonth;
    @FindBy(css = "#day")
    WebElement birthdayDay;
    @FindBy(css = "#year")
    WebElement birthdayYear;

    public void SignUp() {
        firstName.sendKeys("Samian");
        lastName.sendKeys("Rahman");
        mobileNumberOrEmail.sendKeys("samz2insane@gmail.com");
        reEnterEmail.sendKeys("samz2insane@gmail.com");
        newPassword.sendKeys("Piit89928992");
        genderMaleSelection.click();
        birthdayDay.sendKeys("11");
        birthdayDay.sendKeys("19");
        birthdayYear.sendKeys("1997");

        sleepFor(10);

    }
}


