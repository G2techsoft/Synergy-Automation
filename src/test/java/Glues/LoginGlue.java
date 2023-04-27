package Glues;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginGlue extends Driverclass{

    LoginPage login;

    @Given("verify user launched synergy url")
    public void verify_user_launched_synergy_url() {
        login = new LoginPage(driver);
        String title = login.getLoginPageTitle();
        if (title.equals("Synergy Dashboard")) {
            System.out.println("Successfully launched synergy login page");
        }
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String string, String string2) {
        login.enterUserName(string);
        login.enterPassword(string2);
    }

    @When("User click submit button")
    public void user_click_submit_button() {
        login.clickSubmitButton();
    }

    @Then("verify user get error message successfully")
    public void verify_user_get_error_message_successfully() {
        String errorText = login.getLoginError();
        if (errorText.equals("Entered User is not valid or User not registered. Please register.")) {
            System.out.println("Error message successfully displayed");
        }
    }

    @Then("verify user navigated next page successfully")
    public void verify_user_navigated_next_page_successfully() {
        //login.verifyUserLoginSuccessfully();
    }


}
