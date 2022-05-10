package com.PageTests;

import com.PageObjects.JewleryAndWatches;
import com.TestBase.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JeweleryTest extends Constants {
JewleryAndWatches jew;

    @BeforeMethod
    public void setUp(){launchBrowser();  jew = new JewleryAndWatches();  }

//Checking if clicked upon buttons are giving the correct title and URL
    @Test
    public void jewelry1(){

        jew.clickJewlwery();
        Assert.assertEquals(retrieveTitle(), "Jewelry & Watches for sale | eBay");
        jew.clickfineJewelryLink();
        System.out.println("fine jewelry executing");
        Assert.assertEquals(retrieveTitle(), "Jewelry & Watches for sale | eBay");
        jew.clickfashionJewelryLink();
        System.out.println("fashion jewelry active");
        jew.clickvintageAntiqueJewelryLink();
        waitFor(3);
        jew.clickengagementWeddingJewelryLink();
        waitFor(5);
        jew.clickethnicRegionalTribalJewelryLink();
        jew.clickmensJewelryLink();
    }


    //Checking if the Hidden Buttons can be Clicked on
    @Test
    public void jewelry2(){
      jew.checkClick();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();


}
}

