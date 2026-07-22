

package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredWindow1 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String>handles= driver.getWindowHandles();
		List<String>hlist=new ArrayList<String>(handles);
		
		if(switchToRightWindow("LinkedIn",hlist)) {
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
				}
		
		
				}
			public static void switchToParentWindow(String parentWindow) {
			driver.switchTo().window(parentWindow);
			}
	    
	
	public static boolean switchToRightWindow(String windowTitle, List<String>hlist) {
		for(String e: hlist) {
			String title= driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("Found the right window");
				return true;
			}
		    }
		return false;
	}
	 
	}

	


		
		
		

	

