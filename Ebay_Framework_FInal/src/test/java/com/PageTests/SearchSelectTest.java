package com.PageTests;

import com.PageObjects.HomePageSearches;
import com.PageObjects.SearchResultSelect;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchSelectTest extends Constants {

SearchResultSelect resultSelect;
HomePageSearches searches;
 public SearchSelectTest(){
     super();
 }
@BeforeMethod
 public void startBrowser(){
     launchBrowser();
     resultSelect = new SearchResultSelect();

 }
 @Test
 public void getWholePageInfo(){
     resultSelect.getAllproducts();
 }



@Test
 public void iPhoneDescription(){
     resultSelect.selectFromiPhones(10);//Retrieving the information from selected search result


 }


@Test
public void consoleDescription(){
resultSelect.selectFromPS5(4); //Retrieving the information from selected search result
}





 @AfterMethod
 public void breakDown(){
     driver.quit();

 }



}
