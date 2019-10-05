package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class EbayDeals extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement Deals;

    @FindBy(xpath ="//*[@id=\"nav_7411926\"]/span" )
    WebElement Featured;

    @FindBy(xpath = "////*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    WebElement Toys;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    WebElement collectibleAndArt;



    public void setDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    Deals.click();
}
    public void setFeatured(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Deals.click();
        Featured.click();
    }

    public void setToys() {
        Deals.click();
        Toys.click();

        String pageSourcee= driver.getPageSource();
        System.out.println(pageSourcee);
        sleepFor(10);
    }


    public void setCollectibleAndArt() {
        Deals.click();
        Toys.click();
        collectibleAndArt.click();

        String pagesourse= driver.getPageSource();
        System.out.println(pagesourse);
    }

}

