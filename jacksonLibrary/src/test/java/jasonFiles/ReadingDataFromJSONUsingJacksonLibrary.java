package jasonFiles;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingDataFromJSONUsingJacksonLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		
		 File file= new File(".\\Data\\employee.json");
		 //Read the data from JSON file and convert it into Java Object
		 Person person=mapper.readValue(file, Person.class);
			 
		 //Access data
		 System.out.println("First Name: "+person.getFirstName());
		 System.out.println("Last Name: "+person.getLastName());
		 
		 for(Address address:person.getAddress())
			 		 {
			 System.out.println("Street: "+address.getStreet());
			 System.out.println("City: "+address.getCity());
			 System.out.println("State: "+address.getState());
			 System.out.println();
	}
	}
}

		 
		 
	