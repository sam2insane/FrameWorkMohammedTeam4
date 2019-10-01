package Signup;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBookTest extends CommonAPI {
    SIgnin sIgnin;
    String url = "https://facebook.com";

    @BeforeClass
    public void initialize() {
        sIgnin = PageFactory.initElements(driver, SIgnin.class);
        driver.get(url);
    }
        @AfterClass
        public void navigate() {
            driver.navigate().to(url);
            sleepFor(3);
        }
        @Test(priority = 1)
    public void check() {
        sIgnin.SignUp();
        }

            }



