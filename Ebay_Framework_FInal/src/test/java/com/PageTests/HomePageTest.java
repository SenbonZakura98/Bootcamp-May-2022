package com.PageTests;

import com.PageObjects.HomePage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class HomePageTest extends Constants {
 HomePage homePage;

 public HomePageTest(){
 super();
 }

 @BeforeMethod
 public void startUp(){
     launchBrowser();
     homePage = new HomePage();
 }

 @Test
 public void searchDrop(){
     homePage.searchDropDownList();
 }

@Test
public void categorySelect(){
     homePage.categoryDropDownLIst();
}


@Test
public void moneyBackClick(){
     homePage.clickMoneyBack();
}


@Test
public void hoverTest() throws IOException, UnsupportedFlavorException, AWTException, InterruptedException {
 homePage.hoverOverCategories();
}

@Test
public void footerPicture() throws IOException {
 homePage.footerInfo();
}


 @AfterMethod
  public void breakDown(){
     driver.quit();
 }






}
