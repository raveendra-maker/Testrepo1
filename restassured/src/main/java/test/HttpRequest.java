package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HttpRequest {

			
	@Test
	
	void getUsers()
	
	{
		RestAssured.authentication= RestAssured.basic(" ", " ");
		given()
		
		.when()
		
		.get("https://reqres.in/api/my-app/collections/todos/records")
		
		.then()
		.statusCode(200);
		
		
		
		
	}
	}

	


