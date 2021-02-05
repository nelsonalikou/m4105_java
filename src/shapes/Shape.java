/**
 *
 */
package shapes;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Shape {

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
	public void draw(){

	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape sh1 = new Triangle(10);
		sh1.draw();
		Shape sh2 = new Rectangle(8,12);
		sh2.draw();
		Shape sh3 = new Square(7);
		sh3.draw();

	}


}