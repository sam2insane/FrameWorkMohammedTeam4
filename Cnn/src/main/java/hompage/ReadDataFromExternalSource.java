package hompage;

import utility.ExcelReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromExternalSource {

    public static ExcelReader excelReader = new ExcelReader();

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Weather");
        itemsList.add("Soccer");
        itemsList.add("Games");
        itemsList.add("US ");


        return itemsList;
    }

    //Database
      // to be completed
    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<String>();
        //list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        //List<String> list = new ArrayList<String>(); ../Generic/browser-driver/chromedriver
        String path = "C:\\Users\\samia\\IdeaProjects\\FrameWorkMohammedRTea4\\Generic\\src\\main\\java\\utility\\ReadHere.xls";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
}
