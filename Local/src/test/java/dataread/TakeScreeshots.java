
package dataread;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreeshots {
	WebDriver driver;
	public static void main(String[] args) throws IOException {
		// Set path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

        // Launch browser
        WebDriver driver = new FirefoxDriver();

        // Open a webpage
        driver.get("https://www.example.com");

        // Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save screenshot to desired location
        FileUtils.copyFile(screenshot, new File("./Screenshot" + getCurrentDateTime() + ".png"));
		
		// Close browser
    	driver.close();
	}
        public static String getCurrentDateTime() {
    		SimpleDateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
    		Date currentDate=new Date();
    		return customFormat.format(currentDate);
    		
        }
		}
      
         











