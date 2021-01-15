package bases;

/**
 *
 * @author Nelson
 *
 */
public class Principal {

	/**
	 * Point d'entr�e dans le programme
	 * @param args la liste des maram�tres fournis au lancement du programme
	 */
	public static void main(String[] args) {
		String prenom = "Nelson";
		int longueurPrenom = prenom.length();
		System.out.print(prenom);
		System.out.print("("+longueurPrenom + " caracteres)");
		System.out.print("("+longueurPrenom + " caracteres)");
		System.out.println("("+longueurPrenom + " caracteres)");

		System.out.println("Le plus grand est "+maximum(5,15));
		System.out.println("Le masque est "+ masquerLettres("toto",'*'));
		System.out.println("le mot toto est il un palindrome ? "+ estUnPalindrome("ttto"));

	}

	/**
	 * Longueur de la chaine
	 * @param chaine Chaine � �valuer
	 * @return Sa longueur
	 */
	public static String longueurDeChaine(String chaine) {
		return chaine.length() + "caract�res";
	}

	/**
	 * Maximum de 2 entiers
	 * @param a premier entier
	 * @param b deuxi�me entier
	 * @return la valeur du plus grand des deux
	 */
	public static int maximum(int a, int b) {
		return a>b ? a : b;
	}

	/**
	 * Construction de la version cach�e d'une chaine de caract�res.
	 * @param lettre chaine de base
	 * @param masque caract�re de remplissage
	 * @return version cach�e de la chaine
	 */
	public static String masquerLettres(String lettre,char masque) {
		String lettresCachees = "";
		for(int i=0; i < lettre.length(); i++)
		{
			lettresCachees = lettresCachees + masque;
		}
		return lettresCachees;
	}

	/**
	 * La chaine est-t-elle un palindrome cad a a des carct�res sym�triques par raport � son centre.
	 * @param str
	 * @return
	 */
	public static boolean estUnPalindrome(String str) {
		boolean palindrome = true;
		int taille = str.length();
		int moitie = taille / 2;

		int cpt = 0;
		while (cpt < moitie && palindrome == true) {
			if( str.charAt(cpt) != str.charAt(taille - cpt - 1) ){
				System.out.println(str.charAt(cpt));
				System.out.println(str.charAt(taille - cpt - 1));
				palindrome = false;
			}
		}
		return palindrome;
	}

	/** Index de la 1er occurence de la chaine recherch�e dans la chaine source.
     *
     * @param chaineSource chaine source
     * @param chaineRecherche chaine recherch�e
     * @return indice si trouv�, -1 sinon
     */
	public static int recherche(String chaineSource, String chaineRecherche) {
		return 0;
	}
}
