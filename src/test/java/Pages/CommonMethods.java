package Pages;

import Pages.CommonStepDefinitions;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {

   // public static String scenarioname;
    CommonStepDefinitions cm=new CommonStepDefinitions();
    WebDriver driver=cm.getDriver();
 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));



    public By findlocator(String locatorval,String locatortype){

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
    public  void click(String locator){

        String locatorval=locator.split("~")[0];
        String locatortype=locator.split("~")[1];

        By locator1= findlocator(locatorval,locatortype);
        wait.until(ExpectedConditions.elementToBeClickable(locator1));
        driver.findElement(locator1).click();



    }

    public void takescreenshot() throws IOException {
        try {
            TakesScreenshot ts=(TakesScreenshot)driver;
            Thread.sleep(3000);
            File src=ts.getScreenshotAs(OutputType.FILE);
            File file=new File("src/test/java/Utility/Screenshots/"+System.currentTimeMillis()+cm.scenarioname+".jpg");
            FileUtils.copyFile(src,file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



















}
