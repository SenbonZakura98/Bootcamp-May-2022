package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class SearchResultSelect extends Constants {
    Actions action;
    HomePageSearches searches;
    @FindBy(id = "gh-btn")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[21]/div/div[1]/div/a/div/img")
    WebElement ps5;
    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[20]/div/div[1]/div/a/div/img")
    WebElement iPhone;
    @FindBy(xpath = "//div[@id='srp-river-results']/ul/li")
    List<WebElement> productsList;

    public SearchResultSelect() {
        PageFactory.initElements(driver, this);
        searches = new HomePageSearches();
        action = new Actions(driver);


    }


    public void getAllproducts() {
       try{ searches.searchAnItem();
        searchBtn.click();
        System.out.println("Below are the all the results for this search:");
        System.out.println("------------------------------------------------" + "\n");
        List<WebElement> allProducts = productsList;
        Iterator<WebElement> productlist = allProducts.iterator();
        while (productlist.hasNext()) {
            WebElement products = productlist.next();



              System.out.println(products.getText());
          }
        }catch (Exception e){
           e.printStackTrace();
       }
    }


    public void selectFromiPhones(int productNumber) {
      try {
          searches.searchAnItem();
          searchBtn.click();
          System.out.println("iPhone Search Page title is :" + driver.getTitle());
          waitFor(3);
          String iphoneSelect = String.format("//div[@id = 'srp-river-results']/ul/li[%d]", productNumber);
          String selectingIphone = driver.findElement(By.xpath(iphoneSelect)).getText();
          System.out.println("Below are information for the selected iphone:");
          System.out.println("--------------------------------------------------" + "\n");
          System.out.println(selectingIphone);
//Have to Click this ITem
          waitFor(3);

      }catch (Exception e){
          System.out.println(e.getMessage());
      }}



        public void selectFromPS5 ( int productNumber){
          try {
              searches.searchAnotherItem();
              searchBtn.click();
              String title = driver.getTitle();
              System.out.println("PS5 search select Title is : " + title);
              waitFor(3);
              String ps5Select = String.format("//div[@id = 'srp-river-results']/ul/li[%d]", productNumber);
              String consoleSelect = driver.findElement(By.xpath(ps5Select)).getText();
              System.out.println("Below are the selected PS5 Informations: ");
              System.out.println("---------------------------------------------" + "\n");
              System.out.println(consoleSelect);
              action.moveToElement(ps5).click().perform();// --Clicking on the link of selected ps5 in search results
              waitFor(3);
              System.out.println("After clicking on selected item title is: " + driver.getTitle());
          }catch (Exception e){
              System.out.println(e.getMessage());
          }}

}

