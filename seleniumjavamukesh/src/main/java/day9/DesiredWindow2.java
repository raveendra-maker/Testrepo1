package day9;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredWindow2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> iterator=handles.iterator();
		
		String parentwindow=iterator.next();
		String childwindow=iterator.next();
	
		
		//switch to child window
		driver.switchTo().window(childwindow);
		System.out.println("Title of child window:" +driver.getTitle());
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		//switch to third window
		String thirdwindow=iterator.next();
		driver.switchTo().window(thirdwindow);
		System.out.println("Title of third window:" +driver.getTitle());
		WebElement Mobile=driver.findElement(By.xpath(".//label[text()='Mobile number or email address']"));
		
		Mobile.click();
		Mobile.sendKeys("1234567890");
		
	}

}
