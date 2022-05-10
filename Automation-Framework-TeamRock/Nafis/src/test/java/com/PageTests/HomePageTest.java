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




 @Test
 public void searchDrop(){
  homePage = new HomePage();
  homePage.searchDropDownList();
 }

@Test
public void categorySelect(){
 homePage = new HomePage();
     homePage.categoryDropDownLIst();
}


@Test
public void moneyBackClick(){
 homePage = new HomePage();
     homePage.clickMoneyBack();
}


@Test
public void hoverTest() throws IOException, UnsupportedFlavorException, AWTException, InterruptedException {
 homePage = new HomePage();
  homePage.hoverOverCategories();
}

@Test
public void footerPicture() throws IOException {
 homePage = new HomePage();
  homePage.footerInfo();
}






}
