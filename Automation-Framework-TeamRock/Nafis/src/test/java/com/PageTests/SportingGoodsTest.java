package com.PageTests;

import com.PageObjects.SportingGoods;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SportingGoodsTest extends Constants {
SportingGoods goods;





@Test
public void callinAllHiddenItems(){
    goods = new SportingGoods();
goods.sportingGoodsClick();
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
    goods = new SportingGoods();
goods.logoClick();
}

@Test
public void checkBottomText(){
goods = new SportingGoods();
goods.getBottomText();
}


@Test
public void sportingGoodsClicks() throws IOException {
goods = new SportingGoods();
goods.clickingLinks();
    }

@Test
public void getFullpageInfo(){
    goods = new SportingGoods();
goods.fullPageText();
}

@Test
public void clickingItems() throws IOException {
    goods = new SportingGoods();
goods.itemClicking();
}




}
