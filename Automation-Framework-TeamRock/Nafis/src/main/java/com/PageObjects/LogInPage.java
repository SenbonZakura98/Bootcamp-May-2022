package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class LogInPage extends Constants {

@FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]")
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

public LogInPage(){
PageFactory.initElements(Constants.driver,this);
}


public void signInClick(){
signIN.click();
waitFor(5);
Assert.assertEquals(driver.getTitle(), "Sign in or Register | eBay", "Title isn't a match");
if (driver.getCurrentUrl().equals("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=")) {
Assert.assertTrue(true);
} else {
Assert.assertTrue(false);
}
}



public void emailClick(){
click(email);
email.sendKeys("sunnyDayAndJava@gmail.com");
click(conti);
waitFor(2);
}


public void passClick(){
click(pass);
pass.sendKeys("FoodAndJava247..");
logInClick();
}


public void logInClick(){
click(submit);
}

public void captureUserInfo() throws IOException {
waitFor(2);
user_btn.click();
System.out.println("The Logged In User Is: "+"\t");
System.out.println("\n");
System.out.println(user_info.getText());
takeScreenshot("User-Login-LoginPage");
}

public void captureTitle(){
    driver.getTitle();
}

public void closeBrowser(){
    driver.close();
}

}
