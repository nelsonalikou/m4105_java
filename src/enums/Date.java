/**
 *
 */
package enums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Date {

	/*public java.util.Date defineDate(int day, int month) throws ParseException {
		java.util.Date naissance = new SimpleDateFormat("yyyy-MM-dd").parse("2021-" + month + "-" + day);
		return naissance;
	}*/

	public LocalDate defineDate(Day day, Month month) throws ParseException {
		LocalDate naissance = LocalDate.of(1976, month.ordinal() + 1, day.ordinal() + 1);
		return naissance;
	}

	public static void main(String[] args) {
		Date today = new Date();
		try {
			System.out.println(today.defineDate(Day.TUESDAY , Month.FEBRUARY));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
