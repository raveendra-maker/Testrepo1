package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EventListeners {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			
		driver.findElement(By.xpath(".//span[text()='PIM']")).click();
		
		//This is Hiden drop down from Inspect>Event Listeners >blur> delete the value 
		//driver.findElement(By.xpath(".//span[text()='Sales']")).click();
		driver.findElement(By.xpath("(.//div[text()='-- Select --'])[3]")).click();
		
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath(".//div[@role='option']"));
		
		System.out.println(list.size());
		Thread.sleep(5000);
		for(WebElement e:list) {
			System.out.println(e.getText());
			
		}
				
		driver.quit();
		}
		
		
		
		
		

	}


