package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import java.io.IOException;

public class HomePageSearches extends Constants {


public HomePageSearches(){

    PageFactory.initElements(driver,this);
}
    @FindBy(id = "gh-ac")
    WebElement searchBox;
    @FindBy(id = "gh-btn")
    WebElement searchBtn;
    @FindBy(id = "gh-cat")
    WebElement dropDown;

@FindBy(xpath = "//h1[contains(text(),'results for')]")
WebElement results;


public String matchTitle(){
    String title = driver.getTitle();
    AssertJUnit.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay");
    System.out.println("HomePage title is: "+ title);
return title;}




  public void searchAnItem(){
      searchBox.click();
      searchBox.sendKeys("iphone");
      Select select = new Select(dropDown);
      select.selectByVisibleText("Cell Phones & Accessories");
      if(select.getFirstSelectedOption().isSelected()){
          System.out.println("DropDown Category has been selected");
      }else{System.out.println("Dropdown wasn't appropriately selected!!");}

  }

public void searchResult() throws IOException {
    searchAnItem();
    searchBtn.click();
    System.out.println("Search Result is: "+results.getText());
takeScreenshot("Iphone_Search");
    System.out.println("Search page title is:  "+driver.getTitle());
}

public void searchAnotherItem(){
    searchBox.click();
    searchBox.sendKeys("PS5");
    Select sel = new Select(dropDown);
    sel.selectByVisibleText("Video Games & Consoles");

if (sel.getFirstSelectedOption().isSelected()){
    System.out.println("Console Category is selected");
}else {
    System.out.println("Sorry :( try again!!");

}
}

public void anotherSearchResult(){
    searchAnotherItem();
    searchBtn.click();
    String title2 = driver.getTitle();
    System.out.println("This result page title is : "+title2);


}

}
