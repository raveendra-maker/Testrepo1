package dataread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link: links) {
			String linkURL= link.getAttribute("href");
			URL url=new URL(linkURL);
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpURLConnection =(HttpURLConnection) urlconnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode()==200)
				System.out.println(linkURL + " - " + httpURLConnection.getResponseCode() +" " + httpURLConnection.getResponseMessage());
			
		}

	}

}
