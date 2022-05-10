package com.PageObjects;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class SportingGoods extends Constants {
    Actions actions;
    @FindBy(xpath = "//section[@id='s0-18-12_1-0-1[0]-0-0")
    WebElement allCategories;
    @FindBy(xpath = "//img[@id='gh-logo']")
    WebElement ebayLogo;
    @FindBy(linkText = "Sporting Goods")
    WebElement sportingGoods;

    @FindBy(xpath = "//a[contains(text(),'Sporting Goods Deals')]")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'Sell Your Bicycle')]")
    WebElement sellBicycyle;

    @FindBy(xpath = "//div[contains(text(),'Hunting')]")
    WebElement item1;

    @FindBy(xpath = "//div[contains(text(),'Winter Sports')]")
    WebElement item2;

    @FindBy(xpath = "//div[contains(text(),'Team Sports')]")
    WebElement item3;

    @FindBy(xpath = "//body/div[5]/div[4]/div[3]/section[5]")
    WebElement bottomTexT;

    @FindBy(xpath = "//li[@id='s0-18-12_1-0-1[0]-0-0-27")
    WebElement boxingOptions;

    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]")
    WebElement golfClubs;
    @FindBy (xpath = "//a[contains(text(),'Electric Bikes')]")
    WebElement electricBikes;
    @FindBy (xpath = "//a[contains(text(),'Camping & Hiking Equipment')]")
    WebElement campingHiking;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")
    WebElement hunting;

    @FindBy (xpath = "//span[contains(text(),'Boxing & MMA Equipment')]")
    WebElement boxing;
    @FindBy (xpath = "//span[contains(text(),'Camping & Hiking Equipment')]")
    WebElement camping;
    @FindBy (xpath = "//span[contains(text(),'Cycling Equipment')]")
    WebElement cycling;
    @FindBy (xpath = "//span[contains(text(),'Fishing Equipment & Supplies')]")
    WebElement fishing;

    @FindBy (xpath = "//span[contains(text(),'Fitness, Running & Yoga Equipment')]")
    WebElement fitness;
    @FindBy (xpath = "//span[contains(text(),'Golf Equipment')]")
    WebElement golf;
    @FindBy (xpath = "//span[contains(text(),'Hunting Equipment')]")
    WebElement huntingLinks;
    @FindBy (xpath = "//span[contains(text(),'Indoor Games')]")
    WebElement indoorGames;


    public SportingGoods(){
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }
//Clicking the logo from the page and verifying title and URL
    public void logoClick (){
sportingGoodsClick();
actions.moveToElement(ebayLogo).click().build().perform();
Assert.assertEquals(driver.getTitle(),"Electronics, Cars, Fashion, Collectibles & More | eBay", "Title isn't a match");
if (driver.getCurrentUrl().equals("https://www.ebay.com/")){
Assert.assertTrue(true);
System.out.println("Title and URL is a match");
}else {Assert.assertTrue(false);}
    }



    public void ebayLogoClick(){
    actions.moveToElement(ebayLogo).click().build().perform();

    }

    //Clicking the page link from the homepage and verifying URL and Title to assert correct redirection
    public void sportingGoodsClick(){
        click(sportingGoods);
        System.out.println("Title now is :"+ driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Sporting Goods for sale | eBay","title isn't a match");
    if (driver.getCurrentUrl().equals("https://www.ebay.com/b/Sporting-Goods/888/bn_1865031")){
        Assert.assertTrue(true);
        System.out.println("URL is a match");
    }else Assert.assertTrue(false);}

    public void clickgolfClubsLink(){
        click(golfClubs);
    }
    public void clickelectricBikesLink(){
        click(electricBikes);
    }
    public void clickcampingHikingEquipmentLink(){
        click(campingHiking);
    }
    public void clickhuntingEquipmentLink(){
        click(hunting);
    }



    //Clicking hidden buttons and verifying their category options
    public void clickboxing(){
        click(boxing);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath("//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[1]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }
    public void clickcampingAndHikingLink(){
        click(camping);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[2]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }


    }
    public void clickcyclingLink(){
        click(cycling);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[3]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }
    public void clickfishingLink(){
        click(fishing);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[4]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }

    }
    public void clickfitnessRunningYogaLink(){
        click(fitness);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[5]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }
    public void clickgolfLink(){
        click(golf);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }
    public void clickhuntingLink(){
        click(huntingLinks);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[7]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }
    public void clickindoorGamesLink(){
        click(indoorGames);
        System.out.println("All the options in this category are: ");
        List<WebElement> options = driver.findElements(By.xpath(  "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[8]"));
        for (WebElement op: options){
            System.out.println(op.getText());
            System.out.println();
        }
    }


//Printing text located at the bottom of the page
public void getBottomText(){
sportingGoodsClick();
System.out.println("All the bottom Text of this page: ");
System.out.println();
System.out.println(bottomTexT.getText());
}

//Printing all info in the page
public void fullPageText() {
    List<WebElement> fullPageInfo = (driver.findElements(By.xpath("//body/div[6]")));

    Iterator<WebElement> iteratePage = fullPageInfo.iterator();

    int locationX, locationY;
    System.out.println("The whole page info is below: ");
    System.out.println("---------------------------------");
    while (iteratePage.hasNext()) {
        WebElement pageInfo = iteratePage.next();
        locationX = pageInfo.getLocation().getX();
        locationY = pageInfo.getLocation().getY();

        scrollBy(locationX, locationY);
        System.out.println(pageInfo.getText());

    }
}

//Clicking Hyper links above the Hidden buttons and asserting their URL's
public void clickingLinks() throws IOException {
    sportingGoodsClick();
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
    click(golfClubs);
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Golf-Clubs/115280/bn_7244234");
    takeScreenshot("GolfClub_SportingPage");
   waitFor(3);
    goBack();
    waitFor(3);
    click(electricBikes);
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electric-Bikes/74469/bn_1968968");
    takeScreenshot("EBikes_SportingPage");
    goBack();
    click(camping);
    takeScreenshot("Camping_SportingPage");
    driver.navigate().to("https://www.ebay.com/");
    System.out.println("Title is: "+ driver.getTitle());
    sportingGoodsClick();
    click(hunting);
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Hunting-Equipment/7301/bn_1865054");
    takeScreenshot("Hunting_SportingPage");
    goBack();
    ebayLogoClick();
    sportingGoodsClick();
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");

}

//Clicking items in the page and verifying if their correctly redirected
public void itemClicking() throws IOException {
sportingGoodsClick();
click(item1);
System.out.println("Title is : "+driver.getTitle());
takeScreenshot("Item1_SportingPage");
goBack();
click(item2);
System.out.println("Title is : "+driver.getTitle());
takeScreenshot("Item2_SportingPage");
goBack();
click(item3);
System.out.println("Title is : "+driver.getTitle());
takeScreenshot("Item3_SportingPage");
}


}