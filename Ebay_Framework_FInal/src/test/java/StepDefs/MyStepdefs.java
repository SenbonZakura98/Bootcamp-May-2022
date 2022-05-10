package StepDefs;

import com.PageObjects.LogInPage;
import com.TestBase.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs extends Constants {
    LogInPage login;

    public MyStepdefs(){
        super();
        login = new LogInPage();
    }




    @Given("I am on ebay Homepage")
    public void i_am_on_ebay_homepage() {
        launchBrowser();

    }
    @When("I click on register and land on register page")
    public void i_click_on_register_and_land_on_register_page() {
        login = new LogInPage();
        login.signInClick();

    }
    @Then("I put email in email box and click continue")
    public void i_put_email_in_email_box_and_click_continue() {
        login = new LogInPage();
        login.emailClick();

    }
    @Then("I enter password in password field and click submit")
    public void i_enter_password_in_password_field_and_click_submit() {
        login = new LogInPage();
        login.passClick();

    }
    @Then("I can see the appropriate user logged in")
    public void i_can_see_the_appropriate_user_logged_in() throws IOException {
        login = new LogInPage();
        login.captureUserInfo();

    }

}
