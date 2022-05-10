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




@Test
public void titleTest(){
    searchResults = new HomePageSearches();
     searchResults.matchTitle();
}


@Test
public void itemSearch(){
    searchResults = new HomePageSearches();
     searchResults.searchAnItem();

}

@Test
public void itemSearchResults() throws IOException {
    searchResults = new HomePageSearches();
     searchResults.searchResult();
}

@Test
public void searchAgain(){
    searchResults = new HomePageSearches();
     searchResults.searchAnotherItem();
}


@Test
public void searchResultsAgain(){
    searchResults = new HomePageSearches();
     searchResults.anotherSearchResult();
}




}
