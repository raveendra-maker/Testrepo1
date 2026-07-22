package basic;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentsQueryParm {

	@Test
	public void getAllInciden() {
		
		RestAssured.baseURI ="https://api.restful-api.dev/objects";
		RestAssured.authentication= RestAssured.basic(" ", " ");
		
		Response response=RestAssured
				//request specification is the class which contains all the information about the request like query parameters, headers, body etc
				//given is the method which is used to specify the request specification.
				.given()
				.queryParam("sysparm_fields", "sys_id,number,Category")
				.queryParam("category","software")
				.get();
	
		System.out.println("Response status code: " + response.getStatusCode());
		System.out.println("Response Content Type: " + response.getContentType());
		response.prettyPrint();
	
	


	
		
	}
}

