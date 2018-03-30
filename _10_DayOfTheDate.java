package programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _10_DayOfTheDate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();
		String date = month+day+year;
		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
		Date d = null;
		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
		String dayOfDate = sdf2.format(d);
		System.out.println(dayOfDate.toUpperCase());
	}

}
