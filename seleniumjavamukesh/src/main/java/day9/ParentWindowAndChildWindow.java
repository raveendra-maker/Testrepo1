package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentWindowAndChildWindow {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.get("https://freelance-learn-automation.vercel.app/login");

	driver.findElement(By.id("email1")).sendKeys("admin@email.com");
	
	String parentwindow=driver.getWindowHandle();
	System.out.println("Primary window: "+parentwindow);
	
	driver.findElement(By.xpath("//div[@class='social']//a[contains(@href,'facebook')]")).click();
	
	Set<String> AllwindowHandles=driver.getWindowHandles();
	List<String>list1=new ArrayList<String>();
	
	list1.addAll(AllwindowHandles);
	
	String newTab=list1.get(1);
	
	driver.switchTo().window(newTab);
	
	String childwindowtitle=driver.getTitle();
	System.out.println("Title of new tab:" +childwindowtitle);
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	
	driver.switchTo().window(parentwindow);
	driver.findElement(By.id("password1")).sendKeys("password");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String NewTab=list1.get(1);
	driver.switchTo().window(NewTab);
	System.out.println("Title of new tab:" +childwindowtitle);
	
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	
}
}