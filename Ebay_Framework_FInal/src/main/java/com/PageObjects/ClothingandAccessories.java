package com.PageObjects;

import com.TestBase.Constants;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class ClothingandAccessories extends Constants {
Actions actions;
@FindBy(id = "gh-la")
WebElement ebayLogo;
    @FindBy(partialLinkText = "Women's Accessories")
    WebElement women_btn;
    @FindBy(partialLinkText = "See all in Specialty Clothing, Shoes & Accessories")
    WebElement select_all_speciality;
    @FindBy(partialLinkText = "Baby & Toddler Clothing")
    WebElement toddler_btn;

    @FindBy(partialLinkText = "Clothing & Accessories")
    WebElement clothesPage;
    @FindBy(xpath = "//a[contains(text(),'See all in Men')]")
    WebElement mens_btn;
    @FindBy(xpath = "//a[contains(text(),'See all in Baby')]")
    WebElement boys_btn;
    @FindBy(xpath = "//span[contains(text(),'Baby')]")
    WebElement babyLink;
    @FindBy(xpath = "//span[contains(text(),'Kids')]")
    WebElement kidsLink;
    @FindBy(xpath = "//span[contains(text(),'Men')]")
    WebElement menLink;
    @FindBy(xpath = "//span[contains(text(),'Specialty')]")
    WebElement specialtyLink;

    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement womenLink;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[1]/a[1]")
    WebElement luxaryWatchesLink;
    @FindBy(xpath = "//a[contains(text(),'Designer Handbags')]")
    WebElement designerHandbagsLink;
    @FindBy(linkText = "Fine Jewelry")
    WebElement fineJewelryLink;

    @FindBy(partialLinkText = "Collectible Sneakers")
    WebElement collectibleSneakersLink;
    @FindBy(partialLinkText = "/Costumes")
    WebElement costumesLink;
    @FindBy(xpath = "//a[contains(text(),'Personalized Items')]")
    WebElement personalizedItemsLink;
    @FindBy(xpath = "//a[contains(text(),'Sports Fan Clothing')]")
    WebElement sportsFanClothingLink;
    @FindBy(xpath = "//a[contains(text(),'Traditional & World Clothing')]")
    WebElement traditionalAndWorldClothingLink;

    public ClothingandAccessories() {
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

//Expanding Hidden Buttons and asserting if hidden items are shown
    public void expandingHiddenCategory() throws InterruptedException {
        clothesPage.click();

        menLink.click();
        boolean a = mens_btn.isDisplayed();
        System.out.println("Does the button appear?: " + a);

        babyLink.click();
        boolean b = boys_btn.isDisplayed();
        System.out.println("Does the button appear? :" + b);

        kidsLink.click();
        boolean c = toddler_btn.isDisplayed();
        System.out.println("Does the button appear? :" + c);

        specialtyLink.click();
        boolean d = select_all_speciality.isDisplayed();
        System.out.println("Is the button Displayed? :"+d);

        womenLink.click();
        boolean e = women_btn.isDisplayed();
        System.out.println("Does the button appear? :" + e);
    }
//Clicking the page link from homepage and asserting title and URl
 public void titleCheck(){
actions.moveToElement(clothesPage).click().build().perform();
System.out.println("Title of the page is: "+driver.getTitle() );
Assert.assertEquals(driver.getTitle(),"Clothing, Shoes & Accessories for sale | eBay","Title isn't a match");
if(driver.getCurrentUrl().equals("https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545")){
Assert.assertTrue(true,"URL is a match ");
}else {Assert.assertTrue(false,"URL isn't a match");}
}

//Checking if the hidden button was clicked and if they were clicking more items is possible or not

public void hiddenButtonCategory1() throws InterruptedException {
    try {
        waitFor(2);
        clothesPage.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        menLink.click();
        mens_btn.click();
        System.out.println("Clicking Mens category title is: " + driver.getTitle());
        goBack();
        System.out.println("Returned title now is :" + driver.getTitle());
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        moveMouseTo(kidsLink);
        kidsLink.click();
        toddler_btn.click();
        System.out.println("After clicking toddler button title is: " + driver.getTitle());
        driver.navigate().back();
        waitFor(3);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        click(babyLink);
        boys_btn.click();
        System.out.println("After clicking boys button title is: " + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        moveMouseTo(specialtyLink);
        specialtyLink.click();
        select_all_speciality.click();
        System.out.println("After Clicking the new Title is: " + driver.getTitle());
        goBack();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        ebayLogo.click();
        assertURLTitle("Electronics, Cars, Fashion, Collectibles & More | eBay", "https://www.ebay.com/");
        System.out.println(retrieveTitle());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
    //Checking if the hidden button was clicked and if they were clicking more items is possible or not

    public void selectingOtherCategories(){
        clothesPage.click();
        waitFor(3);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        luxaryWatchesLink.click();
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        Assert.assertEquals(retrieveTitle(), "Luxury Watches for Sale - New & Used Designer Watches - eBay");
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        waitFor(3);
        fineJewelryLink.click();
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        assertURLTitle("Fine Jewelry for Sale - Shop New & Pre-Owned Designer Jewelry - eBay", "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        collectibleSneakersLink.click();
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        assertURLTitle("Collectible Sneakers for Sale - Authenticity Guaranteed - eBay", "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");
        driver.navigate().back();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        personalizedItemsLink.click();
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        assertURLTitle("Personalized Gifts products for sale | eBay", "https://www.ebay.com/b/Personalized-Gifts/bn_7117888240");
        driver.navigate().back();

        waitFor(3);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        traditionalAndWorldClothingLink.click();
        System.out.println("Title is: " + driver.getTitle());
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        assertURLTitle("World & Traditional Clothing for sale | eBay", "https://www.ebay.com/b/World-Traditional-Clothing/155240/bn_700999");
        driver.navigate().back();
    }
}