/**
 *
 */
package shapes;

/**
 * @author bigbo
 *
 */
public class Circle extends Ellipse{


	/**
	 * Constructeur d'un cercle. vérifie si le rayon est positives.
	 * @param r rayon du cercle
	 * @throws IllegalArgumentException
	 */
	public Circle(double r) throws IllegalArgumentException {
		super(r, r);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return 0;
	}

}
