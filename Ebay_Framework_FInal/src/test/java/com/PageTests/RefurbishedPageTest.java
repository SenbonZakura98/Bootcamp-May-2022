package com.PageTests;

import com.PageObjects.EbayRefurbished;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class RefurbishedPageTest  extends Constants {
EbayRefurbished ref;
@BeforeMethod
public void setUp(){
 launchBrowser();
 ref = new EbayRefurbished();

}



@Test
public void pageInfo(){
    ref.clickEbayRefur();
}

@Test
public void bottomTxt(){
    ref.bottomText();
}

@Test
public void callingAllHiddenButtons(){
try {
    ref.clickEbayRefur();
    waitFor(2);
    ref.clcikHiddenButton1();
    goBack();
    ref.clickHiddenButton2();
    goBack();
    waitFor(1);
    ref.clickHiddenButton3();
    goBack();
    waitFor(1);
    ref.clcikHiddenButton4();
    goBack();
    waitFor(1);
    ref.clickHiddenButton5();
    goBack();
    waitFor(1);
    ref.clickHiddenButton6();
    goBack();
    ref.clickLogo();
}catch (Exception e){e.printStackTrace();
    System.out.println(e.getMessage());} }

@Test
public void logoClick(){
ref.logoClick();
}
@Test
public void clickManyItems() throws IOException {
ref.clickingItems();
}

@Test
public void fullPagetTxT(){
    ref.fullPageInfo();
}








@AfterMethod
public void tearDown(){
driver.close();

}




}
