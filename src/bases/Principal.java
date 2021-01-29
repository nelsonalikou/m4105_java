package bases;

/**
 *
 * @author Nelson
 *
 */
public class Principal {

	/**
	 * Point d'entrée dans le programme
	 *
	 * @param args
	 *            la liste des maramètres fournis au lancement du programme
	 */
	public static void main(String[] args) {
		String prenom = "Nelson";
		int longueurPrenom = prenom.length();
		System.out.print(prenom);
		System.out.print("(" + longueurPrenom + " caracteres)");
		System.out.print("(" + longueurPrenom + " caracteres)");
		System.out.println("(" + longueurPrenom + " caracteres)");

		System.out.println("Le plus grand est " + maximum(5, 15));
		System.out.println("Le masque est " + masquerLettres("toto", '*'));
		System.out.println("le mot toto est il un palindrome ? " + estUnPalindrome("otto"));
		System.out.println("la sous chaine 'to' se trouve le mot 'toto' à l'indice " + recherche("toto", "to", true));
		System.out.println("la sous chaine 'to' se trouve le mot 'toto' à l'indice " + remplacer("toto", "o", "a"));

	}

	/**
	 * Longueur de la chaine
	 *
	 * @param chaine
	 *            Chaine à évaluer
	 * @return Sa longueur
	 */
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + "caractères";
	}

	/**
	 * Maximum de 2 entiers
	 *
	 * @param a
	 *            premier entier
	 * @param b
	 *            deuxième entier
	 * @return la valeur du plus grand des deux
	 */
	public static int maximum(int a, int b) {
		return a > b ? a : b;
	}

	/**
	 * Construction de la version cachée d'une chaine de caractères.
	 *
	 * @param lettre
	 *            chaine de base
	 * @param masque
	 *            caractère de remplissage
	 * @return version cachée de la chaine
	 */
	public static String masquerLettres(String lettre, char masque) {
		String lettresCachees = "";
		for (int i = 0; i < lettre.length(); i++) {
			lettresCachees = lettresCachees + masque;
		}
		return lettresCachees;
	}

	/**
	 * La chaine est-t-elle un palindrome cad a a des carctères symétriques par
	 * raport à son centre.
	 *
	 * @param str
	 *            Chaine à vérifier
	 * @return booléan disant si la chaine est un palindrome ou pas
	 */
	public static boolean estUnPalindrome(String str) {
		str = str.toLowerCase();
		boolean palindrome = true;
		int taille = str.length();
		int moitie = taille / 2;

		int cpt = 0;
		while (cpt < moitie && palindrome == true) {
			if (str.charAt(cpt) != str.charAt(taille - cpt - 1)) {
				palindrome = false;
			}
			cpt++;
		}
		return palindrome;
	}

	/**
	 * Index de la 1ere occurence de la chaine recherchée dans la chaine source.
	 *
	 * @param chaineSource
	 *            chaine source
	 * @param chaineRecherche
	 *            chaine recherchée
	 * @return indice si trouvé, -1 sinon
	 */
	public static int recherche(String chaineSource, String chaineRecherche, boolean priseEnCompteCasse) {
		if (!priseEnCompteCasse) {
			chaineSource = chaineSource.toLowerCase();
			chaineRecherche = chaineRecherche.toLowerCase();
		}

		int indiceRecherche = 0;
		int res = 0;
		for (int indiceSource = 0; indiceSource < chaineSource.length(); indiceSource++) {
			if (chaineSource.charAt(indiceSource) == chaineRecherche.charAt(indiceRecherche)) {
				if (indiceRecherche == 0) {
					res = indiceSource;
				} else if (indiceRecherche == chaineRecherche.length() - 1) {
					return res;
				}
				if (indiceRecherche < chaineRecherche.length() - 1) {
					indiceRecherche++;
				}
			} else {
				indiceRecherche = 0;
			}
		}
		//return source.indexOf(chaine);
		return -1;
	}

	/**
	 * Nouvelle chaine où dans 'source', toutes les occurences de 'chaine' sont
	 * remplacées par 'remplacement'
	 *
	 * @param source
	 *            Chaîne à traiter
	 * @param chaine
	 *            Chaîne recherchée
	 * @param remplacement
	 *            Chaîne de remplacement
	 * @return La nouvelle chaîne
	 */
	public static String remplacer(String source, String chaine, String remplacement) {
		String res = "";
		// On parcourt toute la source
		int pos_source = 0;
		while (pos_source < source.length()) {
			// On recherche la présence de la chaine à partir de la position
			// dans la source
			int avance = 0;
			while ((avance < chaine.length()) && (pos_source + avance < source.length())
					&& (chaine.charAt(avance) == source.charAt(pos_source + avance))) {
				avance++;
			}
			// Si l'on trouve la chaine
			if (avance == chaine.length()) {
				// On ajoute remplacement à la fin du resultat
				res += remplacement;
				// On avance dans source
				pos_source += chaine.length();
			}
			// Sinon
			else {
				// On recopie le caractère de la source
				res += source.charAt(pos_source);
				pos_source++;
			}
		}

		//return source.replace(chaine, remplacement);

		return res;
	}
}
