package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabOpen {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com/");

		//Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();
		
		//using selenium 4 new feature to open new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//Get all handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		//Convert to list
		List<String> hList=new ArrayList<>(allWindowHandles);
		System.out.println("All window handles: "+hList);
		driver.switchTo().window(hList.get(0));
		
		
		
	}

}
