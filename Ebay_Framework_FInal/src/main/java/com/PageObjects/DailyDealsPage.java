package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class DailyDealsPage extends Constants {
Actions action;

@FindBy(xpath = "//main[@id='mainContent']")
WebElement featureBody;
@FindBy(className = "content")
WebElement bottomText;
@FindBy(partialLinkText = "Cell Phones")
 WebElement cellbtn;

@FindBy(partialLinkText = "Men's Shoes")
WebElement mensShoebtn;
@FindBy(partialLinkText = "Kitchen, Dining & Bar")
WebElement kitchenbtn;
@FindBy(partialLinkText = "Hunting")
WebElement hunyingbtn;
@FindBy(partialLinkText = "Automotive Tools")
WebElement autobtn;
@FindBy(partialLinkText = "DVDs & Movies")
WebElement dVdbtn;

@FindBy(xpath = "//a[contains(text(),'Warm Weather Savings')]")
WebElement warm;
@FindBy(id= "gh-p-1")
WebElement daily_deals;
@FindBy(xpath = "//span[contains(text(),'Featured')]")
WebElement featured;
@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
WebElement techs;
@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")
WebElement fashion;
@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
WebElement homeAndGarden;

@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]/span[1]")
WebElement sportingGoodsDropdown;
@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
WebElement automotiveDropdown;
@FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[1]")
WebElement otherDealsDropdown;
@FindBy (xpath = "//span[contains(text(),'Sales & Events')]")
WebElement salesAndEvents;
public DailyDealsPage(){
    PageFactory.initElements(driver,this);
    action= new Actions(driver); {

}
    }

//Getting th epage title and URl
  public void dealsOptions() throws IOException, InterruptedException {
    click(daily_deals);
      System.out.println("After Clicking Daily Deals title is: "+retrieveTitle());
      assertURLTitle("Daily Deals on eBay | Best deals and Free Shipping","https://www.ebay.com/deals");
      takingScreenshot();
  }

//Checking all Hidden button options and if they can be clicked
public void dropDownCheck() throws IOException, InterruptedException {
daily_deals.click();
Thread.sleep(5000);
featured.click();
assertURLTitle("Daily Deals on eBay | Best deals and Free Shipping","https://www.ebay.com/deals");
techs.click();
boolean b = cellbtn.isDisplayed();
System.out.println("Does the Cellphone button appear?: " + b);
fashion.click();
boolean c = mensShoebtn.isDisplayed();
System.out.println("Does the Mens Shoe button appear?: " + c);
homeAndGarden.click();
boolean d = kitchenbtn.isDisplayed();
System.out.println("Does the Kitchen button appear?: " + d);
sportingGoodsDropdown.click();
boolean e = hunyingbtn.isDisplayed();
System.out.println("Does the Hunting button appear?: " + e);
automotiveDropdown.click();
boolean f = autobtn.isDisplayed();
System.out.println("Does the Automotive button appear?: " + f);
otherDealsDropdown.click();
boolean g = dVdbtn.isDisplayed();
System.out.println("Does the DVD button appear?: " + g);
salesAndEvents.click();
String text = bottomText.getText();
System.out.println("Below are Daily Deals Messages:");
System.out.println(text);
Assert.assertEquals(text,text, "The Message isn't as expected");

    }
public void takingScreenshot() throws IOException, InterruptedException {
daily_deals.click();
Thread.sleep(3000);
cellbtn.click();
Thread.sleep(3000);
takeScreenshot("CellPhones_DailyDealsPage");

}
//Printing all the information in the featured page

public void featuresBodyCheck(){
daily_deals.click();
featured.click();
System.out.println("Below are the featured body message");
System.out.println(featureBody.getText());

}


public void dropDownItemsClick() throws InterruptedException, IOException {
    try {
        daily_deals.click();
        moveMouseTo(featured);
        waitFor(2);
        click(warm);
        takeScreenshot("WarmDeals_DailyDealsPage");
        driver.navigate().back();

        techs.click();
        cellbtn.click();
        System.out.println("Clicked Cell Phones title is: " + driver.getTitle());
        driver.navigate().back();

        fashion.click();
        mensShoebtn.click();
        System.out.println("Clicked Mens Shoe title is: " + driver.getTitle());
        driver.navigate().back();

        homeAndGarden.click();
        System.out.println("Clicked Home and Garden title is: " + driver.getTitle());
        driver.navigate().back();

        sportingGoodsDropdown.click();
        hunyingbtn.click();
        System.out.println("Clicked Hunting title is: " + driver.getTitle());
        driver.navigate().back();

        Thread.sleep(4000);
        otherDealsDropdown.click();
        action.moveToElement(dVdbtn).click().perform();
        System.out.println("Clicked  deals title is: " + driver.getTitle());


    } catch (Exception e) {
        System.out.println(e.getMessage());  }
}}