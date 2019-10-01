package Homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    public static String PageTitle = " Fox News";
    @FindBy (xpath = "//*[@id=\"wrapper\"]/header/div[1]/h1/a")
    WebElement HomePage;

    public void gettoHomePage() {
        String text = HomePage.getTagName();
        System.out.println(text);
        Assert.assertEquals(text,"a");
    }



    @FindBy(xpath = "//*[@id=\"main-nav\"]/ul/li[4]/a")
    WebElement Politics;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[3]/div/div[1]/nav/span")
    WebElement HotTopics;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[2]/div[1]/aside[2]/div/div/div[7]/section/div/form/div[1]/input")
    WebElement SignUpForDailyMail;


}
