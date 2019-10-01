package furniturepage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FurniturePage extends CommonAPI {
   @FindBy(xpath = "//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[3]/div[1]/div")
    WebElement HomeFurniture;
   @FindBy(xpath = "//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[2]/div/div")
   WebElement Functionalfurniture;
   @FindBy(xpath = "//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[4]/div[1]/div")
   WebElement commercialfurniture;
   @FindBy(xpath = "//*[@id=\"3856750380\"]/div/div[2]/div/div/div/div[6]/div")
   WebElement childrenfurniture;
   @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div/div/form/div[2]/input")
   WebElement search;
   @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[4]/div/div/a/div/div[1]/a")
   WebElement order;

   public void setOrder() {
       if (order.isDisplayed())
           order.click();
    }
   public void setSearch(String name){
       if(search.isEnabled())
           Assert.assertTrue(true);
       search.sendKeys(name, Keys.ENTER);
   }
   public void setChildrenfurniture(){
       if(childrenfurniture.isDisplayed())
           childrenfurniture.click();
   }
   public void setCommercialfurniture(){
       if(commercialfurniture.isDisplayed())
       commercialfurniture.click();
   }
   public void setFunctionalfurniture(){
       if(Functionalfurniture.isDisplayed())
           Functionalfurniture.click();
   }
   public void setHomeFurniture() {
       if (HomeFurniture.isDisplayed())
           HomeFurniture.click();
   }
   public void setHoverToCategories() {
       clickByXpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[1]/div/div/h3");
       sleepFor(2);
       clickByXpath("//*[@id=\"J_SC_header\"]/header/div[4]/div/div[1]/div/div/div/ul/li[4]/div[1]/a[3]");
   }
   public void CheckMyMessages() {
       clickByXpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[2]/div[1]/div/div/div[1]");
       sleepFor(5);
       clickByXpath("//*[@id=\"fm-login-submit\"]");
   }
}
