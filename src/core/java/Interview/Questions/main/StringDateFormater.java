package core.java.Interview.Questions.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringDateFormater {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

		Date date6 = formatter6.parse("08-NOV-2018 11:46:32"); 
		
		System.out.println(date6);
		
		//String date = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").format("08-NOV-2018 11:46:32");
		
		 
		
//		System.out.println(date);
	}
}
