package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class RegisterUserPage extends Constants {
Actions actions;
@FindBy(partialLinkText = "register")
    WebElement register;


public RegisterUserPage(){
    PageFactory.initElements(driver,this);
    actions = new Actions(driver);
}
@FindBy(xpath = "//*[@id='recaptcha-anchor']/div[1]")
WebElement notRobot;
@FindBy(xpath = "//li[@id='gh-un']")
WebElement user_info;
@FindBy(xpath = "//input[@id='personalaccount-radio']")
WebElement personalRadio;
@FindBy(xpath = "//input[@id='firstname']")
WebElement name1;
@FindBy(xpath = "//input[@id='lastname']")
WebElement name2;
@FindBy(xpath = "//input[@id='Email']")
WebElement emails;
@FindBy(xpath = "//input[@id='password']")
WebElement pass;
@FindBy(xpath = "//button[@id='EMAIL_REG_FORM_SUBMIT']")
WebElement submit;
@FindBy(xpath = "//img[@id='gh-logo']")
WebElement logo;
@FindBy(xpath = "//input[@id='showpassword']")
WebElement showPassword;
@FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/button[@id='gh-ug']/b[2]")
WebElement userInfobtn;

//Clicking on register page from homepage and asserting if radio button for personal account was selected
public void registerClick(){
click(register);
waitFor(2);
click(personalRadio);
boolean radioSel = personalRadio.isEnabled();
if (radioSel = true){
System.out.println("The Personal Radio Button Was Selected");
}else {System.out.println("The personal Radio Button Was NOT Selected!!");}
waitFor(2);
}

//Signing up for a new account by using xlsx file data
public void clickRegister(String firstname,String lastname,String email,String password) throws IOException {
registerClick();
name1.sendKeys(firstname);
waitFor(3);
name2.sendKeys(lastname);
waitFor(3);
emails.sendKeys(email);
waitFor(4);
pass.sendKeys(password);
waitFor(3);
click(showPassword);
waitFor(4);
submit.submit();
waitFor(5);
takeScreenshot("User_Registration_001");

}

public void captureUserInfo(){
waitFor(3);
userInfobtn.click();
waitFor(4);
click(user_info);
System.out.println("Logged in Users Name is: "+user_info.getText());

}
//Clicking on The register page from home page and asserting the URl
public void captureTitle(){
click(register);
System.out.println("Current Title is: "+ driver.getTitle());
if (driver.getCurrentUrl().equals("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F")){
    Assert.assertTrue(true);
}else {Assert.assertTrue(false);}

}




}



