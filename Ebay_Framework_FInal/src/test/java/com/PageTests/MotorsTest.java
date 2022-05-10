package com.PageTests;

import com.PageObjects.MotorsPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MotorsTest extends Constants {
     MotorsPage motors;
 @BeforeMethod
 public void setUp(){
     launchBrowser();
     motors = new MotorsPage();
 }




@Test(priority = 1)
public void pageTitle(){
motors.motorPageClick();
}



@Test(priority = 4)
public void hiddenItemCLicks(){
motors.vehicleClick();
goBack();
waitFor(3);
motors.carPartsClick();
goBack();
waitFor(3);
motors.wheelClick();
waitFor(2);
driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
goBack();
waitFor(3);
motors.motorCycleClick();
goBack();
waitFor(3);
motors.atvClick();
goBack();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
motors.otherClick();
goBack();
motors.autoClick();
System.out.println("All Actions were performed Successfully :)");

}


@Test(priority = 2)
public void printText(){
motors.footerText();
}



@Test(priority = 3)
public void hiddenButtons(){
 motors.allHiddenOptionsInfo();
}





@AfterMethod
public void tearDown() {
     driver.close();
}












}
