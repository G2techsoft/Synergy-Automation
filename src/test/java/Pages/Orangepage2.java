package Pages;

import Glues.ActionMethods;
import Glues.Hooks;

import java.io.IOException;

public class Orangepage2 extends ActionMethods{

    ActionMethods am=new ActionMethods();



    public  void enteruname(String unamee){
        try {

            String loc="username~name";
            am.sendkeys(loc,unamee);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public  void enterpass(String pass1) throws IOException {
       String loc="password~name";

        try {
           am.sendkeys(loc,pass1);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public void login(){
//        try {
           String loc="//*[contains(@type,'submit')]~xpath";
            am.click(loc);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }



}
