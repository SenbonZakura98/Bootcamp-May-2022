package com.PageTests;

import com.PageObjects.CareersPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CareerTest extends Constants {
    CareersPage career;


@BeforeMethod
public void startUp(){
launchBrowser();
career = new CareersPage();
}



@Test
public void titleTest(){
career.clickCareers();
}



@Test
public void clickingOtherLinks(){
career.clickingAllOtherLinks();
}



@Test
public void category() throws IOException {
career.clickjobsByCategoryLink();
}


@Test
public void location(){
career.clickjobsByLocationLink();
}




@AfterMethod
public void tearDown(){
driver.quit();
}



}
