/**
 *
 */
package switchs;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class SwitchCase {

	String getDaysBeforeWeekEnd(int currentDay) {
		String res = "";
		switch ( currentDay ) {
			case 1 : res += "lundi, " ;
			case 2 : res += "mardi, " ;
			case 3 : res += "mercredi, " ;
			case 4 : res += "jeudi, " ;
			case 5 : res += "vendredi" ;
			break ;
			case 6 : case 7 : res = "C'est le week-end !" ;
			break ;
			default : res = "jour non valide !" ;
		}
	return res ;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwitchCase switchcase = new SwitchCase();
		System.out.println(switchcase.getDaysBeforeWeekEnd(3));

	}

}
