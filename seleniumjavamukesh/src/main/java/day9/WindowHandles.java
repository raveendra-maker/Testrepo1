package day9;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://freelance-learn-automation.vercel.app/signup");

		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		
		Set<String> AllwindowHandles=driver.getWindowHandles();
		Iterator<String>iterator=AllwindowHandles.iterator();
		
		String parentwindow=iterator.next();
		System.out.println("Primary window: "+parentwindow);
		driver.findElement(By.xpath("//div[@class='social']//a[contains(@href,'facebook')]")).click();
		String childwindow=iterator.next();
		driver.switchTo().window(childwindow);
		
		driver.switchTo().window(childwindow);
		String childwindowtitle=driver.getTitle();
		

	}

}
