package testhompage;

import base.CommonAPI;
import hompage.Hompage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class TestHomPage extends CommonAPI {
    Hompage hpage;
    String hpgurl="https://www.cnn.com/";
    Hompage hmpage;

    @BeforeClass
    public void initialize(){
        driver.get(hpgurl);
        hmpage= PageFactory.initElements(driver, Hompage.class);

    }
    @AfterClass
    public void init(){
        driver.get(hpgurl);
    }
    @Test
    public void homebuttontest(){
        TestLogger.log(getClass().getSimpleName()+ " "+ convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName())+" "+ "Veryfy Home Button");
        hmpage.setHomebotton();
    }
    @Test
    public void menubtn() throws Exception{
        hmpage.gotoMenu();
        driver.navigate().to(hpgurl);
    }
    @Test
    public void clickOnMarket() throws Exception{
        hmpage.seeMarketaGlance();
    }
    @Test
    public void imageTesting1()throws Exception{
        hmpage.image1();
    }
    @Test
    public void nikeTraging() throws Exception {
        hmpage.seeNikeTrade("Nike");
        driver.navigate().to(hpgurl);
    }
    @Test
    public void testSetFirstIMG(){
        hmpage.setFirstIMG();
    }
    @Test
    public void testParenting(){
        hmpage.setTestParenting();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        hmpage.setBottomWorldAsianews();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        hmpage.setbottomPoliticsCongress();
    }
    @Test
    public void testCurrentUrl(){
        hmpage.testurl();
    }
}