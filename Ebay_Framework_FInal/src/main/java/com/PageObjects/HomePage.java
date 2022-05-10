package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
public class HomePage extends Constants {
    Constants constants;
    Actions action;

@FindBy(xpath = "//footer[@id='glbfooter']")
WebElement footer;

@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
WebElement motors;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
WebElement electronics;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]")
WebElement collectebles;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[6]/a[1]")
WebElement homeGarden;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]")
WebElement clothing;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
WebElement toys;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[9]/a[1]")
WebElement sporting;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[10]/a[1]")
WebElement business;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]")
WebElement jewlery;
@FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[12]/a[1]")
WebElement ebayRefur;


@FindBy(id = "gh-cat")
WebElement dropDown;
Select sel;
@FindBy(id = "gh-shop-a")
WebElement category;
@FindBy(xpath = "//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[2]/a")
WebElement money_back;
@FindBy(partialLinkText = "Gift Mom what she deserves")
WebElement gift;
@FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[2]/div[1]/img")
WebElement louis_Vuitton;
@FindBy(xpath = "//*[@id='s0-29_1-9-0-1[3]-0-0']/ul/li[12]/div/div[2]/a/h3")
WebElement bag;
public HomePage(){
    PageFactory.initElements(driver,this);
this.action = new Actions(driver); {
}
}

public  String getTitle(){
    String title = driver.getTitle();
    System.out.println(title);
    return title;
}
public void searchDropDownList() {
try {


    sel = new Select(dropDown);
    if (sel.getFirstSelectedOption().isSelected()) {
        System.out.println("DropDown was selected");
    } else {
        System.out.println("DropDown was not selected");
    }
    System.out.println("Search DropDown categories are below: " + "-----------------------------------------------");
    List<WebElement> dDown = sel.getOptions();
    for (WebElement dropList : dDown) {
        System.out.println(dropList.getText());
        sel.selectByIndex(15);
        if (sel.getFirstSelectedOption().getText().contains("ebay Motors")) {
            System.out.println("Selected option is in the Dropdown List");
        } else {
            System.out.println("Selected option is not here");
        }
    }

}catch (Exception e){
    System.out.println(e.getMessage());
}   }



public void categoryDropDownLIst(){
 category.click();
String list = category.getText();
    System.out.println("Category List DropDown Elements are: "+"\n"+"__________________________________________________");
    System.out.println(list);
}

public void clickMoneyBack(){
money_back.click();
String title = driver.getTitle();
Assert.assertEquals(title,"eBay Money Back Guarantee", "Title isn't a match!");
System.out.println("Title matched!");
driver.navigate().back();
}



//Checking if element can be hovered over and if so are the options and logos correctly displayed
public void hoverOverCategories() throws IOException, UnsupportedFlavorException, AWTException, InterruptedException {
hoverOverScreenshot(motors,"MotorsHover");
goBack();
waitFor(3);
hoverOverScreenshot(electronics,"ElectronicHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(collectebles,"CollecteblesHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(homeGarden,"HomeAndGardenHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(clothing, "ClothingHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(toys,"ToysHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(sporting,"SportingHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(business,"BusinessHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(jewlery, "JeweleryHoverOver");
goBack();
waitFor(3);
hoverOverScreenshot(ebayRefur,"EbayRefurbishedHoverOver");
}


public void footerInfo() throws IOException {
moveMouseTo(footer);
takeScreenshot("HomePageFooterInfo");


}





}
