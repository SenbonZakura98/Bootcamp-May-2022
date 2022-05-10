package com.PageTests;

import com.PageObjects.BusinessAndIndustrial;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BusinessTest extends Constants {
BusinessAndIndustrial business;


public BusinessTest(){

}

@Test(priority = 7)
public void dropTest(){
business = new BusinessAndIndustrial();
business.verifyDropDown();
}


@Test(priority = 1 )
public void scrollFullpage() throws IOException {
business = new BusinessAndIndustrial();
business.businessClick();
business.scrollForFullPageInfo();
}

@Test(priority =4 )
public void clickingAllhiddenItems(){
business = new BusinessAndIndustrial();
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
business = new BusinessAndIndustrial();
business.businessClick();
business.clickHeavyEquipmentPartsAttachmentsLink();
}

@Test(priority = 2)
public void clickLogo() throws IOException {
business = new BusinessAndIndustrial();
business.logoClick();

}


@Test(priority = 6)
public void webLinks() throws IOException {
    business = new BusinessAndIndustrial();
        business.captureWebLinks();
}


@Test(priority = 3 )
public void allHiddenButton(){

        business.businessClick();
        business.getButtonInfo();
}









}