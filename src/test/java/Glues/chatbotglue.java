package Glues;

import io.cucumber.java.en.*;

import javax.swing.*;
import java.io.IOException;

public class chatbotglue extends ActionMethods {

Chatbotpage cp=new Chatbotpage();

    @Given("Loginto url with below credentials")
    public void loginto_url_with_below_credentials() {
        System.out.println("logged in successfully");
    }

    @Given("check the chatbot is appear")
    public void checkanddismiss() throws IOException {
cp.checkbotanddismiss();
    }

    @Then("dismiss the chatbot")
    public void dismiss_the_chatbot() {
        System.out.println("bot dismissed");
    }

    @Given("Loginto the url with below credentials")
    public void loginto_the_url_with_below_credentials() {
        System.out.println("bot dismissed");

    }

    @Given("check the chatbot is appear or not")
    public void check_the_chatbot_is_appear_or_not() {
        System.out.println("bot dismissed");
    }

    @Then("move to chatbot and dismiss it")
    public void move_to_chatbot_and_dismiss_it() {
        System.out.println("bot dismissed");
    }

}
