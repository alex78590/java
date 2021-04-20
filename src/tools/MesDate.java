package tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MesDate {
	
	
	public static String frToUs(String date) {
		Locale locale = Locale.US;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "dd-MMM-yyyy" ).withLocale ( locale );
		LocalDate localDate = LocalDate.parse ( date , formatter );
		return date;
	}
	
	public static void main(String[] args) {
		String date1 = "01/01/2021";
		MesDate date = new MesDate();
		String date2 = date.frToUs(date1);
		
		
		
	}

}
