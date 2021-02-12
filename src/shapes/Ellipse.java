package shapes;

/**
 *
 * @author ALIKOU DONGMO NELSON
 * Classe de création d'une ellipse.
 */
public class Ellipse extends Shape implements Drawable{

	/**
	 * le grand axe et le petit axe de notre ellipse
	 */
	private double a, b;

	/**
	 * Constructeur d'une Ellipse. vérifie si le demi axe vertical et le demi axe horizontal sont positives.
	 * @param a demi axe vertical
	 * @param b demi axe horizontal
	 * @throws IllegalArgumentException
	 */
	public Ellipse(double a, double b ) throws IllegalArgumentException{
		if(a < 0 || b < 0)
			throw new IllegalArgumentException("la largeur ou la hauteur est négative" + a + " " + b);
		this.a = a;
		this.b = b;
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
		Ellipse ellipse = new Ellipse(4,5);
		System.out.println(ellipse.getPerimeter());
		System.out.println(ellipse.getSurface());

		//methode d'affichage
		Drawable e = new Ellipse(7,5);
		e.draw();
	}

	@Override
	public void draw() {
	}

	@Override
	public double getPerimeter() {
		return Math.round(2 * Math.PI * Math.sqrt((a*a + b*b)/2) * 100.0) / 100.0;
	}

	@Override
	public double getSurface() {
		//formule pi * demi axe vertical * demi axe horizontal
		return Math.round(Math.PI * a * b * 100.0) / 100.0 ;
	}



}



/**
 * Classe de crétion d'un cercle
 * @author ALIKOU DONGMO NELSON
 *
 */
class Circle extends Ellipse{


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
