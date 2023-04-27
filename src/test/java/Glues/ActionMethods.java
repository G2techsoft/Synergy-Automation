package Glues;

import Utility.Constants;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ActionMethods {

    public static String scenarioname;
WebDriver driver=Driverclass.getDriver();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

private static final Logger log=Logger.getLogger(ActionMethods.class);


    public void quit(){
        driver.quit();
        driver=null;
    }

    public static void initobj(){
        // PageFactory.initElements(CommonStepDefinitions.getDriver(), OrangePage.getinstance());
        //PageFactory.initElements(CommonStepDefinitions.getDriver(), Orangepage2.class);
        // PageFactory.initElements(cm.getDriver(), CommonMethods.getinstacnce());
    }


    public By findlocator(String locatorval, String locatortype){

        By by=null;
        switch (locatortype.toLowerCase()){
            case "xpath":
                by=By.xpath(locatorval);
                break;
            case "id":
                by=By.id(locatorval);
                break;
            case "name":
                by=By.name(locatorval);
                break;
            case "css":
                by=By.cssSelector(locatorval);
                break;
            case "tag":
                by=By.tagName(locatorval);
                break;
            case "linktext":
                by=By.linkText(locatorval);
                break;
            default:
                by=null;
                break;
        }
        return by;
    }




    public void sendkeys(String locator, String s2){

        String locatorval=locator.split("~")[0];
        String locatortype=locator.split("~")[1];

        By locator1= findlocator(locatorval,locatortype);
     wait.until(ExpectedConditions.elementToBeClickable(locator1));
       driver.findElement(locator1).sendKeys(s2);


    }

    public void waitUntilElementIsDisplayed(String locator){
        String locatorval=locator.split("~")[0];
        String locatortype=locator.split("~")[1];

        By locator1= findlocator(locatorval,locatortype);
      List<WebElement> li= driver.findElements(By.xpath(locatorval));

      if (li.size()>0) {
          Actions actions=new Actions(driver);
          actions.moveToElement(li.get(0)).perform();

      }

    }
    public void Actions(String locator,String function) {
        String locatorval = locator.split("~")[0];
        String locatortype = locator.split("~")[1];

        By locator1 = findlocator(locatorval, locatortype);
        Actions actions = new Actions(driver);

        switch (function.toLowerCase()) {

            case "movetoelement":
                actions.moveToElement((WebElement) locator1).perform();
                break;
            case "rightclick":
                actions.contextClick((WebElement) locator1);
                break;
        }
    }

















    public  void  click(String locator){

        String locatorval=locator.split("~")[0];
        String locatortype=locator.split("~")[1];

        By locator1= findlocator(locatorval,locatortype);
      // wait.until(ExpectedConditions.elementToBeClickable(locator1));
        driver.findElement(locator1).click();



    }

    public  void AfterStep(Scenario s){
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        s.attach(src, "image", scenarioname);
    }

    public void takescreenshot() throws IOException {
        try {
            TakesScreenshot ts=(TakesScreenshot)driver;
            Thread.sleep(3000);
            File src=ts.getScreenshotAs(OutputType.FILE);
            File file=new File("src/test/java/Utility/Screenshots/"+System.currentTimeMillis()+scenarioname+".jpg");
            FileUtils.copyFile(src,file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
