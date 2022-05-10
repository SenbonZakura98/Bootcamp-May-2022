package com.PageTests;

import com.PageObjects.CareersPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CareerTest extends Constants {
    CareersPage career;





@Test
public void titleTest(){
career = new CareersPage();
career.clickCareers();
}



@Test
public void clickingOtherLinks(){
career = new CareersPage();
career.clickingAllOtherLinks();
}



@Test
public void category() throws IOException {
career = new CareersPage();
career.clickjobsByCategoryLink();

}


@Test
public void location(){
career = new CareersPage();
career.clickjobsByLocationLink();
}







}