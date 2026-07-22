package BreakoutSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrmPortal {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username= driver.findElement(By.name("username"));
		WebElement password= driver.findElement(By.name("password"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		
		driver.findElement(By.xpath(".//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
		
		
			
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("T");
		
		Thread.sleep(5000);
		List<WebElement> list1=driver.findElements(By.xpath("//div[@role='option']"));
		
		System.out.println("Total Dropdown:" +list1.size());
		for(WebElement ele:list1) {
			String text1=ele.getText();
			System.out.println("Dropdown values:" +text1);
			if(text1.contains("Test Automation")) {
				Thread.sleep(3000);
				ele.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Status']//following::div[text()='-- Select --'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[2]")).sendKeys("raveendra13@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[3]")).sendKeys("Demo@12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[4]")).sendKeys("Demo@12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("raveendra13@gmail.com");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement>rowcount=driver.findElements(By.xpath("(//div[@role='row'])[2]"));
		System.out.println("Total Row Count:" +rowcount.size());
		if(rowcount.size()>=0) {
			System.out.println("User is added successfully");
		}
		else {
			System.out.println("User is not added successfully");
		}
				
		//delete user
		driver.findElement(By.xpath("//div[@class='oxd-table-card-cell-checkbox']//following::button[@type='button'][1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		System.out.println("User is deleted successfully");
		
}

}


