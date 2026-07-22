
package basic;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateIncidentPostWithBody {
	
	@Test
	public void createIncident() {
		
		RestAssured.baseURI =" ";
		RestAssured.authentication= RestAssured.basic(" ", " ");
		//Request type (use POST method +body)
		Response response = RestAssured
			.given()
			.contentType("application.JSON")
			.when()
			.body("{\"short_description\":\"post from postPostman\",\"category\" :\"Hardware\"}")	
			.accept(ContentType.JSON)
			.post();	
			
		System.out.println("Response status code: " + response.getStatusCode());
	    System.out.println("Response.contentType: " + response.getContentType());
	    //response.prettyPrint();
	    //convert response to json
	    JsonPath jsonpath=response.jsonPath();
	    //get Sys id
	    String sys_id=jsonpath.get("result.sys_id");
	    System.out.println("sys_id: " + sys_id);
	    
	}

}
