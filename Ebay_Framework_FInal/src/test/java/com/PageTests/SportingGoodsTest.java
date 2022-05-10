package com.PageTests;

import com.PageObjects.SportingGoods;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SportingGoodsTest extends Constants {
SportingGoods goods;

    @BeforeMethod
public void startUp(){
    launchBrowser();
    goods = new SportingGoods();
}

@Test
public void callinAllHiddenItems(){
goods.sportingGoodsClick();
waitFor(3);
goods.clickboxing();
waitFor(1);
goods.clickcyclingLink();
waitFor(1);
goods.clickfitnessRunningYogaLink();
waitFor(1);
goods.clickfishingLink();
waitFor(1);
goods.clickgolfLink();
waitFor(1);
goods.clickhuntingLink();
waitFor(1);
goods.clickindoorGamesLink();
}
@Test
public void logoTest(){
goods.logoClick();
}

@Test
public void checkBottomText(){
goods.getBottomText();
}


@Test
public void sportingGoodsClicks() throws IOException {
goods.clickingLinks();
    }

@Test
public void getFullpageInfo(){
goods.fullPageText();
}

@Test
public void clickingItems() throws IOException {
goods.itemClicking();
}

@AfterMethod
public void tearDown(){
driver.close();
}



}
