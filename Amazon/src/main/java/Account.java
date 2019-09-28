import Common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Account extends CommonAPI {
    @Test
    public void test1(){
        typeOnElement("#twotabsearchtextbox", "Watch");
        clickOnElement(".nav-input");
        System.out.println("testing changes through branch");
    }
    @Test
    public void PressSignIn() {
        driver.findElement(By.id("a-autoid-0-announce")).click();

    }
     @Test
             public void insertUserNameAndPassword() {
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.id("ap_email")).sendKeys("samianrahman@aol.com");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("89Beak92");
        driver.findElement(By.cssSelector("input[id = 'signInSubmit']")).click();
    }
    @Test
    public void FindNewReleaseOfBook() {
        driver.findElement(By.xpath("//a[@ href=\"/gp/new-releases/?ref_=nav_cs_newreleases\"]")).click();
        driver.findElement(By.xpath("//a[@ href=\"https://www.amazon.com/gp/new-releases/books/ref=zg_bsnr_nav_0\"]")).click();

    }
    }








