package testhompage;

import base.CommonAPI;
import hompage.ExcelUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import java.io.IOException;
import java.sql.SQLException;

public class TestUtils extends CommonAPI {
    @Test
    public void search() throws Exception, IOException, SQLException, ClassNotFoundException {
        ExcelUtils searchPage = PageFactory.initElements(driver, ExcelUtils.class);
        //searchPage.searchItemAndKeysEnter();
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
        //searchPage.searchFor("sports");    //searchItemsAndSubmitButton();

    }
}