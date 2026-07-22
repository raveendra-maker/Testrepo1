package windowhandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		String parentwindow=driver.getWindowHandle();
		
		
		Set<String>handles=driver.getWindowHandles();
		// A Set does not support index-based access, so convert it to a List.
		List<String>hList=new ArrayList<String>();	
		hList.addAll(handles);
		System.out.println("parent and child window handles: "+hList);
		 
				
		//switch to child window
		String childWindow=hList.get(1);
		driver.switchTo().window(childWindow);
		Thread.sleep(9000);
		System.out.println("Title of child window:" +driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		/*String ThirdWindow=hList.get(2);
		driver.switchTo().window(ThirdWindow);
		System.out.println("Moved to Third Window:");*/
			
		Set<String>handles1=driver.getWindowHandles();	
		List<String>hList1=new ArrayList<String>();
		hList1.addAll(handles1);
		System.out.println("The Third window Handles:"+hList1);
		
		//switch to third window
		String thirdWindow=hList1.get(2);
		driver.switchTo().window(thirdWindow);
		Thread.sleep(7000);
		System.out.println("Title of third window:" +driver.getTitle()); 
		
		driver.findElement(By.xpath("//span[text()='I already have an account']")).click();
		
	}
}

