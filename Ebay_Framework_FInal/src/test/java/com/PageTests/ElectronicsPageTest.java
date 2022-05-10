package com.PageTests;

import com.PageObjects.ElectronicsPage;
import com.TestBase.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ElectronicsPageTest extends Constants {
    ElectronicsPage epage;



@BeforeMethod
public void setUp(){
    launchBrowser();
    epage = new ElectronicsPage();
}



@Test(priority = 1)
public void titleTest(){
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay","OOPS! Title isn't a match");
}


@Test
public void titleTEst2(){
    epage.epageCLick();
}

@Test(priority = 2)
 public void callingDropDown1() throws InterruptedException {epage.doropDownFirst();}


@Test(priority = 3)
public void callingDropDown2() throws InterruptedException {  epage.dropDownSecond();}

@Test (priority = 4)
public void callingDropDown3() throws InterruptedException {epage.dropDownThird();}

@Test (priority = 5)
public void callingDropDown4() throws InterruptedException {epage.dropDown4();}
@Test(priority = 6)
public void callingDropDown5() throws InterruptedException {epage.dropDown5();}
@Test(priority = 7)
public void callingDropDown6() throws InterruptedException {epage.dropDown6();}
@Test(priority = 8)
public void callingDropDown7() throws InterruptedException {epage.dropDown7();}
@Test(priority = 9)
public void callingDropDown8() throws InterruptedException {epage.dropDown8();}
@Test(priority = 10)
public void callingDropDown9() throws InterruptedException {epage.dropDown9();}
@Test(priority = 11)
public void callingDropDown10() throws InterruptedException {epage.dropDown10();}





@Test (priority = 12)
public void clickItem() throws InterruptedException, IOException {
epage.clickingOnAnItem();
}

@AfterMethod
public void breakDown(){
driver.close();
}



}
