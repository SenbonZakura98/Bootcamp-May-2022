package com.PageTests;

import com.PageObjects.MotorsPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MotorsTest extends Constants {
     MotorsPage motors;





@Test(priority = 1)
public void pageTitle(){
    motors = new MotorsPage();
    motors.motorPageClick();
}



@Test(priority = 4)
public void hiddenItemCLicks(){
motors = new MotorsPage();
motors.vehicleClick();
waitFor(2);
goBack();
motors.carPartsClick();
goBack();
motors.wheelClick();
goBack();
motors.motorCycleClick();
goBack();
motors.atvClick();
goBack();
motors.otherClick();
goBack();
motors.autoClick();
System.out.println("All Actions were performed Successfully :)");

}


@Test(priority = 2)
public void printText(){
motors = new MotorsPage();

motors.footerText();
}



@Test(priority = 3)
public void hiddenButtons(){
motors = new MotorsPage();
motors.allHiddenOptionsInfo();
}













}
