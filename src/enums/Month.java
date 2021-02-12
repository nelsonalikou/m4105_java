package enums;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public enum Month {

	JANUARY,FEBRUARY, MARCH, APRIL, MAY, JUNY, JULLY,AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER ;

	private Month() { }

	public static void main(String[] args) {
		for (Month d : Month.values()) {System.out.println(d + ", name = " + d.name()+ ", ordinal = " + d.ordinal()) ;}
	}
}
