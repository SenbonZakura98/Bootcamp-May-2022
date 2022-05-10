package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage extends Constants {
@FindBy(xpath = "//a[contains(text(),'News')]")
WebElement newsPage;

@FindBy(xpath = "//body/div[@id='main-content']/main[1]/aside[1]")
WebElement allTopics;



public NewsPage(){
    PageFactory.initElements(driver,this);
}



public void newsClick(){
    click(newsPage);
    assertURLTitle("Our News - eBay Inc.","https://www.ebayinc.com/stories/news/");
}



public void newsOptions(){
    System.out.println("The options are: "+"\n****************");
    System.out.println(allTopics.getText());
}



}
