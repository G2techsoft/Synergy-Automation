package Glues;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogMe {

    Scenario scenario;

    public void reportlog(String message) {

       // ExtentHtmlReporter  htmlReporter=new ExtentHtmlReporter("./test-output/log.html");

        ExtentReports extentReports=new ExtentReports();
     // extentReports.
        //extentTest.log

    }

    public static void info(String d)
    {
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.BLUE));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.AMBER));
        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.BLACK));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.BROWN));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.CYAN));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.GREY));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.INDIGO));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.LIME));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.ORANGE));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.PINK));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.YELLOW));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.WHITE));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.TRANSPARENT));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.TEAL));
//        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.PURPLE));

    }
    public static void pass(String d)
    {
        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.GREEN));
    }
    public  static void fail(String d)
    {
        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.createLabel(d, ExtentColor.RED));
        // ExtentCucumberAdapter.getCurrentStep().log(Status.INFO,MarkupHelper.);
        //ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, mar);
    }

}
