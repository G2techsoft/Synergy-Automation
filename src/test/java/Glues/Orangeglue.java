package Glues;

import Pages.CommonStepDefinitions;
import Pages.Orangepage2;
import com.aventstack.extentreports.model.Report;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import jdk.javadoc.doclet.Reporter;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class Orangeglue extends  ActionMethods{

    //private static final Logger log=Logger.getLogger(ActionMethods.class);
    Orangepage2 op=new Orangepage2();
    LogMe logger =new LogMe();


    //CommonMethods am=new CommonMethods();


    @Given("Loginto Orangehrm with username as {string}")
    public void loginto_orangehrm_with_username_as(String string) throws IOException {
        try {

          // OrangePage.getinstance().enteruname(string);
           op.enteruname(string);
           LogMe.info("Username is "+string);

        } catch (Exception e) {


        }

    }

    @Then("password as {string}")
    public void password_as(String string) {
      //OrangePage.getinstance().enterpass(string);
        try {
            op.enterpass(string);
            LogMe.info("password is "+string);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("click on loginbutton")
    public void click_on_loginbutton() {
        try {
           //OrangePage.getinstance().login();
           op.login();
            //logger.info("USERNAME IS ");
            LogMe.info("Clicked on login button");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Given("Verify the title of the page is {string}")
    public void verify_the_title_of_the_page_is(String string) throws IOException {

        try {
            String title=  driver.getTitle();
            Assert.assertEquals(title,string);
            LogMe.info("Logged in successfully");
            LogMe.info("Title of the page is "+title);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
