package shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private Triangle triangle;
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(5);
	}

	@Test
	public void getPen_test() {
		assertEquals('#',triangle.getPen());
	}

	@Test
	public void setPen_test() {
		triangle.setPen('*');
		assertEquals('*',triangle.getPen());
	}

	@Test
	public void getFilled_test() {
		assertFalse(triangle.isFilled());
	}

	@Test
	public void setFilled_test() {
		triangle.setFilled(true);
		assertTrue(triangle.isFilled());
	}

}
