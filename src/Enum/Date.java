/**
 *
 */
package Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Date {

	public java.util.Date defineDate(int day, int month) throws ParseException {
		java.util.Date naissance = new SimpleDateFormat("yyyy-MM-dd").parse("2021-" + month + "-" + day);
		return naissance;
	}

	public static void main(String[] args) {
		Date today = new Date();
		try {
			System.out.println(today.defineDate(9, 2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
