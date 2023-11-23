package collect;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {

		LocalDateTime dateTime 
		= LocalDateTime.now();
		
		DateTimeFormatter formatter 
		= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		System.out.println(dateTime.format(formatter));
		
	}

}
