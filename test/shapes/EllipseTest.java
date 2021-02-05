package shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EllipseTest {

	private Ellipse ellipse;
	private Ellipse circle;

	@Before
	public void setUp() throws Exception {
		ellipse = new Ellipse(5,3);
		circle = new Circle(5);
	}

	@Test
	public void getPen_ellipse_test() {
		assertEquals('#',ellipse.getPen());
	}

	@Test
	public void setPen_ellipse_test() {
		ellipse.setPen('*');
		assertEquals('*',ellipse.getPen());
	}

	@Test
	public void getFilled_ellipse_test() {
		assertFalse(ellipse.isFilled());
	}

	@Test
	public void setFilled_ellipse_test() {
		ellipse.setFilled(true);
		assertTrue(ellipse.isFilled());
	}


	@Test
	public void getPen_circle_test() {
		assertEquals('#',circle.getPen());
	}

	@Test
	public void setPen_circle_test() {
		circle.setPen('*');
		assertEquals('*',circle.getPen());
	}

	@Test
	public void getFilled_circle_test() {
		assertFalse(circle.isFilled());
	}

	@Test
	public void setFilled_circle_test() {
		circle.setFilled(true);
		assertTrue(circle.isFilled());
	}

}
