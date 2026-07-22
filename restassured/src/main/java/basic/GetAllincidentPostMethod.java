package basic;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllincidentPostMethod {

	@Test
	public void getAllInciden() {
		
RestAssured.baseURI =" ";
RestAssured.authentication= RestAssured.basic(" ", " ");
Response response = RestAssured
		.given()
		.contentType("ContentType.JSON")
	    .post();	
	
	System.out.println("Response status code: " + response.getStatusCode());
	System.out.println("Response Content Type: " + response.getContentType());
	response.prettyPrint();
	//convert response to json
	JsonPath jsonpath=response.jsonPath();
	String sys_id=jsonpath.get("result.sys_id");
	System.out.println("sys_id: " + sys_id);
	List<String> listofsys_id=jsonpath.getList("result_sys_id");
	System.out.println("List of sys_id: " + listofsys_id);
	
	


	
		
	}
}

