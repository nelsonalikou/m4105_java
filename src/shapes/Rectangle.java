/**
 *
 */
package shapes;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Rectangle {

	/**
	 * Largeur et hauteur du rectangle
	 */
	private int width, height;

	/**
	 * Caractère de dessin du rectangle
	 */
	private char pen = '#';

	/**
	 * Methode de remplissage :
	 * false - desssin uniquement du contour
	 * true - dessin du contour et remplissage de l'interieur
	 */
	private boolean filled = false;


	/**
	 * Constructeur d'un rectangle. vérifie si la largeur et la hauteur sont positives.
	 * @param width largeur du rectangle
	 * @param height hauteur du rectangle
	 * @throws IllegalArgumentException
	 */
	public Rectangle(int width, int height) throws IllegalArgumentException{
		if(width < 0 || height < 0)
			throw new IllegalArgumentException("la largeur ou la hauteur est négative" + width + " " + height);
		this.width = width;
		this.height = height;
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
	public void setPen(char pen) {
		this.pen = pen;
	}

	/**
	 * Retourne le mode de remplissage du rectangle lors du dessin.
	 * @return boolean designant l'état de remplissage
	 */
	public boolean isFilled() {
		return this.filled;
	}

	/**
	 * Change le mode de remplissage du rectangle lors du dessin.
	 * @param filled nouveau mode de remplissage du rectangle
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * Dessin du rectangle avec le mode de remplissage défini.
	 */
	public void draw() {
		String draw = "";

			//pour chaque point de hauteur
			for(int hauteur = 0; hauteur < this.height; hauteur++) {
				//pour chaque point de largeur
				for(int largeur = 0; largeur < this.width; largeur++) {
					//Si le mode de remplissage est sur plein on dessine juste le caractère, sinon il faut verifier si on est au défut ou à la fin du rectangle ou à la première et dernière colonne à l'interieur du rectangle et là on dessine le caractère (autrement on dessine un espace)
					if(this.filled){
						draw += this.pen;
					}else{
						if((hauteur == 0 || hauteur == this.height-1) ){
							draw += this.pen;
						}else{
							if(largeur == 0 || largeur == this.width-1){
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
		Rectangle rectangle = new Rectangle(5,3);
		rectangle.draw();
		rectangle.setPen('*');
		rectangle.setFilled(true);
		System.out.println();
		rectangle.draw();
	}

}
