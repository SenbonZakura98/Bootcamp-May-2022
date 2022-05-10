package com.TestBase;

import com.Analyzers.WebEventListener;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class Constants {
public static WebEventListener listener;
public static Actions actions;
public static WebDriver driver;
public static Properties prop;
public String configPath = "C:\\Users\\bassv\\intellij-workspace\\Ebay_Framework_FInal\\Properties\\config.properties";
public static FileInputStream ism;
public static FileInputStream file;
public  static Workbook book;
public static Sheet sheet;
public static Logger logger;
public static  String excelPath ="C:\\Users\\bassv\\intellij-workspace\\Ebay_Framework_FInal\\Datas\\Register_user_data.xlsx";


//Constructor
    public Constants() {
        logger = LogManager.getLogger("log4j.properties");
        prop = new Properties();
        try {
            ism = new FileInputStream(configPath);
            try {
                prop.load(ism);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //Method To Launch The browser
    public static void launchBrowser() {
        String driverPath = System.getProperty("user.dir");
        String browserInfo = prop.getProperty("browser");
        if (browserInfo.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverPath + File.separator + "Drivers" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();



        } else if (browserInfo.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", driverPath + File.separator + "Drivers" + File.separator + "geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(prop.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().window().maximize();

    }
    //public WebDriverWait wait= (new WebDriverWait(driver, 5));



    //Method to retrieve the Excel sheet data
    public static Object[][] getTestData(String sheetName) {

        try {
            file  = new FileInputStream(excelPath);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
        System.out.println("Total found "+sheet.getLastRowNum()+ " ROW's and "+sheet.getRow(0).getLastCellNum()+" COLUMN's in this table....\n");
        for(int i =0; i<sheet.getLastRowNum(); i++) {
            for(int j = 0; j<sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j]= sheet.getRow(i+1).getCell(j).toString(); // i+1 cell--0
                System.out.print(data[i][j]+" \t");

            }
            System.out.println("\n");
        }
        return data;
    }




    public String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }


    //Method to retrieve the title
    public void goBack(){
        driver.navigate().back();
    }


    //Method: To click an element
    public static void click(WebElement element){element.click();}


    //Method:: To type and click enter
    public static void sendAndClick(WebElement element, String text){
        element.sendKeys(text, Keys.ENTER);
    }



    //Method:: To Scroll to an element using JavaScript Executor
    public void scrollTo(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }


    //Method:: To take a Screenshot with the given corresponding name
    public static void takeScreenshot(String ScreenShotName) throws IOException{

        String timestamp  = new SimpleDateFormat("yyyy_MM_dd__hhhh_mm_ss").format(new Date());

        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(screenShot, new File(System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+ScreenShotName+timestamp+".jpeg"));
        System.out.println("****** Screenshot was taken check Screenshots Folder ****** ");
    }




//Method:: To use as a wait time in my code
    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    //Method:: To retrieve relative title ***
    public  String retrieveTitle(){
        return driver.getTitle();
    }


    //Method:: To move mouse to element using Actions Class
    public static void moveMouseTo(WebElement element){
         actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

//Method:: To Scroll the page by JavaScript Command
 public void scrollBy(int x, int y){
        JavascriptExecutor jsEngnine = (JavascriptExecutor) driver;
        String jsCommand = String.format("window.scrollBy(%d,%d)",x,y);

        jsEngnine.executeScript(jsCommand);
 }


 public static void refresh (){
    driver.navigate().refresh();
 }


 //Method:: To click an element using JavaScript Executor ***
public static void jsClick(WebElement element){
JavascriptExecutor jsClicker = (JavascriptExecutor)driver;
jsClicker.executeScript("arguments[0].click", element);
}


//Method:: TO click an element using the actions class ***
public static void actionClick(WebElement element){
    actions = new Actions(driver);
    actions.moveToElement(element).click().perform();
    }


//Method:: To verify if hidden button was clicked upon ***
public static void isDisplaying(WebElement element){
  if(element.isDisplayed()){
      System.out.println("Hidden Item is Displaying");
} else {
      System.out.println("Hidden Item is not Displaying");
  }

}
//A method to assert retrieved URL and Title ***
public static void assertURLTitle(String Title, String URL){
    Assert.assertEquals(driver.getTitle(),Title,"Title isn't a match");
    if (Objects.equals(driver.getTitle(), Title)){
        System.out.println("Title asserted! Title is a match");
    }else if (!Objects.equals(driver.getTitle(), Title)){
        System.out.println("Title was not a match!!!!");
    }
    if(driver.getCurrentUrl().equals(URL)){
        Assert.assertTrue(true);
    }else {Assert.assertTrue(false);}
    System.out.println("After CLicking The Item Title: "+driver.getTitle()+"\n");
if (Objects.equals(driver.getCurrentUrl(), URL)){
    System.out.println("URL was a match");
}else if (!Objects.equals(driver.getCurrentUrl(), URL)) {
    System.out.println("Title was not a match");
}
}


//Method:: To print hidden button options ***
public static void hiddenButtonLists(WebElement element){
 System.out.println("Selected Dropdown or Hidden Button Items :"+ "\n--------------------------------------------------------");
    System.out.println(element.getText());
    System.out.println("-----------------------------------");

}


//Method:: To assert a Page URL and Title***
public static void clickedPageURLTitle(String Title, String URL){
Assert.assertEquals(driver.getTitle(),Title, "Title is not a match");
if (driver.getCurrentUrl().equals(URL)){
    Assert.assertTrue(true);
}else {Assert.assertTrue(false,"Sorry, URL was not a match :(");}

System.out.println("Your Current Page Title :"+driver.getTitle()+"\n");
}




//Method:: TO find an element by using a locator and print all the items in the element****
public static void listElements(String locator){
List<WebElement> lists = driver.findElements(By.xpath(locator));

System.out.println("Items in this list  : "+"\n------------------------------------");
for (WebElement List: lists){
    //System.out.println(List.getText());
}
    System.out.println("The size of the list items: "+lists.size());

}



//Method:: To Take a Screenshot on a hovering element****
public static void hoverOverScreenshot(WebElement element, String ScreenShotName) throws IOException, UnsupportedFlavorException, AWTException, InterruptedException {

actions = new Actions(driver);

actions.moveToElement(element).build().perform();

Thread.sleep(3000);

actions.clickAndHold(element).build().perform();
Thread.sleep(2000);

String timestamp  = new SimpleDateFormat("yyyy_MM_dd__hhhh_mm_ss").format(new Date());
// Convert webdriver to TakeScreenshot

File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// Copy the file to a location and use try catch block to handle exception
Files.copy(screenShot, new File(System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+ScreenShotName+timestamp+".jpeg"));

actions.release().perform();
System.out.println("Hover Over Element Completed! Check ScreenShots Folder :)");


}




}






