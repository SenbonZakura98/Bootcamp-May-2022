package com.PageTests;

import com.PageObjects.EbayRefurbished;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class RefurbishedPageTest  extends Constants {
EbayRefurbished ref;






@Test
public void pageInfo(){
    ref = new EbayRefurbished();
    ref.clickEbayRefur();
}

@Test
public void bottomTxt(){
    ref = new EbayRefurbished();
    ref.bottomText();
}

@Test
public void callingAllHiddenButtons(){
try {
    ref = new EbayRefurbished();
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
    ref = new EbayRefurbished();
    ref.logoClick();
}
@Test
public void clickManyItems() throws IOException {
    ref = new EbayRefurbished();
    ref.clickingItems();
}

@Test
public void fullPagetTxT(){
    ref = new EbayRefurbished();
    ref.fullPageInfo();
}





}
