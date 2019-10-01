package signin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SignIn extends CommonAPI {
    public void ClickSignIn(){
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a"));
        sleepFor(3);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[5]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
        //sleepFor(2);
    }
        public void signIN(){
        typeByXpath("//*[@id='fm-login-id']", "sam2insane");
        typeByXpath("//*[@id='fm-login-password']","agdoweyphe");
        clickByXpath("//*[@id='fm-login-submit']");
        sleepFor(2);
        }

        }



