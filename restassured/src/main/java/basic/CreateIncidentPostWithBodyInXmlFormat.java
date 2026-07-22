
package basic;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class CreateIncidentPostWithBodyInXmlFormat {
	
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
			.accept(ContentType.XML)
			.post();	
			
		System.out.println("Response status code: " + response.getStatusCode());
	    System.out.println("Response.contentType: " + response.getContentType());
	    //response.prettyPrint();
	    //convert response to xml format
	    XmlPath xmlPath=response.xmlPath();
	    //get Sys id
	   List<String> listShort_description=xmlPath.getList("response.result.short_description");
	    System.out.println(listShort_description.get(0));
	    
	}

}
