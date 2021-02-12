/**
 *
 */
package enums;


/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public enum Day {

	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY, SATURDAY,SUNDAY ;

	private Day() { }

	public static void main(String[] args) {
		for (Day d : Day.values()) {System.out.println(d + ", name = " + d.name()+ ", ordinal = " + d.ordinal()) ;}
	}
}
