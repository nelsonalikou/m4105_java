/**
 *
 */
package shapes;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public abstract class Shape {

	/**
	 * Caractère de dessin de la figure
	 */
	private char pen = '#';

	/**
	 * Methode de remplissage :
	 * false - desssin uniquement du contour
	 * true - dessin du contour et remplissage de l'interieur
	 */
	private boolean filled = false;


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
	 * Retourne le mode de remplissage de la figure lors du dessin.
	 * @return boolean designant l'état de remplissage
	 */
	public boolean isFilled() {
		return this.filled;
	}

	/**
	 * Change le mode de remplissage de la figure lors du dessin.
	 * @param filled nouveau mode de remplissage du triangle
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * Dessin de la figure avec le mode de remplissage défini.
	 */
	//public abstract void draw();

	/**
	 * Calcul du périmètre de la figure
	 * @return le prérimètre de la figure
	 */
	public abstract double getPerimeter();

	/**
	 * Calcul de la surface de la figure
	 * @return la surface de la figure
	 */
	public abstract double getSurface();


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Shape sh = new Shape();
		//sh.draw();
		/*Shape sh1 = new Triangle(10);
		sh1.draw();
		Shape sh2 = new Rectangle(8,12);
		sh2.draw();
		Shape sh3 = new Square(7);
		sh3.draw();*/
	}


}
