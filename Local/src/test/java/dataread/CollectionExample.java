package dataread;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionExample {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Scroll up and down the page using JavaScriptExecutor
		
		Thread.sleep(2000);
		//Run the javascript code
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-300)");
		
	
		or 
		((JavascriptExecutor)driver.executeScript("window.scrollBy(0,500)");
	}

}
