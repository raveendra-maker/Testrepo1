package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class HTTPRequest {
	
@Test
public void getUser() {
	
		 given()
		.when()
		 	.get("https://www.google.com/")		 	
		.then()
		 	.statusCode(200)
		 	.log().all();
	
}
}
