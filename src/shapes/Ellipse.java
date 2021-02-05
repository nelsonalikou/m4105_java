package shapes;

public class Ellipse extends Shape{

	private double a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSurface() {
		return Math.PI * a * b;
	}

}
