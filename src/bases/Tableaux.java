/**
 *
 */
package bases;

import java.util.Arrays;

/**
 * @author Nelson
 *
 */
public class Tableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] chaine = {"abc", "aabc", "aaA", "a2", "xyz"};
		for(int cpt=0; cpt< chaine.length; cpt++){
			System.out.print(chaine[cpt] + " ");
		}
		System.out.println();
		System.out.println("le nombre de caractères différents est " + variete(chaine[0]));
		int[] tabNbCharDifferents = histogrammeDesVarietes(chaine);

		for(int cpt=0; cpt< tabNbCharDifferents.length; cpt++){
			System.out.print(tabNbCharDifferents[cpt] + " ");
		}
		System.out.println();

		afficherHistogramme(tabNbCharDifferents);
	}

	/**
	 * Evalue le nombre de caractères différents dans la chane passsée en paramètre sans tenir compte de la casse.
	 * @param chaine à évaluer
	 * @return le nombre de caractères différents de la chaine.
	 */
	public static int variete(String chaine){
		chaine =  chaine.toLowerCase();
		// false initialisation par défaut
		boolean[] tabCar = new boolean['z' - 'a' + 1];
		//int nbElementsDifferents = 0;

		//pour chacun des éléments de la chaine
			/*for(int i = 0; i < chaine.length(); i++){
			//je met a case du caractère correspondant à true
				if(Character.isAlphabetic(chaine.charAt(i))){
					tabCar[chaine.charAt(i) - 'a'] = true;
				}
			}*/

			for(char c : chaine.toLowerCase().toCharArray()){
				if(Character.isLetter(c)){
					tabCar[c - 'a'] = true;

				}
			}

			int nbCharDifferents = 0;
			for(boolean val : tabCar){
				if(val){
					nbCharDifferents++;

				}
			}
		return nbCharDifferents;
	}

	/**
	 * Evalue le nombre d'occurance pour chaque caratère et retourne le tableau contenant ces derniers.
	 * @param chaine chaine à évaluer
	 * @return tableau contenant l'histogramme des variétes
	 */
	public static int[] histogrammeDesVarietes(String[] chaine){
		//pour stocker les valeurs des variétés trouvées
		int[] tabNbCharDifferents = new int[chaine.length];


		/*
		// Autre possibilité

		//tabeau de variétés pour chaque chaine de caractères de 'chaine'
		int[] tableau_des_varietes = Arrays.stream(chaine).mapToInt(e -> variete(e)).toArray();
		//recherche de la plus grande variété.
		int max = Arrays.stream(tableau_des_varietes).max().getAsInt();
		 */

		//calacul des variétés et mémorisation de la plus grande variété
		int max = Integer.MIN_VALUE;
			for(int i = 0; i < chaine.length; i++){
				tabNbCharDifferents[i] = variete(chaine[i]) ;
				if(tabNbCharDifferents[i] > max){
					max = tabNbCharDifferents[i];
				}

			}

			//création du tableau de l'histogramme avec la bonne dimension
			// Rq : +1 dans la dimension pour gérer la valeur 0
			// Rq : le tableau est initialisé par défaut à 0
			int[] res =  new int[max + 1];
			for(int val : tabNbCharDifferents){
				res[val]++;
			}

		return res;
	}


	/**
	 * Affichage de l'histogramme des valeurs
	 * @param valeurs
	 */
	public static void afficherHistogramme(int valeurs[]) {
		int hauteur_max = Arrays.stream(valeurs).max().getAsInt();
		int variete_max = valeurs.length;

		//Pour chaque nombre d'occurences d'une varieté, du plus grand à 0 exclu
		for(int no_occurence = hauteur_max; no_occurence > 0; no_occurence--){
			//Pour chaque valeur de variété de 0 à la plus garnde
			for(int valeur_variete = 0; valeur_variete < variete_max; valeur_variete++){
				//si la valeur est supérieure ou égale au nombre d'occurences pour cette ligne
				//  //afficher "XX" //sinon // afficher " "
				//Afficher " "
				System.out.print(valeurs[valeur_variete] >= no_occurence ? "XX " : "   ");
			}
			//Aller à la ligne
			System.out.println();
		}

		//Pour chaque valeur de variete de 0 à la plus grande
		for(int valeur_variete = 0; valeur_variete < variete_max; valeur_variete++){
			//Afficher sa valeur
			System.out.print(String.format("%2d ", valeur_variete));
		}
		System.out.println();
	}

}
