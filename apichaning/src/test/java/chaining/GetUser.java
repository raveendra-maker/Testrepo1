package chaining;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetUser {
	
	@Test
	void test_GetUser() {
		
		String bearerToken ="67bca5138e437803d4cf555915e6797524a16a3923d9037d32bdc7bf432d0664";
		
	Response response=given()
		.header("Authorization","Bearer "+bearerToken)
		.contentType("application/json")
				
		
		.when()
		.get("https://gorest.co.in/public/v2/users");
				
		response.then()
		.statusCode(200)
		.log().all();
		List<Integer>id=response.jsonPath().getList("id");
		for(Integer i:id) {
			System.out.println(" List of ID:" + i);
			
		}
		
	}

}
