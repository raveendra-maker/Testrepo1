package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Oauth {

	@Test
	public void postTwitt() {
		
Response response= RestAssured
		.given()
		.auth()
		.oauth("VUhD4sE7B4CwG6naRwT0IoLgA",
				"01AO1EoRfqRB1RuyQfq0OsSAINTp1Xhaygpmw4AFrhVU3V4KG4",
				"AAAAAAAAAAAAAAAAAAAAALKG9gEAAAAAdP6GfABUEaguoUN8urDhsKPL%2",
				"F6E%3DfKwFOQ1fDwiCD76vOYYxWoulbhLqrwY3NeZICPN4MPniwZG0MJ")
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my tweet via API");
		 System.out.println(response.getStatusCode());	
		 System.out.println(response.getBody().jsonPath().prettify());
		 JsonPath json=response.jsonPath();
		 	 
		 String tweetId=json.get("id_str");
		 System.out.println("My tweet ID:" +tweetId);
		
		
		
	}

}
