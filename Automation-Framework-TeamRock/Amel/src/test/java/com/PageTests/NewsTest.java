package com.PageTests;

import com.PageObjects.NewsPage;
import com.TestBase.Constants;
import org.testng.annotations.Test;

public class NewsTest extends Constants {
NewsPage page;

@Test
public void newsPageCLick(){
    page = new NewsPage();
    page.newsClick();
}

    @Test
public void newsOptionPrint(){
    page = new NewsPage();
    page.newsClick();
    page.newsOptions();
    }

}
