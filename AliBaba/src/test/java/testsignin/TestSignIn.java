package testsignin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signin.SignIn;

public class TestSignIn extends CommonAPI {
    SignIn testsignin;
    String url ="https://www.alibaba.com/";


    @BeforeClass
    public void initialize(){
        testsignin = PageFactory.initElements(driver, SignIn.class);
        driver.get(url);
    }
    @AfterClass
    public void init(){
        driver.get(url);
    }
    @Test
    public void SignIn(){

        testsignin.ClickSignIn();
        testsignin.signIN();
    }



    }




