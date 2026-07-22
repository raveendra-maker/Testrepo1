package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredWindow {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		//refer you tube link https://www.youtube.com/watch?v=7xh371gk2ho
		
		Set<String>handles=driver.getWindowHandles();
		List<String>hList=new ArrayList<String>(handles);
		if(switchToRightWindow("YouTube", hList)) {
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		}
		 
		//switchToParentWindow(parentWindow);
	   }
		
		public static void switchToParentWindow(String parentWindow) {
			driver.switchTo().window(parentWindow);
		}
		
		public static boolean switchToRightWindow(String wintitle, List<String>hList) {
				for(String e: hList) {
				String title = driver.switchTo().window(e).getTitle();
				if(title.contains(wintitle)) {
				System.out.println("Found the right window:");
				return true;
				}
				}
				
			return false;
		
		}
	    }
		
		
		

	


