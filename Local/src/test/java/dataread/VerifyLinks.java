package dataread;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLinks {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.verizon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on page:" + links.size());
		/*
		for(int i=0; i<links.size(); i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			verifyLinkActive(url);
		}*/
		for(WebElement element : links) {
		    String url = element.getAttribute("href");
		    verifyLinkActive(url);
		    }
		 
		 
	}
	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==httpURLConnect.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" - "+httpURLConnect.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			
		}
		
	}
}
