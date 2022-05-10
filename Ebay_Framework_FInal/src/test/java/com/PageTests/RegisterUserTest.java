package com.PageTests;

import com.PageObjects.RegisterUserPage;
import com.TestBase.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterUserTest extends Constants {
RegisterUserPage userPage;
String sheetName = "Register_user_data";
Constants constants;
@BeforeMethod
  public void startUp(){
  launchBrowser();
  userPage = new RegisterUserPage();
  constants = new Constants();
  }


@Test
public void titleCheck(){
userPage.captureTitle();

}



  @DataProvider
  public Object[][] dataTest() throws IOException {
    return getTestData(sheetName);
  }


@Test(dataProvider = "dataTest")
  public void registerUserInput(String firstname, String lastname, String email,String password) throws IOException {
userPage.clickRegister(firstname,lastname,email,password);
userPage.captureUserInfo();
}

@AfterMethod
  public void tearDOWn(){
  driver.close();
}


}
