package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewleryAndWatches extends Constants {
Actions actions;
    @FindBy(xpath = "//a[contains(text(),'See all in Engagement & Wedding Jewelry')]")
    WebElement engage;
    @FindBy(xpath = "//a[contains(text(),'See all in Ethnic, Regional & Tribal Jewelry')]")
    WebElement ethinic;
    @FindBy(xpath = "//a[contains(text(),'See all in Jewelry Care, Design & Repair')]")
    WebElement careDesign;
    @FindBy(xpath = "//a[contains(text(),'See all in Fashion Jewelry')]")
    WebElement fashion;
    @FindBy(xpath = "//a[contains(text(),'See all in Fine Jewelry')]")
    WebElement fine;
    @FindBy(xpath = "//a[contains(text(),'See all in Handcrafted & Artisan Jewelry')]")
    WebElement handCrafted;
    @FindBy(xpath = "//a[contains(text(),'See all in Kids' Jewelry')]")
    WebElement kids;
    @FindBy(xpath = "//a[contains(text(),'See all in Loose Diamonds & Gemstones')]")
    WebElement diamonds;
    @FindBy(linkText = "See all in Men's Jewelry")
    WebElement mens;
    @FindBy(xpath = "//a[contains(text(),'See all in Vintage & Antique Jewelry')]")
    WebElement vintage;
    @FindBy(xpath = "//a[contains(text(),'See all in Watches, Parts & Accessories')]")
    WebElement watches;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]")
    WebElement jewelryAndWatcheslink;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]")
    WebElement jews;
    @FindBy (xpath = "//a[contains(text(),'Shop All Jewelry')]")
    WebElement shopAllJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Fine Jewelry')]")
    WebElement fineJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Fashion Jewelry')]")
    WebElement fashionJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Vintage & Antique Jewelry')]")
    WebElement vintageAntiqueJewelryLink;

    @FindBy (xpath = "//span[contains(text(),'Engagement & Wedding Jewelry')]")
    WebElement engagementWeddingJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Handcrafted & Artisan Jewelry')]")
    WebElement handcraftedArtisanJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Ethnic, Regional & Tribal Jewelry')]")
    WebElement ethnicRegionalTribalJewelryLink;
    @FindBy (partialLinkText = "Men's Jewelry")
    WebElement mensJewelryLink;

    @FindBy (xpath = "//span[contains(text(),'Kids Jewelry')]")
    WebElement childrensJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Body Jewelry')]")
    WebElement bodyJewelryLink;
    @FindBy (xpath = "//span[contains(text(),'Loose Beads')]")
    WebElement looseBeadsLink;
    @FindBy (xpath = "//span[contains(text(),'Loose Diamonds & Gemstones')]")
    WebElement looseDiamondsGemstonesLink;
    @FindBy (xpath = "//span[contains(text(),'Jewelry Care, Design & Repair')]")
    WebElement jewelryCareDesignRepairLink;


    public JewleryAndWatches(){
        PageFactory.initElements(driver,this );
        actions = new Actions(driver);

    }



    public void clickJewlwery() {
        try {
            click(jewelryAndWatcheslink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    public void clickfineJewelryLink(){
        click(fineJewelryLink); boolean a = fine.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }
    }
    public void clickfashionJewelryLink(){
        click(fashionJewelryLink);
        boolean a = fashion.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickvintageAntiqueJewelryLink(){

        click(vintageAntiqueJewelryLink);
        boolean a = vintage.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }

    public void clickengagementWeddingJewelryLink(){
        click(engagementWeddingJewelryLink);
        boolean a = engage.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickhandcraftedArtisanJewelryLink(){
        click(handcraftedArtisanJewelryLink);
        boolean a = handCrafted.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickethnicRegionalTribalJewelryLink(){
        click(ethnicRegionalTribalJewelryLink);
        boolean a = ethinic.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickmensJewelryLink(){
        click(mensJewelryLink);

    }
    public void clickchildrensJewelryLink(){
        click(childrensJewelryLink);
        boolean a = kids.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickbodyJewelryLink(){
        click(bodyJewelryLink);


    }
    public void clicklooseBeadsLink(){
        click(looseBeadsLink);


    }
    public void clicklooseDiamondsGemstonesLink(){
        click(looseDiamondsGemstonesLink);
        boolean a = diamonds.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }
    public void clickjewelryCareDesignRepairLink(){
        click(jewelryCareDesignRepairLink);
        boolean a = careDesign.isDisplayed(); if (a = true){
            System.out.println("is displayed");
        }else {
            System.out.println("not displayed");
        }

    }

    public void checkClick(){
       try {
           jewelryAndWatcheslink.click();
           mensJewelryLink.click();
           System.out.println("Title is :" + driver.getTitle());
           goBack();
           waitFor(2);
           fashionJewelryLink.click();
           fashion.click();
           System.out.println("Title is :" + driver.getTitle());
           goBack();
           waitFor(2);
           fineJewelryLink.click();
           waitFor(2);
           fine.click();
           System.out.println("Title is :" + driver.getTitle());
           goBack();

           vintageAntiqueJewelryLink.click();
           waitFor(2);
           vintage.click();
           System.out.println("Title is :" + driver.getTitle());
           goBack();
           handcraftedArtisanJewelryLink.click();
           waitFor(3);
           handCrafted.click();
           System.out.println("Title is :" + driver.getTitle());
           driver.navigate().back();
           looseDiamondsGemstonesLink.click();
           waitFor(2);
           diamonds.click();
           waitFor(2);
       }catch (Exception e){
           e.printStackTrace();
       }
    }






}