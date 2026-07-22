package Day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
	public WebDriver driver;
	public static void main(String[] args) {
		
		// Cast driver to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;

		// Locate the element
		WebElement element = driver.findElement(By.id("username"));

		// Set value using JavaScript
		js.executeScript("arguments[0].value='testuser';", element);
	}

}
