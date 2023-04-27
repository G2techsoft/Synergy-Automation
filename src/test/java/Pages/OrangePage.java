package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangePage {


    public
    OrangePage orangePageInstance;

//    public static OrangePage getinstance(){
//if (orangePageInstance==null){
//    orangePageInstance=new OrangePage();
//}
//        return orangePageInstance;
//    }


@FindBy(name="username")
  WebElement uname;

    @FindBy(name="password")
WebElement pass;

    @FindBy(xpath="//*[contains(@type,'submit')]")
WebElement login;


    public  void enteruname(String unamee){
        try {


           uname.sendKeys(unamee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public  void enterpass(String pass1){
        try {
            pass.sendKeys(pass1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void login(){
        try {
            login.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
