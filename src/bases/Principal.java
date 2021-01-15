package bases;

/**
 *
 * @author Nelson
 *
 */
public class Principal {

	/**
	 * Point d'entrée dans le programme
	 * @param args la liste des maramètres fournis au lancement du programme
	 */
	public static void main(String[] args) {
		String prenom = "Nelson";
		int longueurPrenom = prenom.length();
		System.out.print(prenom);
		System.out.print("("+longueurPrenom+" caracteres)");
		System.out.print("("+longueurPrenom+" caracteres)");
		System.out.println("("+longueurPrenom+" caracteres)");

		System.out.println("Le plus grand est"+maximum(5,15));
		System.out.println("Le masque est "+ masquerLettres("toto","*"));
	}

	/**
	 * Longueur de la chaine
	 * @param chaine Chaine à évaluer
	 * @return Sa longueur
	 */
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + "caractères";
	}

	/**
	 * Maximum de 2 entiers
	 * @param a premier entier
	 * @param b deuxième entier
	 * @return la valeur du plus grand des deux
	 */
	public static int maximum(int a, int b) {
		return a>b ? a : b;
	}

	/**
	 * Construction de la version cachée d'une chaine de caractères.
	 * @param lettre chaine de base
	 * @param masque caractère de remplissage
	 * @return version cachée de la chaine
	 */
	public static String masquerLettres(String lettre,String masque) {
		String lettresCachees = "";
		for(int i=0; i < lettre.length(); i++)
		{
			lettresCachees = lettresCachees + masque;
		}
		return lettresCachees;
	}
}
