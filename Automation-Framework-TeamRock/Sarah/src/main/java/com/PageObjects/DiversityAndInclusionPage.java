package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class DiversityAndInclusionPage extends Constants {

 @FindBy(xpath = "//body/div[@id='main-content']/main[1]/section[1]/div[1]")
 WebElement numbersText;
 @FindBy(xpath = "//a[contains(text(),'By The Numbers')]")
WebElement bythenumbers;


@FindBy(xpath = "//a[contains(text(),'Diversity & Inclusion')]")
WebElement diversityPage;

@FindBy(xpath = "//body/div[@id='main-content']/main[1]/section[7]")
WebElement featuredBody;



public DiversityAndInclusionPage(){
    PageFactory.initElements(driver,this);
}



//Asserting page title and URL
public void diversityClick(){
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
click(diversityPage);
assertURLTitle("Diversity, Equity & Inclusion - eBay Inc.","https://www.ebayinc.com/company/diversity-equity-inclusion/");
}

public void featuredBody() throws IOException {
moveMouseTo(featuredBody);
waitFor(3);
takeScreenshot("FeaturedBody-DiversityPage");
}

public void numberspageCLick(){
click(bythenumbers);
assertURLTitle("By The Numbers: Diversity, Equity & Inclusion - eBay Inc.","https://www.ebayinc.com/company/diversity-equity-inclusion/by-the-numbers/");
}


public void numbersTextCheck(){
System.out.println("The numbers headers Text is: "+ "\n***********************");
System.out.println(numbersText.getText());
Assert.assertEquals(numbersText,numbersText,"Text is not a match");
}



}


