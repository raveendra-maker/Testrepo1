package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class Demo {
	
	@Test
	void test1() {
		//Response response = RestAssured
		given()
		.contentType("contentType.json")
		
		.when()
			.get("https://fake-json-api.mock.beeceptor.com/users")
		
		.then()
			.statusCode(200)
			.header("content-type", "application/json; charset=utf-8")
			.log().all();
		
		
	}

	}


