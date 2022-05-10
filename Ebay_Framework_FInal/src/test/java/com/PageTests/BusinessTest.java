package com.PageTests;

import com.PageObjects.BusinessAndIndustrial;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BusinessTest extends Constants {
BusinessAndIndustrial business;

    @BeforeMethod
    public void satrtUp(){
        launchBrowser();
        business = new BusinessAndIndustrial();
    }

@Test(priority = 7)
public void dropTest(){
business.verifyDropDown();
}


@Test(priority = 1 )
public void scrollFullpage() throws IOException {
business.businessClick();
business.scrollForFullPageInfo();
}

@Test(priority =4 )
public void clickingAllhiddenItems(){
business.businessClick();
business.clickAgricultureForestryEquipmentLink();
business.clickCleaningJanitorialLink();
business.clickCncMetalworkingLink();
business.clickBuildingMaterialsSuppliesLink();
business.clickElectricalEquipmentSuppliesLink();
business.clickFacilityMaintenanceLink();
business.clickFastenersHardwareLink();
business.clickCncMetalworkingLink();
business.clickIndustrialAdhesivesLink();
business.clickHealthcareLabDentalLink();
business.clickHvacRefrigerationLink();
business.clickHydraulicsPneumaticsLink();
}

@Test(priority =5 )
public void clickinAnItem() throws IOException {
business.businessClick();
business.clickHeavyEquipmentPartsAttachmentsLink();
}

@Test(priority = 2)
public void clickLogo() throws IOException {
business.logoClick();

}


@Test(priority = 6)
public void webLinks() throws IOException {
business.captureWebLinks();
}


@Test(priority = 3 )
public void allHiddenButton(){
        business.businessClick();
        business.getButtonInfo();
}




    @AfterMethod
    public void tearDown(){
        driver.quit();


    }




}