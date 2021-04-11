import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try{

            final String firefoxDriverLocation = "/home/ken/Desktop/code/geckodriver-v0.29.1-linux32/geckodriver";
            System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);

            final FirefoxDriver driver = new FirefoxDriver();
            final WebDriverWait webDriverWait = new WebDriverWait(driver, 3000);
            driver.navigate().to("https://www.google.com/");

            final String googleSearchBox = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
            driver.findElementByXPath(googleSearchBox).sendKeys("pit bull");
            driver.findElementByXPath(googleSearchBox).submit();

            final String imagesLink = "/html/body/div[7]/div/div[4]/div/div[1]/div/div[1]/div/div[2]/a";
//            driver.findElementByXPath(imagesLink).click();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(imagesLink))).click();


//            driver.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
