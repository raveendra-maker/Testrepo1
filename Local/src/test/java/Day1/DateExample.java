package Day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(" Current date and Time:" +formatter.format(date));
		
		

	}
	}
