package dataread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabExample {

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();

	        // Open the first site in the parent tab
	        driver.get("https://www.selenium.dev");

	        // Open a new Window (or tab) and switch to it
	        driver.switchTo().newWindow(WindowType.TAB);

	        // Now driver is focused on the new tab
	        driver.get("https://www.google.com");

	        // You can switch back to the first tab using window handles
	        String parentHandle = driver.getWindowHandles().iterator().next();
	        driver.switchTo().window(parentHandle);
	        
	        //String parentHandle1= driver.getWindowHandles().iterator().next();
	        //driver.switchTo().window(parentHandle1);
	        
	        String childHandle=driver.getWindowHandles().iterator().next();
	        driver.switchTo().window(childHandle);

	        //driver.quit();
	    }
	}

	


