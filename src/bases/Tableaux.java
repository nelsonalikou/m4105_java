/**
 *
 */
package bases;

/**
 * @author Nelson
 *
 */
public class Tableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * Evalue le nombre de caractères différents dans la chane passsée en paramètre sans tenir compte de la casse.
	 * @param chaine à évaluer
	 * @return le nombre de caractères différents de la chaine.
	 */
	public static int variete(String chaine){
		chaine =  chaine.toLowerCase();
		// false initialisation par défaut
		boolean[] tabCar = new boolean[26];
		int nbElementsDifferents = 0;
		//pour chacun des éléments de la chaine
			for(int i = 0; i < chaine.length(); i++){
			//je met a case du caractère correspondant à true
				tabCar[chaine.charAt(i) - 'a'] = true;
			}

			int nbCarDifferents = 0;
			for(boolean val : tabCar){
				if(val){
					nbCarDifferents++;

				}
			}
		return nbCarDifferents;
	}

}
