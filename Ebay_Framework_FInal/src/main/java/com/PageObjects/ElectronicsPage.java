package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class ElectronicsPage extends Constants {

@FindBy(xpath = "//p[contains(text(),'Apple AirPods Max')]")
WebElement clickON;
Actions actions;
@FindBy(partialLinkText = "See all in Portable Audio")
WebElement audio;
@FindBy(partialLinkText = "See all in TV, Video & Home Audio Electronics")
WebElement tv;
@FindBy(xpath = "//a[contains(text(),'See all in VR Headsets & Accessories')]")
WebElement vrHeadSet;
@FindBy(partialLinkText = "See all in Vehicle Electronics")
WebElement vehicle;

@FindBy(xpath = "//a[contains(text(),'See all in Major Appliances')]")
WebElement allAppliance;
@FindBy(xpath = "//a[contains(text(),'See all in Computers, Tablets & Network Hardware')]")
WebElement computers;
@FindBy(xpath = "//a[contains(text(),'See all in Gaming')]")
WebElement gaming;
@FindBy (xpath = "//a[contains(text(),'See all in Smart Home Devices')]")
WebElement home;

@FindBy(xpath = "/html/body/div[5]/div[3]/div[1]/div/div/div/section[1]/ul/li[2]/ul/li[1]/a")
WebElement cellphone;
@FindBy(partialLinkText = "See all in Cameras & Photo")
WebElement seeAllCamera;
@FindBy(partialLinkText = "Electronics")
WebElement epage;
@FindBy(xpath = "//span[contains(text(),'Cameras & Photo')]")
WebElement cameras;
@FindBy(xpath = "//span[contains(text(),'Cell Phones, Smart Watches, & Accessories')]")
WebElement cell;
@FindBy(xpath = "//button[@id='s0-18-12-0-1[0]-0-0-27")
WebElement computersTablets;
@FindBy(xpath = "//span[contains(text(),'TV, Video & Home Audio Electronics')]")
WebElement videoAndTv;

@FindBy(xpath = "//span[contains(text(),'Portable Audio')]")
WebElement portableAudio;
@FindBy(xpath = "//span[contains(text(),'Vehicle Electronics')]")
WebElement vehicleLInk;
@FindBy(xpath = "//span[contains(text(),'Smart Home Devices')]")
WebElement surveillance;
@FindBy(xpath = "//span[contains(text(),'Smart Home Devices')]")
WebElement homeLink;

@FindBy(xpath = "//span[contains(text(),'Video & PC Gaming')]")
WebElement gamingPC;
@FindBy(xpath = "//a[contains(text(),'Virtual Reality')]")
WebElement VR;

public ElectronicsPage(){
PageFactory.initElements(driver,this);
actions = new Actions(driver);
}

public void epageCLick(){
click(epage);
clickedPageURLTitle("Electronics products for sale | eBay","https://www.ebay.com/b/Electronics/bn_7000259124");
}


public void doropDownFirst() throws InterruptedException {
epage.click();

cameras.click();
if(seeAllCamera.isDisplayed()){
System.out.println("The Hidden Items have been shown");
}else {
System.out.println("Item is still hidden");

seeAllCamera.click();
Thread.sleep(3000);
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());


}
}
public void dropDownSecond() throws InterruptedException {
epage.click();


driver.findElement(By.xpath("//span[contains(text(),'Cell Phones, Smart Watches & Accessories')]")).click();
if (cellphone.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");
cellphone.click();
String title = driver.getTitle();
System.out.println("The Hidden Items have been shown and can be selected title is: " + title);

}
}

public void dropDownThird() throws InterruptedException {
epage.click();
driver.findElement(By.xpath("//span[contains(text(),'Computers, Tablets & Network Hardware')]")).click();
Thread.sleep(3000);
if (computers.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");

computers.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());
}
}
public void dropDown4() throws InterruptedException {

epage.click();
actions.moveToElement(videoAndTv).click();
Thread.sleep(3000);
if (videoAndTv.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");

tv.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());
}
}

public void dropDown5 () throws InterruptedException {
epage.click();
driver.findElement(By.xpath("//span[contains(text(),'Portable Audio')]")).click();
Thread.sleep(3000);
if (audio.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");

audio.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());
}
}

public void dropDown6 () throws InterruptedException {
epage.click();
driver.findElement(By.xpath("//span[contains(text(),'Vehicle Electronics')]")).click();
Thread.sleep(3000);
if (vehicle.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");

vehicle.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());

}
}
public void dropDown7 () throws InterruptedException {
epage.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Smart Home Devices')]")).click();
if (home.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");

home.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());
}
}
public void dropDown8 () throws InterruptedException {

epage.click();
driver.findElement(By.xpath("//span[contains(text(),'Major Appliances')]")).click();
Thread.sleep(3000);
if (allAppliance.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");
allAppliance.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());
}

}
public void dropDown9() throws InterruptedException {
try {
epage.click();
driver.findElement(By.xpath("//span[contains(text(),'Gaming')]")).click();
Thread.sleep(3000);
if (gaming.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");
}
gaming.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());

}catch (Exception e){
System.out.println(e.getMessage());
}

}

public void dropDown10 () throws InterruptedException {
epage.click();
driver.findElement(By.xpath("//span[contains(text(),'VR Headsets & Accessories')]")).click();
Thread.sleep(3000);
if (vrHeadSet.isDisplayed()) {
System.out.println("The Hidden Items have been shown");
} else {
System.out.println("Item is still hidden");
}
vrHeadSet.click();
System.out.println("The Hidden Items have been shown and can be selected title is: " + driver.getTitle());

}


public void clickingOnAnItem() throws InterruptedException, IOException {
epage.click();
String clickText = clickON.getText();
Thread.sleep(3000);
System.out.println(clickText);
clickON.click();
System.out.println("Current URL after clicking on Notebook is: " +driver.getCurrentUrl());
Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Apple-AirPods-Max/80077/bn_7117624194","URL wasn't a match Item wasn't selected");
takeScreenshot("AirpodsClick");
}


}
