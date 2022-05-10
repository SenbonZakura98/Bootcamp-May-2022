package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

public class AddToCartPage extends Constants {
Actions actions;

@FindBy(xpath = "//a[@id='atcRedesignId_btn']")
WebElement addToCart;
@FindBy(xpath = "//h3[contains(text(),'Wireless Bluetooth Headphones Super Bass Foldable ')]")
WebElement airpods;

@FindBy(xpath = "//div[@id='srp-river-results']/ul/li[6]")
WebElement result;
@FindBy(xpath = "//input[@id='gh-ac']")
WebElement searchfield;

@FindBy(id = "gh-cat")
WebElement dropDown;

@FindBy(xpath = "//a[@id='vi-viewInCartBtn']")
WebElement goToCart;
@FindBy(linkText = "Sign in")
WebElement signIN;

@FindBy(xpath = "//button[@id='signin-continue-btn']")
WebElement conti;
@FindBy(xpath = "//input[@id='userid']")
WebElement email;

@FindBy(xpath = "//input[@id='pass']")
WebElement pass;
@FindBy(xpath = "//button[@id='sgnBt']")
WebElement submit;

@FindBy(xpath = "//body[1]/header[1]/div[1]/ul[1]/li[1]/button[1]/b[2]")
WebElement user_btn;

@FindBy(xpath = "//li[@id='gh-un']")
WebElement user_info;

@FindBy(xpath = "//*[@id='checkbox']")
WebElement robot_btn;

@FindBy(linkText = "Motors")
WebElement motor_btn;

public AddToCartPage(){
      PageFactory.initElements(driver, this);
    ChromeOptions options = new ChromeOptions();

    options.addArguments("start-maximized");

    options.addArguments("disable-infobars");

    options.addArguments("--disable-extensions");
actions = new Actions(driver);

  }


//Verifying relative page info
public void pageVerification(){
click(signIN);
if (driver.getCurrentUrl().equals("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F")){
Assert.assertTrue(true);}
else {Assert.assertTrue(false);}
Assert.assertEquals(driver.getTitle(),"Sign in or Register | eBay","Title isn't a match");
System.out.println("Title is:"+driver.getTitle());
    }



//Trying to log in using this method but Captcha is interfering and I am Unable to do so
public void loginCheck(){
waitFor(5);
click(signIN);
waitFor(10);
click(email);
email.sendKeys("sunnyDayAndJava@gmail.com");
waitFor(2);
click(conti);
waitFor(2);
click(pass);
pass.sendKeys("FoodAndJava247..");
waitFor(3);
click(submit);
waitFor(5);
//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.newassets.hcaptcha.com/captcha')]")));

//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='recaptcha-anchor']/div[1]"))).click();
System.out.println("Title is: "+driver.getTitle());
waitFor(2);
click(robot_btn);
click(user_btn);
System.out.println("Logged user is: "+user_info.getText());
}


//Verifying search info page title
public void searchItem() {
Select sel = new Select(dropDown);
sel.selectByVisibleText("Cell Phones & Accessories");
if (sel.getFirstSelectedOption().isSelected()) {
System.out.println("DropDown Category has been selected");
} else {
System.out.println("Dropdown wasn't appropriately selected!!");
}
waitFor(2);
sendAndClick(searchfield, "bluetooth earphones");
System.out.println("Current Title of the Page is: "+driver.getTitle());
}


//Adding to cart
public void addToCart() throws IOException {
searchItem();
waitFor(2);
click(airpods);
waitFor(2);
actions.moveToElement(driver.findElement(By.xpath("//*[@role='button']"))).click();
driver.navigate().refresh();
waitFor(5);
jsClick(goToCart);
waitFor(3);
//takeScreenshot1();
}

}


