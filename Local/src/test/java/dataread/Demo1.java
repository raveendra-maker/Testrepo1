package dataread;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement reglink=driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		Set<String>wh=driver.getWindowHandles();
		Iterator<String>iterator=wh.iterator();
		String parentwindow=iterator.next();
		String childwindow=iterator.next();
		//or
		//List<String> ids=new ArrayList(driver.getWindowHandles());
		//driver.switchTo().window(ids.get(1)); control pass to child window
		//driver.switchTo().window(ids.get(0)); control pass to parent window
		
		driver.switchTo().window(childwindow);
			
		driver.findElement(By.id("FirstName")).sendKeys("Raveendra");
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("ravichintin@gmail.com");

	}

}
