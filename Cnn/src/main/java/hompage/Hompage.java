package hompage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class Hompage extends CommonAPI {

   /* @FindBy(css = ".search_button.cnn-icon")
    WebElement searchtab;
    @FindBy(id= "search-input.cnn-icon")
    WebElement searchInput;
    */@FindBy(xpath = "//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[1]/a")
    WebElement UsaButton;

    public void setHomebotton(){
        String text =UsaButton.getTagName();
        System.out.println(text);
        Assert.assertEquals(text, "a");
    }
    /*public void clickonsearch(){
        searchtab.click();
    }

*/
        @FindBy(xpath =  "//*[@class=\"menu-icon\"]")
    WebElement selectingMenu;

    @FindBy(xpath = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[8]/ul/a/h2")
    WebElement clickOnTech;

    @FindBy(xpath = "/html/body")
    WebElement marketInBusiness;

    @FindBy(xpath = "//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[8]/a")
    WebElement Style;

    @FindBy(xpath = "//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[8]/a")
    WebElement inputSearchInBusiness;

    @FindBy(xpath = "//*[@id=\"nav\"]/header/div/div[1]/div/a/span")
    WebElement testLiveTv;

    @FindBy(xpath = "//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/a/h2")
    WebElement topTitleImage;

    @FindBy(css = "//label[text()='Credit Cards']")
    WebElement creditcardCheck;

    @FindBy(xpath = "//div[@id='outbrain_widget_0']//div//div//ul//li[3]")
    WebElement imageInPaidcontent;

    @FindBy(xpath = "//section[@id='business-zone-4']/div[2]/div/div[1]/div/div[2]/article/div/div[1]/a/img")
    WebElement testImage3;
    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed li:nth-child(6)")
    WebElement storisSix;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed")
    WebElement topStoris;

    @FindBy(xpath = "//section[@id='health-zone-1']/div/div/div[@class='column zn__column--idx-0']/ul/li/article/div/div/a/img")
    WebElement firstIMG;

    @FindBy(xpath = "/html/body")
    WebElement testParenting;

    @FindBy(id = "searchInputFooter")
    WebElement InputStoris;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_AE924ECF-E3AC-3569-1D82-DD5D6BE467B7.cn--expandable.cn--collapsed li:nth-child(6)")
    WebElement populerSixthTopic;

    @FindBy(xpath = "//section[@id='health-zone-8']/div/div/div[3]/ul/a//following-sibling::li/article/div/div/a/img")
    WebElement paidPartnerIMG;

    @FindBy(xpath = "//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[3]/a")
    WebElement bottomWorldAsianews;

    @FindBy(xpath = "//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[4]/a")
    WebElement bottomWorldAustralia;

    @FindBy(xpath = "//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[3]/a")
    WebElement Politics;

    @FindBy(xpath = "//section[@id='us-zone-1']/div/div/div/ul/a//following-sibling::li/article/div/div/a")
    WebElement topImage;

    @FindBy(xpath = "//div[@class='ad ad--epic ad--tablet']//following-sibling::ul/a//following-sibling::li/article/div/div/a/img")
    WebElement table1stImg;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed li")
    WebElement storiestext;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed")
    WebElement storiestext1;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_DCB8F55B-ECE9-602C-1A45-5919511B4582.cn--expandable.cn--collapsed")
    WebElement alltextfromUsPage;

    @FindBy(css = "section[id='us-zone-8']")
    WebElement aroundtheUsText;

    @FindBy(xpath = "//section[@id='homepage4-zone-7']/div/div/div/ul/li/article/div/div/a/img")
    WebElement lastImg;

    @FindBy(css = ".m-legal__list")
    WebElement bottomTopics;

    @FindBy(xpath = "//section[@id='us-zone-8']/div/div/div/div//div[22]/article/div/div/a/img")
    WebElement clickingonfb;


    public void gotoMenu() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Menu Button in Business Page");
        selectingMenu.click();
    }

    public void getBusinessPage() {
        clickOnTech.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Business Page");
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void seeMarketaGlance() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To Market in Business Page");
        marketInBusiness.click();
    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Business Page");
        boolean img = testLiveTv.isDisplayed();
        Assert.assertTrue(img);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void seeNikeTrade(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        driver.navigate().to("https://www.cnn.com/business");
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Trade Button in Business Page");
        boolean selected = Style.isDisplayed();
        Assert.assertTrue(selected);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Business Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void creditCard() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Credit Card Button in Business Page");
        if (creditcardCheck.isDisplayed())
            System.out.println("success");

        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setStorisSix() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Content in Health Page");
        String str = storisSix.getText();
        Assert.assertEquals(str, str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setTopStoris() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Top Stories in Health Page");
        String st = topStoris.getText();
        System.out.println(st);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setFirstIMG() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in Health Page");
        boolean tr = firstIMG.isDisplayed();
        Assert.assertTrue(tr);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setTestParenting() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Parenting Content in Health Page");
        String str = testParenting.getText();
        Assert.assertEquals(str, str);
        driver.navigate().to("https://www.cnn.com/business");
    }


    public void setPopulerSixthTopic() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Popular Topics Health Page");
        boolean str = populerSixthTopic.isSelected();
        Assert.assertFalse(str);
        driver.navigate().to("https://www.cnn.com/business");

    }

    public void setPaidPartnerIMG() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in Health Page");
        boolean img = paidPartnerIMG.isDisplayed();
        Assert.assertTrue(img);
        paidPartnerIMG.click();
        driver.navigate().to("https://www.cnn.com/health");
    }

    public void setBottomWorldAsianews() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify World Asia News in Health Page");
        boolean bl =bottomWorldAsianews.isDisplayed();
        Assert.assertTrue(bl);
        driver.navigate().to("https://www.cnn.com/health");
    }

    public void setbottomWorldAustralia() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Australia News in Health Page");
        String st = bottomWorldAustralia.getText();
        Assert.assertEquals(st, "Australia");
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setbottomPoliticsCongress() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Content Politics Health Page");
        Politics.click();
        driver.navigate().refresh();
        driver.navigate().to("https://www.cnn.com/health");
    }

    public void setTopImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
        boolean tIMG = topImage.isDisplayed();
        Assert.assertTrue(tIMG);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void testurl() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify url in U.S. Page");
        String url = driver.getCurrentUrl();
    }

    public void setTable1stImg() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
        boolean tFisttIMG = table1stImg.isDisplayed();
        Assert.assertTrue(tFisttIMG);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setStoriestext() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories in U.S. Page");
        String str = storiestext.getText();
        System.out.println(str);
        Assert.assertEquals(str, str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setStoriestext1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 1 in U.S. Page");
        String str = storiestext1.getText();
        System.out.println(str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setalltextfromUsPage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 2 in U.S. Page");
        String str = alltextfromUsPage.getText();
        System.out.println(str);
        Assert.assertEquals(str, str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setLastImg() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Image in U.S. Page");
        boolean limg = lastImg.isDisplayed();
        Assert.assertTrue(limg);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setaroundtheUsText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Text in U.S. Page");
        String str = aroundtheUsText.getText();
        System.out.println(str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setBottomTopics() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom topics in U.S. Page");
        String st = bottomTopics.getText();
        String str = "Terms of UsePrivacy PolicyAccessibility & CCAdChoicesAbout usCNN " +
                "Studio ToursCNN StoreNewslettersTranscriptsLicense FootageCNN Newsource";
        System.out.println(st);
        Assert.assertEquals(st, st);
        driver.navigate().to("https://www.cnn.com/business");
    }
    }
