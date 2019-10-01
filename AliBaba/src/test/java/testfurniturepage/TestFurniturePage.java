package testfurniturepage;

import base.CommonAPI;
import furniturepage.FurniturePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFurniturePage extends CommonAPI {
    FurniturePage testfurniturepage;
    String url ="https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.201703.7.2ce265aaURRrYi";

    @BeforeClass
    public void initialize(){
        testfurniturepage = PageFactory.initElements(driver, FurniturePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void navigate(){
        driver.navigate().to(url);
    }

   @Test (priority = 8)
    public void testHoverToCategories(){
        testfurniturepage.setHoverToCategories();
    }

    @Test(priority = 4)

    public void setfunctionalfurniture(){
        WebElement element = driver.findElement(By.linkText("Antique Furniture"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Antique Beds")).click();
    }
    @Test(priority = 6)
    public void setcoomercialfurniture() {
            WebElement element = driver.findElement(By.xpath("//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[4]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[4]/div[2]/div/div[2]/span")).click();

    }
    @Test(priority = 3)
    public void searchforbeds(){
        testfurniturepage.setSearch("beds");

    }
    @Test(priority = 7)
    public void SearchforFunctionalBeds(){
        testfurniturepage.setFunctionalfurniture();
    }
    @Test(priority = 2)
    public void searchForHomeFurniture() {
        testfurniturepage.setHomeFurniture();
    }
    @Test(priority = 5)
    public void Order() {
        testfurniturepage.setOrder();
    }
    @Test(priority = 1)
    public void CheckMessages() {
        testfurniturepage.CheckMyMessages();
    }









    }


