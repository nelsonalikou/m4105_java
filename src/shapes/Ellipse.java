package shapes;

public class Ellipse extends Shape{

	private double a, b;


	/**
	 * Constructeur d'un rectangle. vérifie si la largeur et la hauteur sont positives.
	 * @param a largeur du rectangle
	 * @param height hauteur du rectangle
	 * @throws IllegalArgumentException
	 */
	public Ellipse(double a, double b ) throws IllegalArgumentException{
		if(a < 0 || b < 0)
			throw new IllegalArgumentException("la largeur ou la hauteur est négative" + a + " " + b);
		this.a = a;
		this.b = b;
	}


	public static void main(String[] args) {
		Ellipse ellipse = new Ellipse(4,5);
		System.out.println(ellipse.getPerimeter());
		System.out.println(ellipse.getSurface());

	}

	@Override
	public void draw() {
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * Math.sqrt((a*a + b*b)/2);
	}

	@Override
	public double getSurface() {
		return Math.PI * a * b;
	}

}
