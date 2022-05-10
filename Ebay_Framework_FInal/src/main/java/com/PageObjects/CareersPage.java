package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class CareersPage extends Constants {
    Actions actions;
    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElement careesClick;
    @FindBy(linkText = "Software QA")
    WebElement clickQA;

    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[1]/a[1]/img[1]")
    WebElement ebayLogo;
    @FindBy(linkText = "View All Software QA Jobs")
    WebElement findAllJobs;
    @FindBy(xpath = "//a[@id='country-toggle']")
     WebElement  country;
    @FindBy(xpath = "//a[@id='country-toggle']")
    WebElement uSAClick;

    @FindBy(xpath = "//a[@id='region-toggle']")
    WebElement regions;
    @FindBy (xpath = "//body/div[@id='page']/main[@id='main-content']/div[1]/aside[1]/section[1]/div[1]/section[2]/ul[1]/li[2]/label[1]/b[1]")
    WebElement nYClick;

    @FindBy(css = "#career-search-keyword")
    WebElement searchLocation;

    @FindBy(xpath = "//main[@id='main-content']")
    WebElement locationResults;

    @FindBy(xpath = "//body/div[@id='app-container']/div[@id='content-container']/div[@id='omnibox-container']/div[@id='omnibox']/div[@id='omnibox-directions']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement locationGoogle;

    @FindBy(xpath = "//a[contains(text(),'Get Directions')]")
    WebElement contactEbayHeadquarters;
    @FindBy(xpath = "//body/div[@id='page']/main[@id='main-content']/div[1]")
    WebElement fullText;
    @FindBy(xpath = "//span[contains(text(),'Engineering')]")
    WebElement engineering;
    @FindBy (xpath = "//body/div[@id='main-content']/main[1]/section[1]/ul[1]/div[4]/div[1]/div[1]/section[1]")
    WebElement engineeringOption;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement jobsByCategoryLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement studentsRecentGradsLink;
    @FindBy (xpath = "//body[1]/header[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement howWeHireLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement jobsByLocationLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement engineeringCareersLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")
    WebElement ourJobsLink;
    @FindBy (xpath = "//a[contains(text(),'View Open Positions')]")
    WebElement viewOpenPositionsLink;
    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[2]/a[1]")
    WebElement pressRoomLink;
    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[4]/a[1]")
    WebElement contactUsLink;

    public CareersPage(){
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }



public void clickcontactUsLink(){
click(contactUsLink);
if (driver.getCurrentUrl().equals("https://www.ebayinc.com/company/contact-us/")){
Assert.assertTrue(true);
}else {Assert.assertTrue(false);}
Assert.assertEquals(driver.getTitle(),"Contact Us - eBay Inc.","Title isn't match");
click(contactEbayHeadquarters);
System.out.println("Title is: "+driver.getTitle());
sendAndClick(locationGoogle,"New York");
System.out.println("Title now is: "+driver.getTitle());
}
public void clickPressRoomLink(){
        click(pressRoomLink);
    }


//Clicking Jobs by Category then Selecting Engineering and asserting related functions
public void clickjobsByCategoryLink() throws IOException {
clickCareers();
click(jobsByCategoryLink);
waitFor(2);
click(engineering);
waitFor(2);
System.out.println("All the info inside this box is: ");
System.out.println();
System.out.println(engineeringOption.getText());
System.out.println();
System.out.println("------------------------------------");
click(engineering);
waitFor(2);
takeScreenshot("Engineering_CareersPage");
click(engineering);
waitFor(2);
click(clickQA);
click(findAllJobs);
waitFor(1);
click(country);
click(uSAClick);
click(regions);
click(nYClick);
waitFor(2);
takeScreenshot("RefineSearch_CareersPage");
System.out.println("After Selecting options the Text is: "+"\t");
System.out.println(fullText.getText());

}






//Clicking jobs by location and asserting related functionalities
public void clickjobsByLocationLink(){

clickCareers();
click(jobsByLocationLink);
waitFor(2);
click(searchLocation);
sendAndClick(searchLocation,"Brooklyn,NY");
waitFor(5);
System.out.println("The search Results are: "+"\n-----------------------------"+"\t");
System.out.println(locationResults.getText()+"\t");
click(country);
click(uSAClick);
boolean a = uSAClick.isSelected();
if (a = true){System.out.println("Has been Selected"+"\n");}else {System.out.println("Hasn't been selected"+"\n");}
click(regions);
click(nYClick);
boolean b = nYClick.isSelected();
if (b = true){System.out.println("Has been Selected"+"\n");}else {System.out.println("Hasn't been selected"+"\n");}
System.out.println("All the results after selecting categories are: "+"\n------------------------------"+"\t");
System.out.println(locationResults.getText());

}


public void clickstudentsRecentGradsLink(){
click(studentsRecentGradsLink);
}
public void clickhowWeHireLink(){
click(howWeHireLink);
}
public void clickengineeringCareersLink(){click(engineeringCareersLink);}
public void clickourJobsLink(){
click(ourJobsLink);
}
public void clickviewOpenPositionsLink(){
click(viewOpenPositionsLink);
}



//Clicking the page from homepage and verifying URL and title for assertion of correct redirection
public void clickCareers(){
click(careesClick);
waitFor(2);
System.out.println("Current Title of the page is: "+driver.getTitle());
Assert.assertEquals(driver.getTitle(),"Find Your Dream Job - eBay Inc. Careers","Title isn't a match");
if(driver.getCurrentUrl().equals("https://careers.ebayinc.com/")){
Assert.assertTrue(true);
}else {Assert.assertTrue(false);}
}



//Clicking on all other links and verifying the title and at the end checking if clicking on logo returns correct redirection
public void clickingAllOtherLinks(){
try {
    clickCareers();
    clickPressRoomLink();
    Assert.assertEquals(driver.getTitle(), "Press Room - eBay Inc.", "Title isn't a match");
    goBack();
    clickstudentsRecentGradsLink();
    Assert.assertEquals(driver.getTitle(), "Students & Recent Grads - eBay Inc. Careers", "title isn't a match");
    goBack();
    clickhowWeHireLink();
    Assert.assertEquals(driver.getTitle(), "How We Hire - eBay Inc. Careers", "Title isn't a match");
    goBack();
    clickengineeringCareersLink();
    Assert.assertEquals(driver.getTitle(), "Jobs in Engineering - eBay Inc. Careers", "Title isn't a match");
    goBack();
    clickourJobsLink();
    Assert.assertEquals(driver.getTitle(), "Search our Job Opportunities at eBay", "Title isn't a match");
    goBack();
    clickviewOpenPositionsLink();
    Assert.assertEquals(driver.getTitle(), "Find Your Dream Job - eBay Inc. Careers", "");
    click(ebayLogo);
    Assert.assertEquals(driver.getTitle(), "About eBay: Company Info, News, Careers, Investor Relations", "Title isn't a match");
    if (driver.getCurrentUrl().equals("https://www.ebayinc.com/")) {
        Assert.assertTrue(true);
    } else {
        Assert.assertTrue(false);
    }
}catch (Exception e){
    System.out.println(e.getMessage());
    e.printStackTrace();
}
}


 }











