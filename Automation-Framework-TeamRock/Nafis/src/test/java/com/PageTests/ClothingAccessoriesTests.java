package com.PageTests;

import com.PageObjects.ClothingAndAccessories;
import com.TestBase.Constants;
import org.testng.annotations.Test;

public class ClothingAccessoriesTests extends Constants {
    ClothingAndAccessories clothes;

    public ClothingAccessoriesTests(){
        super();

    }
  @Test
  public void checkTitle()
  {clothes = new ClothingAndAccessories();
      clothes.titleCheck();
  }
@Test
 public void testHiddenButton() throws InterruptedException {
    clothes = new ClothingAndAccessories();
        clothes.expandingHiddenCategory();
 }

 @Test
 public void categoryTest2() throws InterruptedException {
clothes = new ClothingAndAccessories();
clothes.hiddenButtonCategory1();
 }

@Test
public void remainingCategories(){
clothes = new ClothingAndAccessories();
clothes.selectingOtherCategories();

}

}


