package com.PageTests;

import com.PageObjects.DailyDealsPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DailyDealsTest extends Constants {
    DailyDealsPage dealsPage;
public DailyDealsTest(){
    super();
}



@Test
public void fetchTitle() throws IOException, InterruptedException {
    dealsPage = new DailyDealsPage();
    dealsPage.dealsOptions();
}


@Test
public void checkingAllDropDowns() throws IOException, InterruptedException {
    dealsPage = new DailyDealsPage();

    dealsPage.dropDownCheck();
}

@Test
public void screenShot() throws IOException, InterruptedException {
    dealsPage = new DailyDealsPage();

    dealsPage.takingScreenshot();
}

@Test
public void featuredBody(){
    dealsPage = new DailyDealsPage();

    dealsPage.featuresBodyCheck();
}

@Test
public void itemsClick() throws InterruptedException, IOException {
    dealsPage = new DailyDealsPage();

    dealsPage.dropDownItemsClick();
}

}
