package basic;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidents {

	@Test
	public void getAllInciden() {
		
RestAssured.baseURI =" ";
RestAssured.authentication= RestAssured.basic(" ", " ");
Response response=RestAssured.get();
	
	System.out.println("Response status code: " + response.getStatusCode());
	System.out.println("Response Content Type: " + response.getContentType());
	//response.prettyPrint();
	
	//convert response to json format
	JsonPath jsonpath=response.jsonPath();

	List<String> listOfSys_id=jsonpath.getList("result.Sys_id");
	
	
	System.out.println(listOfSys_id.get(0));
}
}
