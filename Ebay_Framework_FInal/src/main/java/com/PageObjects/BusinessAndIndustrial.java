package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class BusinessAndIndustrial extends Constants {
    Select sel;
    Actions actions;
    @FindBy(xpath = "//select[@id='gh-cat']")
    WebElement selectDrop;
    @FindBy(xpath = "//img[@id='gh-logo']")
    WebElement ebayLogo;
    @FindBy(xpath = "//body/div[6]/div[4]/div[3]/section[4]/div[1]")
    WebElement heavyBottomText;
    @FindBy(xpath = "//section[@id='s0-18-12-0-1[1]-0-0-0")
    WebElement wholeHiddenButtonInfo2;
    @FindBy(xpath = "//div[@id='s0-18']")
    WebElement wholeHiddenButtonInfo1;
    @FindBy(linkText = "Business & Industrial")
    WebElement business;
    @FindBy(xpath = "//span[contains(text(),'Agriculture & Forestry Equipment')]")
    WebElement agricultureForestry;
    @FindBy(xpath = "//span[contains(text(),'Building Materials & Supplies')]")
    WebElement buildingMaterials;
    @FindBy(xpath = "//span[contains(text(),'Cleaning & Janitorial Supplies')]")
    WebElement cleaningJanitor;
    @FindBy(xpath = "//span[contains(text(),'CNC, Metalworking & Manufacturing')]")
    WebElement MetalWorking;

    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[5]/button[1]/span[1]")
    WebElement electricalEquipment;
    @FindBy(xpath = "//span[contains(text(),'Facility Maintenance & Safety')]")
    WebElement facilityMaintain;
    @FindBy(xpath = "//span[contains(text(),'Fasteners & Hardware')]")
    WebElement fastenersHardware;
    @FindBy(xpath = "//span[contains(text(),'Healthcare, Lab & Dental')]")
    WebElement healthcareLab;

    @FindBy(xpath = "//body/div[5]/div[4]/div[3]/section[1]/div[2]/a[1]/div[1]/img[1]")
    WebElement heavyEquipmentParts;
    @FindBy(xpath = "//span[contains(text(),'HVAC & Refrigeration')]")
    WebElement refrigeration;
    @FindBy(xpath = "//span[contains(text(),'Hydraulics, Pneumatics, Pumps & Plumbing')]")
    WebElement hydraulics;
    @FindBy(xpath = "//span[contains(text(),'Industrial Adhesives Sealants & Tapes')]")
    WebElement industrialAdhesive;

    public BusinessAndIndustrial(){

        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
}
    public void businessClick(){
    business.click();
    String title = driver.getTitle();
    System.out.println("The current title of the page is: "+title);
String url = driver.getCurrentUrl();
if(url.equals("https://www.ebay.com/b/Business-Industrial/12576/bn_1853744")){
    Assert.assertTrue(true,"URL is a match");
}else {Assert.assertTrue(false,"URL isn't a match");}
    }


    public void clickAgricultureForestryEquipmentLink() {
        click(agricultureForestry);
        System.out.println("Agriculture clicked");
    }

    public void clickBuildingMaterialsSuppliesLink() {
        click(buildingMaterials);
        System.out.println("Building Materials Clicked");
    }

    public void clickCleaningJanitorialLink() {
        click(cleaningJanitor);
        System.out.println("Cleaning Janitor Clicked");
    }

    public void clickCncMetalworkingLink() {
        click(MetalWorking);
        System.out.println("Metal Working Supplies Clicked");
    }

    public void clickElectricalEquipmentSuppliesLink() {
        click(electricalEquipment);
        System.out.println("Electrical has been Clicked");
    }

    public void clickFacilityMaintenanceLink() {
        click(facilityMaintain);
        System.out.println("Has Been Clicked");
    }

    public void clickFastenersHardwareLink() {
        click(fastenersHardware);
        System.out.println("Has been Clicked");
    }

    public void clickHealthcareLabDentalLink() {
        click(healthcareLab);
        System.out.println("has Been Clcked");
    }

    //Clicking an Item on the page and verifying numerous info on the page
    public void clickHeavyEquipmentPartsAttachmentsLink() throws IOException {
        click(heavyEquipmentParts);
        System.out.println("Has been Clicked");
        takeScreenshot("Heavy_Equipment");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Heavy Equipment for Sale - eBay","Title isn't a match");
        System.out.println("The bottom text for this page is: "+ "\n--------------------------------------------");
        System.out.println(heavyBottomText.getText());
    }

    public void clickHydraulicsPneumaticsLink() {
        click(hydraulics);
        System.out.println("Has Been Clicked");
    }

    public void clickHvacRefrigerationLink() {
        click(refrigeration);
        System.out.println("Has Been Clicked");
    }

    public void clickIndustrialAdhesivesLink() {
        click(industrialAdhesive);
        System.out.println("Has Been Clicked");
    }


public void scrollForFullPageInfo() throws IOException { //Iterating whole page text to analyze the correct data

    List<WebElement> fullPageInfo  =(driver.findElements(By.xpath("//body")));

    Iterator<WebElement> iteratePage = fullPageInfo.iterator();

    int locationX, locationY;

    while (iteratePage.hasNext()){
        WebElement pageInfo = iteratePage.next();
        locationX =pageInfo.getLocation().getX();
        locationY = pageInfo.getLocation().getY();

        scrollBy(locationX,locationY);
        System.out.println(pageInfo.getText());


    }

}

//Iterating and Printing all the data options of the hidden button to analyze correct data
public void getButtonInfo(){
waitFor(2);
System.out.println("All hidden button options in this page are: ");
System.out.println("-------------------------------------------------");
List<WebElement> hiddenItemInfo = driver.findElements(By.xpath("//div[@id='s0-18']"));
Iterator<WebElement> items = hiddenItemInfo.iterator();

while(items.hasNext()){
WebElement allItemInfo = items.next();
System.out.println(allItemInfo.getText());
}

}

//Verifying if the user can click the logo located in the page and the redirected link if it is correct
public void logoClick() throws IOException {
businessClick();
waitFor(2);
moveMouseTo(ebayLogo);
actionClick(ebayLogo);
System.out.println("The title of the page now is: "+driver.getTitle());
takeScreenshot("BusinessPage");
Assert.assertEquals(driver.getTitle(),"Electronics, Cars, Fashion, Collectibles & More | eBay","Titile is not a match");
if (driver.getCurrentUrl().equals("https://www.ebay.com/")){
    Assert.assertTrue(true);
}else {Assert.assertTrue(false);}
}

//Verifying if the hyperlinks are correct on The Heavy equipment Links
public void captureWebLinks() throws IOException {
businessClick();
click(heavyEquipmentParts);
System.out.println("Current title of the page is :"+driver.getTitle());
waitFor(2);}

//Verifying if the page dropdown has appropriate options
public void verifyDropDown(){
business.click();
click(heavyEquipmentParts);
waitFor(2);
sel = new Select(selectDrop);
System.out.println("Options in this dropwdown are: "+"\n--------------------------------");
List<WebElement> drop = sel.getOptions();
for (WebElement Ddrop: drop){
    System.out.println(Ddrop.getText());
}


}



}











