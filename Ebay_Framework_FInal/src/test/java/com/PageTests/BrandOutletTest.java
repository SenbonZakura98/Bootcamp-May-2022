package com.PageTests;

import com.PageObjects.BrandOutletPage;
import com.TestBase.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrandOutletTest extends Constants {
    BrandOutletPage brand;

    public BrandOutletTest(){
        super();
    }

@BeforeMethod
public void setUp(){
    launchBrowser();
    brand = new BrandOutletPage();
}
//Asserting BrandOutletPage Title and URL
@Test
public void assertingPageTitle() throws IOException {
brand.clickBrangPage();
if (driver.getTitle().equals("Brand Outlet products for sale | eBay")){

Assert.assertTrue(true);
    System.out.println("Title was a match");
}
else {Assert.assertTrue(false);}
takeScreenshot("BrandOutlet_BrandOutletPage");
}

// CLicking on Hidden Buttons asserting if Hidden elements are showing and clicking on options inside
@Test
public void callingAllHiddenButtons(){
brand.clickBrangPage();
brand.clickBedding();
goBack();
brand.clickClothing();
goBack();
brand.clickFloorcare();
goBack();
waitFor(3);
brand.clickHomeDecor();
goBack();
brand.clickKitchen();
waitFor(3);
brand.clickFoot();
goBack();
brand.clickHandbags();
}


@AfterMethod
public void tearDown(){
    driver.close();
}




}
