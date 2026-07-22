package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.findElement(By.xpath("(//button[normalize-space()='Tutorials'])")).click();
		
		List<WebElement> listofdropdown=driver.findElements(By.xpath(".//li[@role='presentation']"));
		
		System.out.println("List of Dropdown:" +listofdropdown.size());
		
		for(int i=0; i<listofdropdown.size();i++) {
			
			WebElement ele=listofdropdown.get(i);
			String txtValue=ele.getText();
			System.out.println("value:" +txtValue);
			if(txtValue.contains("HTML")) {
				ele.click();
				break;
				
			}
		}
		
		
		

	}

}
