package Glues;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks extends Driverclass{
    public static String scenarioname;

    private static final Logger Log = Logger.getLogger(Hooks.class);
    LogMe logger =new LogMe();

//    public ExtentReports report;
//    public ExtentTest logger;

    @Before
    public void beforeScenario(Scenario s) throws InterruptedException {
//        ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\Balam\\IdeaProjects\\MyFrame\\test-output");
//        report=new ExtentReports();
//        report.attachReporter(reporter);
        Thread.sleep(3000);
        drivercall();
        // PropertyConfigurator.configure("Log4j.properties");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        scenarioname = s.getName();
        LogMe.info("Scenario "+scenarioname+" Started execution");



        // Log.info("before scenario started successfully");
    }

    @After(order = 1)
    public void AfterScenario(Scenario s) throws InterruptedException {
        if (s.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) driver;
            Thread.sleep(2000);
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            s.attach(src, "image/png", "");
            LogMe.fail("Scenario "+ s.getName()+" is failed");

        }
        else {
            TakesScreenshot ts = (TakesScreenshot) driver;
            Thread.sleep(2000);
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            s.attach(src, "image/png", "");
         LogMe.pass("Scenario "+ s.getName()+" is passed");
        }

        }



    @After(order = 0)
    public void logoutfromApplication() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//       driver.findElement(By.xpath("//*[text()='Paul Collings']")).click();
//        driver.findElement(By.xpath("//*[text()='Logout']")).click();
       driver.close();
       driver=null;

    }

}


    //to take SS after each step





