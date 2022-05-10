package com.PageTests;

import com.PageObjects.SellerCenterPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SelleCenterTest extends Constants {
 SellerCenterPage sellC;










@Test
public void pageTest(){
 sellC = new SellerCenterPage();
 sellC.sellerCenterClick();
}




@Test
public void hoverOverTest() throws IOException, UnsupportedFlavorException, InterruptedException, AWTException {
 sellC = new SellerCenterPage();
 sellC.hoverOver();
}







}
