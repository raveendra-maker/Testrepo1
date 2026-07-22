package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	//WebDriver driver;
	
	public static boolean waitForElementToBeInvisible(WebDriver driver,String xpathValue)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathValue)));
	}
	
	public static boolean waitForElementToBeInvisible(WebDriver driver, int timeOut, String xpathValue)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathValue)));
	}
}





