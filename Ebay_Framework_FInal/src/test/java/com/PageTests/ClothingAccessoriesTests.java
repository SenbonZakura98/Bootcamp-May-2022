package com.PageTests;

import com.PageObjects.ClothingandAccessories;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClothingAccessoriesTests extends Constants {
    ClothingandAccessories clothes;


    @BeforeMethod
  public void setUp(){
      launchBrowser();
      clothes = new ClothingandAccessories();
  }
  @Test
  public void checkTitle(){
      clothes.titleCheck();
  }
@Test
 public void testHiddenButton() throws InterruptedException {
clothes.expandingHiddenCategory();
 }

 @Test
 public void categoryTest2() throws InterruptedException {
clothes.hiddenButtonCategory1();
 }

@Test
public void remainingCategories(){
clothes.selectingOtherCategories();

}



@AfterMethod
public void breakDown(){
 driver.close();
}
}