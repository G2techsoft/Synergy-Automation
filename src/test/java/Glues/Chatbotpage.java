package Glues;

import Glues.ActionMethods;
import Propertiees.Loadprop;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Chatbotpage extends ActionMethods {

Loadprop prop=new Loadprop();
    public void checkbotanddismiss() throws IOException {
        try {
            String locat=prop.getdata("chatbot2");
            waitUntilElementIsDisplayed(locat);
            Actions(locat,"movetoelement");
            String dismiss=prop.getdata("chatbotdismiss");
            click(dismiss);
        } catch (Exception e) {
            e.printStackTrace();
            takescreenshot();
        }

    }



}
