package regerssionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.EbayDeals;

public class TestEbayDeals extends CommonAPI {

    EbayDeals testEbayDeals;
    String url = "https://www.ebay.com/";

    @BeforeClass
    public void init() throws Exception {
        testEbayDeals = PageFactory.initElements(driver, EbayDeals.class);
        driver.get(url);
        Thread.sleep(3000);

    }

    @AfterMethod
    public void initialize() {
        driver.get(url);

    }

    @Test(priority = 1)
    public void clickOnsDeals() {
        testEbayDeals.setDeals();
        navigateBack();

    }

    @Test(priority = 3)
    public void clickFeatured() {
        testEbayDeals.setFeatured();
    }

    @Test(priority = 2)
    public void clickTech() {
        testEbayDeals.setToys();
    }
}