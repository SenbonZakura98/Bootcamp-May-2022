package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class EbayRefurbished extends Constants {
Actions actions;
@FindBy(xpath = "//div[contains(text(),'Generators')]")
WebElement item1;
@FindBy(xpath = "//div[contains(text(),'Coffee, Tea, & Espresso Makers')]")
WebElement item2;
@FindBy(xpath = "//div[contains(text(),'Smart Watches')]")
WebElement item3;
@FindBy(xpath = "//img[@id='gh-logo']")
WebElement ebayLogo;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[12]/a[1]")
WebElement ebayRefurCLick;

@FindBy(xpath = "//body/div[5]/div[4]/div[3]/section[5]/div[1]")
WebElement bottomText;

@FindBy(xpath = "//span[contains(text(),'Cell Phones, Smart Watches & Accessories')]")
WebElement cellPhone;

@FindBy(xpath = "//span[contains(text(),'Cameras & Camera Drones')]")
WebElement cameraDrone;


@FindBy(xpath = "//span[contains(text(),'PC gaming')]")
WebElement pcGaming;

@FindBy(xpath = "//span[contains(text(),'Computer Accessories')]")
WebElement computerAcc;

@FindBy(xpath = "//span[contains(text(),'TV, Video & Audio')]")
WebElement tvAudio;

@FindBy(xpath = "//span[contains(text(),'Vehicle Electronics')]")
WebElement vehicleElec;

@FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
WebElement cellPbtn;
@FindBy(xpath = "//a[contains(text(),'Camera Drones & Accessories')]")
WebElement cameraBtn;
@FindBy(xpath = "//a[contains(text(),'Gaming Monitors')]")
WebElement gamingMonBtn;
@FindBy(xpath = "//a[contains(text(),'Keyboards, Mice, & Pointers')]")
WebElement keyBoardBtn;
@FindBy(linkText = "Home Audio")
WebElement homeAudBtn;
@FindBy(xpath = "//a[contains(text(),'Car Audio')]")
WebElement carAudio;








public EbayRefurbished(){
PageFactory.initElements(driver,this);
actions = new Actions(driver);
}



//Clicking Ebay Refurbished from the homepage and verifying the title and URL
public void clickEbayRefur(){
click(ebayRefurCLick);
String title = driver.getTitle();
System.out.println("Title of the current page is: "+ title);
if(driver.getCurrentUrl().equals("https://www.ebay.com/b/eBay-Refurbished/bn_7040708936")){
Assert.assertTrue(true,"URL is a match");
}else {Assert.assertTrue(false,"URL isn't a match");}
}


//Checking the Text located at the bottom of the page for validation
public void bottomText(){
clickEbayRefur();
System.out.println("The bottom text of this page is: ");
System.out.println();
System.out.println(bottomText.getText());
Assert.assertEquals(bottomText,bottomText,"Looks like its not matching");
}

//Getting whole page info
public void fullPageInfo(){
click(ebayRefurCLick);

    List<WebElement> fullPageInfo  =(driver.findElements(By.xpath("//body")));

    Iterator<WebElement> iteratePage = fullPageInfo.iterator();

    int locationX, locationY;
    System.out.println("The whole page info is below: ");
    System.out.println("---------------------------------");
    while (iteratePage.hasNext()){
        WebElement pageInfo = iteratePage.next();
        locationX =pageInfo.getLocation().getX();
        locationY = pageInfo.getLocation().getY();

        scrollBy(locationX,locationY);
        System.out.println(pageInfo.getText());

}
}

//Clicking on Multiple Hidden Items and verifying if clicked as well as clicking an option inside them and verifying their redirection
public void clcikHiddenButton1(){
click(cellPhone);
if (cellPbtn.isDisplayed()){
    System.out.println("Hidden Button is Showing");
}else {
    System.out.println("HIdden Button isn't showing");
}
click(cellPbtn);
String title = driver.getTitle();
Assert.assertEquals(title, "Cell Phones & Smartphones for Sale - Buy New & Used Phones - eBay");
if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Cell-Phones-Smartphones/9355/bn_320094?rt=nc&LH_ItemCondition=2000%7C2010%7C2020%7C2030")){
    Assert.assertTrue(true,"URL is a match");
}else {Assert.assertTrue(false,"URL isn't a match");}
}


public void clickHiddenButton2(){
click(cameraDrone);
    if (cameraBtn.isDisplayed()){
        System.out.println("Hidden Button is Showing");
    }else {
        System.out.println("Hidden Button isn't showing");
    }
  click(cameraBtn);
    String title = driver.getTitle();
Assert.assertEquals(title, "Drones for Sale - Shop New & Used Camera Drones - eBay");
if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Camera-Drones/179697/bn_89951?LH_ItemCondition=2000")){
        Assert.assertTrue(true,"URL is a match");
    }else {Assert.assertTrue(false,"URL isn't a match");}
}


public void clickHiddenButton3(){
click(pcGaming);
    if (gamingMonBtn.isDisplayed()){
        System.out.println("Hidden Button is Showing");
    }else {
        System.out.println("Hidden Button isn't showing");
    }
click(gamingMonBtn);
    String title = driver.getTitle();
    Assert.assertEquals(title, "Serious Gaming Computer Monitors for Sale - eBay");
    if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Serious-Gaming-Computer-Monitors/80053/bn_96565624?LH_ItemCondition=2000")){
        Assert.assertTrue(true,"URL is a match");
    }else {Assert.assertTrue(false,"URL isn't a match");}

}


public void clcikHiddenButton4(){
click(computerAcc);
    if (keyBoardBtn.isDisplayed()){
        System.out.println("Hidden Button is Showing");
    }else {
        System.out.println("Hidden Button isn't showing");
    }
    click(keyBoardBtn);
    String title = driver.getTitle();
    Assert.assertEquals(title, "Computer Keyboards & Mice for sale | eBay");
    if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Computer-Keyboards-Mice/3676/bn_1642724?rt=nc&LH_ItemCondition=2000")){
        Assert.assertTrue(true,"URL is a match");
    }else {Assert.assertTrue(false,"URL isn't a match");}
}

public void clickHiddenButton5(){
click(tvAudio);
    if (homeAudBtn.isDisplayed()){
        System.out.println("Hidden Button is Showing");
    }else {
        System.out.println("Hidden Button isn't showing");
    }
    click(homeAudBtn);
    String title = driver.getTitle();
    Assert.assertEquals(title, "Home Audio Systems for Sale - eBay");
    if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Home-Audio-Systems/184973/bn_115021122?rt=nc&LH_ItemCondition=2000")){
        Assert.assertTrue(true,"URL is a match");
    }else {Assert.assertTrue(false,"URL isn't a match");}
}

public void clickHiddenButton6(){
click(vehicleElec);
    if (carAudio.isDisplayed()){
        System.out.println("Hidden Button is Showing");
    }else {
        System.out.println("Hidden Button isn't showing");
    }
    click(carAudio);
    String title = driver.getTitle();
    Assert.assertEquals(title, "Car Audio for Sale - eBay");
    if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Car-Audio/175716/bn_887048?rt=nc&LH_ItemCondition=2000")){
        Assert.assertTrue(true,"URL is a match");
    }else {Assert.assertTrue(false,"URL isn't a match");}

}



//Clicking the logo from the page to assert if the redirection is correct
public void logoClick(){
click(ebayRefurCLick);
actions.moveToElement(ebayLogo).click().build().perform();
if (driver.getCurrentUrl().equals("https://www.ebay.com/")){
    Assert.assertTrue(true);
    System.out.println("Logo Click Accomplished");
}else {Assert.assertTrue(false,"Logo Click wasn't Possible");}

}

//Clicking items on the page and verifying title, URL then clicking on back, and another time back to return to homepage and assert titles
public void clickingItems() throws IOException {
try {
    click(ebayRefurCLick);
    click(item1);
    System.out.println("Item Clicked title is: " + driver.getTitle());
    takeScreenshot("Item1-EbayRefurPage");
    goBack();
    waitFor(2);
    click(item2);
    System.out.println("Item Clicked title is: " + driver.getTitle());
    takeScreenshot("Item2-EbayRefurPage");
    goBack();
    waitFor(2);
    click(item3);
    System.out.println("Item Clicked title is: " + driver.getTitle());
    takeScreenshot("Item3-EbayRefurPage");
    goBack();
    System.out.println("Returned title is: " + driver.getTitle());
    goBack();
    System.out.println("Returned Further title is: " + driver.getTitle());
}catch (Exception e){
    System.out.println(e.getMessage());
    e.printStackTrace();
}}

public void clickLogo(){
actions.moveToElement(ebayLogo).click().build().perform();
System.out.println("Returned Title now is: "+ driver.getTitle());
}




}
