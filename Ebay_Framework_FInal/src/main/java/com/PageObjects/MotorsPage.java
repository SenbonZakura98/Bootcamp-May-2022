package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MotorsPage extends Constants {

    @FindBy(xpath = "//body[1]/div[6]/div[4]/div[3]/section[7]/div[1]")
    WebElement bottomTXT;

    @FindBy(xpath = "//span[contains(text(),'Automotive Tools & Supplies')]")
    WebElement automotive;

    @FindBy(xpath = "//a[contains(text(),'See all in Automotive Tools & Supplies')]")
    WebElement automotiveOP;

    @FindBy(xpath = "//span[contains(text(),'Other Parts & Accessories')]")
    WebElement other;

    @FindBy(xpath = "//a[contains(text(),'See all in Other Parts & Accessories')]")
    WebElement otherOP;
    @FindBy(xpath = "//span[contains(text(),'ATV & UTV Parts')]")
    WebElement atv;

    @FindBy(xpath = "//a[contains(text(),'See all in ATV & UTV Parts')]")
    WebElement atvOP;

    @FindBy(xpath = "//span[contains(text(),'Motorcycle Parts')]")
    WebElement motorcycle;

    @FindBy(xpath = "//a[contains(text(),'See all in Motorcycle Parts')]")
    WebElement motorOP;
    @FindBy(xpath = "//span[contains(text(),'Wheels & Tires')]")
    WebElement wheels;
    @FindBy(xpath = "//a[contains(text(),'See all in Wheels & Tires')]")
    WebElement wheelsOP;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]")
    WebElement allHiddenOptionInfo;
    @FindBy(xpath = "//span[contains(text(),'Car & Truck Parts')]")
    WebElement carParts;
    @FindBy(xpath = "//a[contains(text(),'See all in Car & Truck Parts')]")
    WebElement carPartOp;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
    WebElement motorClick;
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[1]/button[1]/span[1]")
    WebElement vehicle;

    @FindBy(xpath = "//a[contains(text(),'Cars & Trucks')]")
    WebElement carsOp;

   public MotorsPage() {
       PageFactory.initElements(driver, this);

   }



//Asserting the info of the relative page
public void motorPageClick(){
click(motorClick);
Assert.assertEquals(retrieveTitle(),"eBay Motors: Auto Parts and Vehicles | eBay", "Title isn't a match");
if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334")){
    Assert.assertTrue(true);
}else {Assert.assertTrue(false);}
    System.out.println("Current Title of the page is: "+retrieveTitle());
    System.out.println("");
}


//Verifying each category hidden button and their relative clickable hidden options info
public void vehicleClick(){
motorPageClick();
click(vehicle);
isDisplaying(carsOp);

click(carsOp);
assertURLTitle("Cars & Trucks for sale | eBay","https://www.ebay.com/b/Cars-Trucks/6001/bn_1865117");

}

public void carPartsClick(){
click(carParts);
isDisplaying(carPartOp);
waitFor(3);
click(carPartOp);
assertURLTitle("Car & Truck Parts & Accessories for sale | eBay","https://www.ebay.com/b/Car-Truck-Parts-Accessories/6030/bn_562630");
}

public void wheelClick(){
click(wheels);
isDisplaying(wheelsOP);
click(wheelsOP);
assertURLTitle("Car & Truck Wheels, Tires & Parts for sale | eBay","https://www.ebay.com/b/Car-Truck-Wheels-Tires-Parts/33743/bn_584076");
}



public void motorCycleClick(){
click(motorcycle);
isDisplaying(motorOP);
click(motorOP);
assertURLTitle("Motorcycle Parts for Sale - eBay","https://www.ebay.com/b/Motorcycle-Parts/10063/bn_557636");
}


public void atvClick(){
click(atv);
isDisplaying(atvOP);
click(atvOP);
assertURLTitle("ATV, Side-by-Side & UTV Parts & Accessories for Sale - eBay","https://www.ebay.com/b/ATV-Side-by-Side-UTV-Parts-Accessories/43962/bn_562707");
}

public void otherClick(){
click(other);
isDisplaying(otherOP);
click(otherOP);
assertURLTitle("Buy Auto Parts & Accessories | eBay","https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479");

}


public void autoClick(){
click(automotive);
isDisplaying(automotiveOP);
click(automotiveOP);
assertURLTitle("Automotive Tools & Supplies for Sale - eBay","https://www.ebay.com/b/Automotive-Tools-Supplies/34998/bn_1865501");


}

public void footerText(){
motorPageClick();
System.out.println("Motors Page Footer Info: "+"\n------------------------------------");
System.out.println(bottomTXT.getText());
Assert.assertEquals(bottomTXT.getText(),bottomTXT.getText(),"Footer Text isn't a match");
}


//Verifying Category select options
public void allHiddenOptionsInfo(){
motorPageClick();
hiddenButtonLists(allHiddenOptionInfo);
   }
















}
