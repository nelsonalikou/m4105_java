/**
 *
 */
package shapes;

/**
 * @author bigbo
 **
 * Classe de crétion d'un cercle
 * @author ALIKOU DONGMO NELSON
 *
 */
public class Circle extends Ellipse{


	/**
	 * Rayon du cerlce
	 */
	private double r;
	/**
	 * Constructeur d'un cercle. vérifie si le rayon est positives.
	 * @param r rayon du cercle
	 * @throws IllegalArgumentException
	 */
	public Circle(double r) throws IllegalArgumentException {
		super(r, r);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}

	@Override
	public double getSurface() {
		return super.getSurface();
	}


	/**
	 * Retourne le caractère utilisé pour le dessin
	 * @return le caractère de dessin
	 */
	public char getPen() {
		return super.getPen();
	}

	/**
	 * Assigne le caractère défini en paramètre comme nouveau caractère de dessin.
	 * @param pen nouveau caractère de dessin
	 */
	public void  setPen(char pen) {
		super.setPen(pen);
	}

	/**
	 * Retourne le mode de remplissage du triangle lors du dessin.
	 * @return boolean designant l'état de remplissage
	 */
	public boolean isFilled() {
		return super.isFilled();
	}

	/**
	 * Change le mode de remplissage du rectangle lors du dessin.
	 * @param filled nouveau mode de remplissage du triangle
	 */
	public void setFilled(boolean filled) {
		super.setFilled(filled);
	}

	public static void main(String[] args) {
		Ellipse ellipse = new Circle(5);
		double surface = Math.round(ellipse.getSurface() * 100.0) / 100.0;
		System.out.println(ellipse.getPerimeter());
		//System.out.format("%.2f", ellipse.getPerimeter());
		System.out.println(surface);
		System.out.println(ellipse.getSurface());
	}

}

