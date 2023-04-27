package Pages;

import Pages.OrangePage;
import Pages.Orangepage2;
import Utility.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CommonStepDefinitions {

    public static WebDriver getDriver() {
        return driver;
    }
   public static WebDriver driver;
    public static String scenarioname;


//    @Before
//    public  void beforeScenario(Scenario s){
//        drivercall();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        scenarioname=s.getName();
//    }



    public  void drivercall() {
        if (driver == null) {
            switch (Constants.browsertype) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\java\\Drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.get(Constants.App_url);
                    //initobj();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\java\\Drivers\\chromedriver.exe");
                    // WebDriver driver=new ChromeDriver();
                    break;
                default:
                    driver = null;
                    break;
            }
        }
    }


    public void quit(){
        driver.quit();
        driver=null;
    }

    public static void initobj(){
       // PageFactory.initElements(CommonStepDefinitions.getDriver(), OrangePage.getinstance());
        //PageFactory.initElements(CommonStepDefinitions.getDriver(), Orangepage2.class);
       // PageFactory.initElements(cm.getDriver(), CommonMethods.getinstacnce());
    }





}
