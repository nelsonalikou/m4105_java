/**
 *
 */
package shapes;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Triangle{

	/**
	 * Taille du triangle
	 */
	private int size;

	/**
	 * Caractère de dessin du triangle
	 */
	private char pen = '#';

	/**
	 * Methode de remplissage :
	 * false - desssin uniquement du contour
	 * true - dessin du contour et remplissage de l'interieur
	 */
	private boolean filled = false;

	/**
	 * Constructeur de la classe Triangle, vérifie si la taille est positive.
	 * @param size taille du rectangle
	 * @throws IllegalArgumentException
	 */
	public Triangle(int size) throws IllegalArgumentException{
		if(size < 0)
			throw new IllegalArgumentException("la hauteur est négative" + size);
		this.size = size;
	}

	/**
	 * Retourne le caractère utilisé pour le dessin
	 * @return le caractère de dessin
	 */
	public char getPen() {
		return this.pen;
	}

	/**
	 * Assigne le caractère défini en paramètre comme nouveau caractère de dessin.
	 * @param pen nouveau caractère de dessin
	 */
	public void  setPen(char pen) {
		this.pen = pen;
	}

	/**
	 * Retourne le mode de remplissage du triangle lors du dessin.
	 * @return boolean designant l'état de remplissage
	 */
	public boolean isFilled() {
		return this.filled;
	}

	/**
	 * Change le mode de remplissage du rectangle lors du dessin.
	 * @param filled nouveau mode de remplissage du triangle
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	/**
	 * Dessin du triangle avec le mode de remplissage défini.
	 */
	public void draw() {
		String draw = "";

		//pour chaque point de hauteur
		for(int hauteur = 0; hauteur < this.size; hauteur++) {
			//pour chaque point de largeur
			for(int largeur = 0; largeur < hauteur; largeur++) {
				//Si le mode de remplissage est sur plein on dessine juste le caractère, sinon il faut verifier si on est au défut ou à la fin du triangle ou à la première et dernière colonne à l'interieur du triangle et là on dessine le caractère (autrement on dessine un espace)
				if(this.filled){
					draw += this.pen;
				}else{
					if((hauteur == 0 || hauteur == this.size-1) ){
						draw += this.pen;
					}else{
						if(largeur == 0 || largeur == hauteur-1){
							draw += this.pen;
						}else{
							draw += " ";
						}
					}
				}

			}
			//retour à la ligne
			draw += "\n";
		}
	System.out.println(draw);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle(7);
		triangle.draw();
		triangle.setPen('*');
		triangle.setFilled(true);
		System.out.println();
		triangle.draw();

	}

}
