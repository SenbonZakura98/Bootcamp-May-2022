package com.PageTests;

import com.PageObjects.CollecteblesAndArt;
import com.TestBase.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CollecteblesTest extends Constants {
    public
CollecteblesAndArt collects;


@Test
public void collectibles1(){
collects = new CollecteblesAndArt();
collects.clickCollect();
String title = driver.getTitle();
waitFor(5);
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickvintageAntiqueJewelryLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Vintage-Antique-Jewelry/262024/bn_16565712");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
collects.clicksportsMemorabiliaLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sports-Memorabilia-Fan-Shop-Sports-Cards/64482/bn_1857919");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
collects.clickstampsLink();

Assert.assertEquals(retrieveTitle(), "Stamps for sale | eBay");
}
@Test
public void collectibles2(){ //Verifying Titles and URLs for selected Hidden Button Links
collects = new CollecteblesAndArt();
collects.clickCollect();
String title = driver.getTitle();
waitFor(3);
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickdollsTeddyBearsLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Dolls-Teddy-Bears/237/bn_1865477");
driver.navigate().to("https://www.ebay.com");
collects.clickCollect();
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickartLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
collects.clickantiquesLink();
Assert.assertEquals(retrieveTitle(), "Antiques for sale | eBay");
}
@Test
public void collectibles3() throws IOException { //Verifying Titles and URLs for selected Hidden Button Links
collects = new CollecteblesAndArt();
collects.clickCollect();
String title = driver.getTitle();
System.out.println("First attempt");
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickartsCraftsSuppliesLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickcoinsAndPaperMoneyLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Coins-Paper-Money/11116/bn_1857806");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
takeScreenshot("CollectClick_CollectiblesPage");
}

@Test
public void collectibles5(){ //Verifying Titles and URLs for selected Hidden Button Links
collects = new CollecteblesAndArt();
collects.clickCollect();
String title = driver.getTitle();
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickdollsTeddyBearsLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Dolls-Teddy-Bears/237/bn_1865477");
goBack();driver.navigate().to("https://www.ebay.com/");
collects.clickCollect();
Assert.assertEquals(title, "Collectibles & Art products for sale | eBay");
collects.clickartLink();
Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051");
goBack();driver.navigate().to("https://www.ebay.com/");
waitFor(5);
collects.clickCollect();
waitFor(5);
collects.clickantiquesLink();
waitFor(5);
String title2 = driver.getTitle();
Assert.assertEquals(title2, "Antiques for sale | eBay");
}
@Test
public void hiddenItems() throws IOException {
    collects = new CollecteblesAndArt();
    collects.clickAllButtons();}

@Test
public void itemsOfPage() throws IOException {
    collects = new CollecteblesAndArt();
    collects.pageItemClick();}

@Test
public void pageBottomTextPrint(){
    collects = new CollecteblesAndArt();
    collects.collectBottomText();}

}
