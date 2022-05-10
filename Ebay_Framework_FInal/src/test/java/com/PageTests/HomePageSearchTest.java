package com.PageTests;

import com.PageObjects.HomePageSearches;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageSearchTest extends Constants {
HomePageSearches searchResults;


 public HomePageSearchTest()throws IOException {
     super();
 }

@BeforeMethod
    public  void startUp(){
     launchBrowser();
     searchResults = new HomePageSearches();
    }


@Test
public void titleTest(){
     searchResults.matchTitle();
}


@Test
public void itemSearch(){
     searchResults.searchAnItem();

}

@Test
public void itemSearchResults() throws IOException {
     searchResults.searchResult();
}

@Test
public void searchAgain(){
     searchResults.searchAnotherItem();
}


@Test
public void searchResultsAgain(){
     searchResults.anotherSearchResult();
}

@AfterMethod
public void breakDown(){
     driver.close();
}



}
