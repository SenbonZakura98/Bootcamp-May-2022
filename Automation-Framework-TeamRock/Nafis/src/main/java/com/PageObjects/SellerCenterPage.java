package com.PageObjects;

import com.TestBase.Constants;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SellerCenterPage extends Constants {
    @FindBy(linkText = "Seller Center")
    WebElement sellerCenter;
    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement selling;

    @FindBy(xpath = "//span[contains(text(),'eBay for Business')]")
    WebElement business;

    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement listings;

    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement growth;

    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[5]/a[1]")
    WebElement shipping;
    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[5]/a[1]")
    WebElement payment;

    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[5]/a[1]")
    WebElement protecttions;

    @FindBy(xpath = "//header/div[@id='main-menu']/nav[1]/ul[1]/li[5]/a[1]")
    WebElement resources;
    public SellerCenterPage(){
        PageFactory.initElements(driver,this);
    }


    public void sellerCenterClick(){
        try {
            driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
            click(sellerCenter);
            clickedPageURLTitle("Home | Seller Center", "https://www.ebay.com/sellercenter");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




    public void hoverOver() throws IOException, UnsupportedFlavorException, InterruptedException, AWTException {
        sellerCenterClick();
        hoverOverScreenshot(selling,"HoverOverSelling_SellerCenterPage");
        goBack();
        waitFor(2);
        hoverOverScreenshot(business,"HoverOverBusiness_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(listings,"HoverOVerListings_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(growth,"HoverOverGrowth_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(shipping,"HoverOverShipping_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(protecttions,"HoverrOverProtections_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(payment,"HoverOverPayment_SellerCenterPage");
        goBack();
        waitFor(2);

        hoverOverScreenshot(resources,"HOverOverResources_SellerCenterPage");
    }





}
