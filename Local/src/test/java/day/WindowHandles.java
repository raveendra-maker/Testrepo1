package day;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandles {
	
	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Create WebDriverWait object (max wait time: 10 seconds)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Myelement")));
		
		
		//fluent wait
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		WebElement txtusername= mywait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='username']"));
		// Fulent wait
		// By using lambda expression (Java 8 and above)
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))       // total wait time
		        .pollingEvery(Duration.ofSeconds(5))       // check every 5 seconds
		        .ignoring(NoSuchElementException.class);   // ignore this exception

		WebElement element = wait.until(driver -> driver.findElement(By.id("username")));
		element.sendKeys("testuser");

			}
			
		});
			
		// Wait until condition is met
		WebElement element = driver.findElement(By.id(""));
        WebElement element = wait.until.(ExpectedConditions.visibilityOfElementLocated(By.id("Myelement")));
        element.click();
        
        
		Set< String> windowhandle=driver.getWindowHandles();
		Iterator<String> iterator=windowhandle.iterator();
		String parentwindow=iterator.next();
		String childwindow=iterator.next();
		
		driver.switchTo().window(childwindow);
		driver.switchTo().window(parentwindow);
		
		
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		action.contextClick(menu).perform();
		action.doubleClick().perform();
		action.
		
				//action.moveToElement(webElement).click().per
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText);
		alert.accept();
		alert.dismiss();
		
		
	
		
		
		
	}

	
		
	}

