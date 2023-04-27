package Glues;

import Utility.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.mortbay.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driverclass {

public  static String scenarioname;
    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;

    private static final Logger Log=Logger.getLogger(Driverclass.class);


//    @Before
//    public  void beforeScenario(Scenario s){
//        drivercall();
//      // PropertyConfigurator.configure("Log4j.properties");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        scenarioname=s.getName();
//        Log.info("before scenario started successfully");
//    }

    public  void drivercall() {
        if (driver == null) {
            switch (Constants.browsertype){
                case "chrome":
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\java\\Drivers\\chromedriver111.exe");
                    driver = new ChromeDriver(options);
                    driver.get(Constants.App_url);
                    //initobj();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\java\\Drivers\\chromedriver.exe");
                    // WebDriver driver=new ChromeDriver();
                    break;
                default:
                    driver=null;
                    break;
            }
        }
    }


}
