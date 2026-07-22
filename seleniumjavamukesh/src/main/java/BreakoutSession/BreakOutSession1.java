package BreakoutSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BreakOutSession1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.name("email1")).sendKeys("admin@email.com");
		driver.findElement(By.name("password1")).sendKeys("admin@123");
		
		driver.findElement(By.xpath(".//button[text()='Sign in']")).click();
				
		
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath(".//span[text()='Manage']"))).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Manage Courses']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add New Course']")).click();
		
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		
		String errmessage=driver.findElement(By.xpath("	")).getText();
		
		if(errmessage.contains("Please fill all the fields")) {
			System.out.println("validation 1 is passed");
		}else {
			System.out.println("validation 1 is failed");
		}
		
		driver.findElement(By.xpath(".//input[@type='file']")).sendKeys("C:/Users/Lenovo/Downloads/Ravi2.jpg");
		
		driver.findElement(By.xpath(".//input[@id='name']")).sendKeys("My First Course");
		driver.findElement(By.xpath(".//textarea[@name='description']")).sendKeys("My First Course Description");
		driver.findElement(By.xpath(".//input[@name='instructorName']")).sendKeys("Raveendra");
		driver.findElement(By.xpath(".//input[@name='price']")).sendKeys("1000");
		
		
		driver.findElement(By.xpath(".//div[text()='Select Category']")).click();
		driver.findElement(By.xpath(".//button[text()='Selenium']")).click();
		
		
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		
		WebElement course= driver.findElement(By.xpath(".//td[text()='My First Course']"));
		
		String get=course.getText();
		System.out.println(get);
		if(get.equals("My First Course")) {
			System.out.println("Course is added Successfully:");
	
		}
		else {
			System.out.println("Course is not added:");
		}
		
		WebElement activate=driver.findElement(By.xpath("(.//img[@alt='activate'])[2]"));
		if(activate.isEnabled()) {
			System.out.println("Activate button is enabled");
		}
		else {
			System.out.println("Activate button is disabled");
		}
		
		driver.findElement(By.xpath(".//button[text()='Delete']")).click();
		System.out.println("Course is deleted successfully");
		
		driver.quit();
	}

	

}
