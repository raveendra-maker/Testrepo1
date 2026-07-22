package basic;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateIncidentPostWithoutBody {
	
	@Test
	public void createIncident() {
		
		RestAssured.baseURI =" ";
		RestAssured.authentication= RestAssured.basic(" ", " ");
		Response response = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.post();
			
		System.out.println("Response status code: " + response.getStatusCode());
	    System.out.println("Response.contentType: " + response.getContentType());
	    //response.prettyPrint();
	    //convert response to json
	    JsonPath jsonPath=response.jsonPath();
	    //GET sys_id
	    String sys_id = jsonPath.get("result.sys_id");
	    System.out.println("sys_id: " + sys_id);	
	    
	}		

}
