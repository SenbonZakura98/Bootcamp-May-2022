package com.PageObjects;

import com.TestBase.Constants;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.time.Duration;

public class CollecteblesAndArt extends Constants {
    Actions actions;
@FindBy(className = "content")
WebElement bottomText;

@FindBy(xpath = "//div[contains(text(),'Coins & Paper Money')]")
WebElement clickCoinPage;
@FindBy(xpath = "//div[contains(text(),'Sports Trading Cards')]")
WebElement clickPageItem;
@FindBy(xpath = "//span[contains(text(),'Vintage & Antique Jewelry')]")
WebElement jewlerClick;

@FindBy(xpath = "//span[contains(text(),'Dolls & Teddy Bears')]")
WebElement dolls;

@FindBy(xpath = "//span[contains(text(),'Antiques')]")
WebElement antique;
@FindBy(xpath = "//span[contains(text(),'Vintage & Antique Jewelry')]")
WebElement vintage;

@FindBy(xpath = "//span[contains(text(),'Art & Craft Supplies')]")
WebElement arts;

@FindBy(xpath = "//span[contains(text(),'Coins & Paper Money')]")
WebElement paper;
@FindBy(xpath = "//span[contains(text(),'Entertainment Memorabilia')]")
WebElement entertainment;
@FindBy(xpath = "//span[contains(text(),'Collectibles')])")
WebElement collectables;
@FindBy(xpath = "//span[contains(text(),'Dolls & Teddy Bears')]")
WebElement teddy;
@FindBy(xpath = "//span[contains(text(),'Pottery & Glass')]")
WebElement pottery;

@FindBy(xpath = " //span[contains(text(),'Sports Memorabilia, Fan Shop & Sports Cards')]")
WebElement sports;
@FindBy(xpath = "//span[contains(text(),'Stamps')]")
WebElement stamps;
@FindBy(linkText = "Collectibles & Art")
WebElement collect;
@FindBy(xpath = "//a[contains(text(),'Vintage & Antique Jewelry')]")
WebElement vintageAntiqueJewelryLink;
@FindBy (xpath = "//a[contains(text(),'See all in Sports Memorabilia, Fan Shop & Sports C')]")
WebElement sportsMemorabiliaLink;
@FindBy (xpath = "//a[contains(text(),'See all in Stamps')]")
WebElement stampsLink;
@FindBy (xpath = "//a[contains(text(),'See all in Dolls & Teddy Bears')]")
WebElement dollsTeddyBearsLink;

@FindBy (xpath = "//a[contains(text(),'Art & Craft Supplies')]")
WebElement artsCraftsSuppliesLink;
@FindBy (xpath = "//a[contains(text(),'See all in Antiques')]")
WebElement antiquesLink;
@FindBy (linkText = "See all in Art")
WebElement artLink;
@FindBy (xpath = "//a[contains(text(),'See all in Coins & Paper Money')]")
WebElement coinsAndPaperMoneyLink;

@FindBy (xpath = "//a[contains(text(),'See all in Coins & Paper Money')]")
WebElement collectiblesLink;
@FindBy (xpath = "//a[contains(text(),'See all in Coins & Paper Money')]")
WebElement entertainmentMemorabiliaLink;
@FindBy (xpath = "//a[contains(text(),'See all in Pottery & Glass')]")
WebElement potteryAndGlassLink;
@FindBy (xpath = "//a[contains(text(),'Bullion')]")
WebElement bullionLink;
public CollecteblesAndArt(){
    PageFactory.initElements(driver,this);
}

public void clickCollect(){click(collect);}

public void clickvintageAntiqueJewelryLink(){
vintage.click();
click(vintageAntiqueJewelryLink);
System.out.println(retrieveTitle());
actions = new Actions(driver);
}
public void clicksportsMemorabiliaLink(){

click(sports);
click(sportsMemorabiliaLink);
System.out.println(retrieveTitle());
}
public void clickstampsLink(){
stamps.click();
waitFor(3);
stampsLink.click();
System.out.println(retrieveTitle());
}
public void clickdollsTeddyBearsLink(){
dolls.click();
dollsTeddyBearsLink.click();
System.out.println(retrieveTitle());
}
public void clickartsCraftsSuppliesLink(){
click(arts);
artsCraftsSuppliesLink.click();
System.out.println(retrieveTitle());
}
public void clickantiquesLink(){
try {
   antique.click();
    antiquesLink.click();
    System.out.println(retrieveTitle());
}catch (Exception e){e.printStackTrace();}
}
public void clickartLink(){
arts.click();
artsCraftsSuppliesLink.click();
System.out.println(retrieveTitle());
}
public void clickcoinsAndPaperMoneyLink(){
paper.click();
coinsAndPaperMoneyLink.click();
System.out.println(retrieveTitle());
}
public void clickcollectiblesLink(){
collectables.click();
collectiblesLink.click();
System.out.println(retrieveTitle());
}
public void clickentertainmentMemorabiliaLink(){
entertainment.click();
entertainmentMemorabiliaLink.click();

}
public void clickpotteryAndGlassLink(){
pottery.click();
potteryAndGlassLink.click();
}
public void clickbullionLink(){
actions.moveToElement(bullionLink).build().perform();
bullionLink.click();
}

public void clickAllButtons() throws IOException {
try {

    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    click(collect);
    vintage.click();
    if (vintageAntiqueJewelryLink.isDisplayed()) {   // Verifying if Hidden Button has been clicked and are Hidden items Showing
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    dolls.click();
    if (dollsTeddyBearsLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    waitFor(2);
    sports.click();
    if (sportsMemorabiliaLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    waitFor(2);
    click(stamps);
    if (stampsLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    waitFor(2);
    click(teddy);
    if (dollsTeddyBearsLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    waitFor(2);
    click(arts);
    if (artsCraftsSuppliesLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    waitFor(2);
    click(antique);
    if (antiquesLink.isDisplayed()) {
        System.out.println("Hidden Items are shown");
    } else {
        System.out.println("Hidden Items aren't shown");
    }
    takeScreenshot("Antiques_Collectibles_Page");
}catch (Exception e){
    System.out.println(e.getMessage());
}}

public void pageItemClick() throws IOException { //Checking if certain Items located on page to verify if they are clickable
click(collect);
click(clickPageItem);
System.out.println("Page Item Clicked");
goBack();
click(clickCoinPage);
takeScreenshot("Coins_CollectiblesPage");
System.out.println("Coin Page Clicked and ScreenShoted");


}


public void collectBottomText(){
click(collect);
String text =   bottomText.getText();
System.out.println(text);
}













}
