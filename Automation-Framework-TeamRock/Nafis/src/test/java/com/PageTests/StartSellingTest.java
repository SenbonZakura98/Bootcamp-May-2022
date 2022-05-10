package com.PageTests;

import com.PageObjects.StartSellingPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class StartSellingTest extends Constants {
 StartSellingPage sell;







@Test(priority = 1)
public void pageTitle(){
 sell = new StartSellingPage();
 sell.pageClick();
}


@Test(priority = 3)
public void listAnItem() throws IOException {
 sell = new StartSellingPage();
sell.listingCheck();
}


@Test(priority = 4)
public void searchSuggestion() throws IOException {
 sell = new StartSellingPage();
sell.autoSuggestionAutomation();
}

@Test(priority = 2)
public void faQText(){
 sell = new StartSellingPage();
sell.fAQQuestions();
}

@Test(priority = 5)
public void sellerPolicyInfo(){
 sell = new StartSellingPage();
sell.checkSellerPolicy();
}











}
