import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Workout {
    public static void main(String[] args) throws InterruptedException {

        Logger log=Logger.getLogger(Workout.class);


       // PropertyConfigurator.configure("Logg.xml");
       PropertyConfigurator.configure("C:\\Users\\Balam\\IdeaProjects\\MyFrame\\src\\test\\resources\\Log4j.properties");
        log.info("heloooooooooooooooooo");

    }
}
