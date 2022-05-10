package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrandOutletPage extends Constants {
@FindBy(xpath = "//body/div[5]/div[4]/div[3]/section[11]")
WebElement text;

@FindBy(xpath = "//a[contains(text(),'adidas - Up to 60% off')]")
WebElement adidas;

@FindBy(xpath = "//a[contains(text(),'Burberry - Up to 30% off')]")
WebElement burbery;

@FindBy(xpath = "//a[contains(text(),'Cuisinart - Up to 50% off')]")
WebElement cusini;
@FindBy(xpath = "//a[contains(text(),'Champion - Up to 50% off')]")
WebElement champion;
@FindBy(xpath = "//a[contains(text(),'Eddie Bauer - Up to 30% off')]")
WebElement eddie;
@FindBy(xpath = "//a[contains(text(),'Dainty Home - Up to 20% off')]")
WebElement daintyHome;
@FindBy(xpath = "//a[contains(text(),'Bissell - Up to 40% off')]")
WebElement bissel;
@FindBy(xpath = "//a[contains(text(),'Tools & Outdoor Equipment')]")
WebElement tool;

@FindBy(xpath = "//span[contains(text(),'Footwear & Apparel')]")
WebElement footwearDrop;
@FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
WebElement brandClick;
@FindBy(xpath = "//span[contains(text(),'Clothing')]")
WebElement clothingDrop;
@FindBy(xpath = "//span[contains(text(),'Handbags')]")
WebElement handbagsDrop;
@FindBy(xpath = "//span[contains(text(),'Jewelry')]")
WebElement jewelryDrop;
@FindBy(xpath = "//span[contains(text(),'Watches')]")
WebElement watchesDrop;

@FindBy(xpath = "//span[contains(text(),'Bedding')]")
WebElement beddingDrop;
@FindBy(xpath = "//span[contains(text(),'Floorcare')]")
WebElement floorcareDrop;
@FindBy(xpath = "//span[contains(text(),'Decor')]")
WebElement homeDecorDrop;
@FindBy(xpath = "//span[contains(text(),'Kitchen')]")
WebElement kitchenDrop;


public BrandOutletPage() {
PageFactory.initElements(driver, this);
}


public void clickBrangPage(){
click(brandClick);
}


public void clickClothing() {
click(clothingDrop);
if(champion.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(champion);
}

public void clickHandbags() {
click(handbagsDrop);
if(burbery.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(burbery);
}


public void clickBedding() {
click(beddingDrop);
if(eddie.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(eddie);
}

public void clickFloorcare() {
click(floorcareDrop);
if(bissel.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(bissel);

}

public void clickHomeDecor() {
click(homeDecorDrop);
if(daintyHome.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(daintyHome);
}

public void clickKitchen() {
click(kitchenDrop);
if(cusini.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(tool);
}

public void clickFoot() {
click(footwearDrop);
if(adidas.isDisplayed()){
System.out.println("Hidden Items are Displayed");
}else {
System.out.println("Hidden Items aren't Displayed");
}
click(adidas);


}

public void printText(){
waitFor(5);
click(brandClick);
String bText = text.getText();
Assert.assertEquals(bText,bText,"Not a match");
System.out.println("Footer Text is: "+"\n"+bText);
}





}

