/**
 *
 */
package bases;


/**
 * @author Nelson
 *
 */
public class Notes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int taille = 10;
		double[] tabNotes = genererTableauDeNotes(10);
		for(int cpt=0; cpt< taille; cpt++){
			System.out.print(tabNotes[cpt] + " ");
		}
		System.out.println();
		double note = 10.5;
		System.out.printf("Le nombre de notes supérieures à %f est %d", note, nombresDeNotesSuperieuresA(tabNotes,note));
		System.out.println("La plus petite valeur du tableau est " +  maximum(tabNotes));
		System.out.println("La plus grande valeur du tableau est " +  minimum(tabNotes));
		System.out.println("La moyenne des valeurs du tableau est " +  moyenne(tabNotes));
	}

	/**
	 * Permet de generer un tableau de notes comprises entre 0 et 20. la taille du tableau est passée en parmètre.
	 * @param taille la taille du tableau
	 * @return le tableau formé.
	 */
	public static double[] genererTableauDeNotes(int taille){
		double[] tabNotes = new double[taille];
		for(int cpt=0; cpt< taille; cpt++){
			tabNotes[cpt] = Math.random() * 20;
		}
		return tabNotes;
	}

	public static int nombresDeNotesSuperieuresA(double[] tabNotes, double note){
		int cpt = 0;
		for(int i=0; i< tabNotes.length; i++){
			if(tabNotes[i] > note){
				cpt++;
			}
		}
		return cpt;
	}

	/**
	 * Determine le minimum des notes contenues dans le tableau de notes passé en paramètre.
	 * @param tabNotes tableau contenant toutes les notes
	 * @return la plus petite des notes
	 */
	public static double minimum(double[] tabNotes){
		double minim = Double.MAX_VALUE;
		for(int i=0; i< tabNotes.length; i++){
			if(tabNotes[i] < minim){
				minim = tabNotes[i];
			}
		}
		return minim;
	}

	/**
	 * Determine le maximum des notes contenues dans le tableau de notes passé en paramètre.
	 * @param tabNotes tableau contenant toutes les notes
	 * @return la plus grande des notes
	 */
	public static double maximum(double[] tabNotes){
		double maxi = Double.MIN_VALUE;
		for(int i=0; i< tabNotes.length; i++){
			if(tabNotes[i] > maxi){
				maxi = tabNotes[i];
			}
		}
		return maxi;
	}


	/**
	 * Determine la moyenne des notes contenues dans le tableau de notes passé en paramètre.
	 * @param tabNotes tableau contenant toutes les notes
	 * @return la moyenne des notes
	 */
	public static double moyenne(double[] tabNotes){
		double moyenne = 0;
		for(int i=0; i< tabNotes.length; i++){
				moyenne += tabNotes[i];
		}
		moyenne = moyenne  / tabNotes.length;
		return moyenne;
	}

}
