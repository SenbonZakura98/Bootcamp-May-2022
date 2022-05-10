package com.PageTests;

import com.PageObjects.DiversityAndInclusionPage;
import com.TestBase.Constants;
import org.testng.annotations.Test;

import java.io.IOException;

public class DiversityTest extends Constants {
DiversityAndInclusionPage dpage;

 public DiversityTest(){
     super();
 }


@Test
public void numbersText(){
dpage = new DiversityAndInclusionPage();
dpage.diversityClick();
dpage.numbersTextCheck();
}


 @Test
 public void byThenumber(){
dpage = new DiversityAndInclusionPage();
dpage.diversityClick();
dpage.numberspageCLick();
 }


@Test
 public void pageInfoVerification(){
 dpage = new DiversityAndInclusionPage();
 dpage.diversityClick();
 }

@Test
 public void featureCheck() throws IOException {
dpage = new DiversityAndInclusionPage();
dpage.diversityClick();
dpage.featuredBody();

}}
