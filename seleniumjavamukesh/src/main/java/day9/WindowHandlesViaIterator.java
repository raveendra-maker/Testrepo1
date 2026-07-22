package day9;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesViaIterator {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		Set<String>allwindow=driver.getWindowHandles();
		Iterator<String>iterator=allwindow.iterator();
		String parentWindow=iterator.next();
		String ChildWindow=iterator.next();
		
		System.out.println("All window:" +allwindow);
		
		driver.switchTo().window(ChildWindow);
		Thread.sleep(5000);
		System.out.println("Title of child window:" +driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(5000);
		
		Set<String>allwindow1=driver.getWindowHandles();
		Iterator<String>iterator1=allwindow1.iterator();
		String thirdWindow = iterator1.next();
		driver.switchTo().window(thirdWindow);
		System.out.println("Title of third window:" +driver.getTitle());
		System.out.println("All windows:" +allwindow1);
		
				
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='I already have an account']")).click();
		System.out.println("Moved to Thirdwindow:");
		
		
		
		

	}

}
