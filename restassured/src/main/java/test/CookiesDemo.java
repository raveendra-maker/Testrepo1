package test;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org. hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class CookiesDemo {
	
	/*@Test(priority=2)
	void testCookies()
	{
		
		Response res= given()
					
				
		.when()
			.get("https://www.google.com/")
			
		.then()
			.log().all();
		
	}*/
	
	
	@Test(priority=1)
	void getHeaders() {
		
		Response res= given()
				
			.when()
			.get("https://www.google.com/");
		
		//Get all the header
		Headers myheader=res.getHeaders();
		for(Header hd:myheader)
		{
			System.out.println(hd.getName()+ "      "+hd.getValue());
		}
		
		
	}

}
