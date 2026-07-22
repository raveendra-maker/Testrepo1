package basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentsQueryParmUsingMap {

	@Test
	public void getAllInciden() {
		
		RestAssured.baseURI ="";
		//RestAssured.authentication= RestAssured.basic(" ", " ");
		
		Map<String, String> param= new HashMap<String, String>();
		param.put("sysparm_fields","name,number,category");
		param.put("category","Software");
		Response response=RestAssured
				.given()
				.queryParams(param)
				.get();
	
		System.out.println("Response status code: " + response.getStatusCode());
		System.out.println("Response Content Type: " + response.getContentType());
		response.prettyPrint();
	
	


	
		
	}
}

