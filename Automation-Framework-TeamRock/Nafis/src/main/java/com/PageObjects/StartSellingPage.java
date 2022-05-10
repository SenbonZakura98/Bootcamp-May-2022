package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class StartSellingPage extends Constants {

@FindBy(xpath = "//*[@id='categorized_links_1']/div/ul/li[2]/p[2]/a")
WebElement sellerPolicy;



@FindBy(xpath = "//section[@id='faq']")
WebElement faqOptions;

@FindBy(xpath = "//div[@role='listbox']//div[@class='suggestion-list__item']")
WebElement searchSuggestiions;

@FindBy(xpath = "//a[contains(text(),'Start selling')]")
WebElement  startSellingClick;
@FindBy(linkText = "List an item")
WebElement listItem_btb;

@FindBy(xpath = "//body[1]/div[2]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
WebElement searchButton;


public StartSellingPage() {
    PageFactory.initElements(driver, this);
}





//Verifying relevant page info
public void pageClick(){
click(startSellingClick);
clickedPageURLTitle("Selling on eBay | Electronics, Fashion, Home & Garden | eBay","https://www.ebay.com/sl/sell");
}

//Clicking on List an Item button and verifying related functionalities
public void listingCheck() throws IOException {
pageClick();
click(listItem_btb);
assertURLTitle("List an item | eBay","https://www.ebay.com/sl/prelist/suggest");
sendAndClick(searchButton,"console");
waitFor(2);
takeScreenshot("Listing_StartSellPAge");
}

//Verifying auto suggestions in the search box
public void autoSuggestionAutomation() throws IOException {
pageClick();
click(listItem_btb);
assertURLTitle("List an item | eBay","https://www.ebay.com/sl/prelist/suggest");
searchButton.sendKeys("Console");
waitFor(5);
listElements("//div[@class = 'suggestion-list__item']");
takeScreenshot("SearchSuggestion_StartSellPage");
}


//Verifying FAQ Options
public void fAQQuestions(){
pageClick();
System.out.println("FAQ Options are: "+ "\n----------------------");
System.out.println(faqOptions.getText());

}

public void checkSellerPolicy(){
pageClick();
click(sellerPolicy);
waitFor(2);
assertURLTitle("Selling on eBay | Electronics, Fashion, Home & Garden | eBay","https://www.ebay.com/sl/sell");
waitFor(3);
List<WebElement> fullPageInfo  =(driver.findElements(By.xpath("//body")));
Iterator<WebElement> iteratePage = fullPageInfo.iterator();

int locationX, locationY;
System.out.println("Full Page Information is: "+"\n------------------------------");
while (iteratePage.hasNext()){
WebElement pageInfo = iteratePage.next();
locationX =pageInfo.getLocation().getX();
locationY = pageInfo.getLocation().getY();

scrollBy(locationX,locationY);
System.out.println(pageInfo.getText());




    }





}
}
