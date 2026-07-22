package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(src, target).perform();
		act.clickAndHold(src).pause(3000).moveToElement(target).pause(3000).release().build().perform();
		
		
				
		
		

	}

}
