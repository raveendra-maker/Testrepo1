package dataread;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDownsValues {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("iphone 17 max pro");
		
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath(".//span[@class='h-text-normal']"));
		
		System.out.println(list.size());
		System.out.println();
		
		for(WebElement e:list) {
			System.out.println(e.getText());
			String text=e.getText();
			
			if(text.contains("casetify iphone 17 pro max")) {
				e.click();
				break;
			}
			
		}
				
	}
}
	
	