package signin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {




    public void ClickSignIn(){
        WebElement element = driver.findElement(By.id("My Alibaba"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Sign In")).click();
        //sleepFor(2);

    }

        public void signIN(){
        typeByXpath("//*[@id='fm-login-id']", "sam2insane");
        typeByXpath("//*[@id='fm-login-password']","agdoweyphe");
        clickByXpath("//*[@id='fm-login-submit']");
        //sleepFor(2);
        }



}


