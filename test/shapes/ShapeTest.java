package shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeTest {

	private Shape shape;
	@Before
	public void setUp() throws Exception {
		shape = new Rectangle(5,3);
	}

	@Test
	public void getPen_test() {
		assertEquals('#',shape.getPen());
	}

	@Test
	public void setPen_test() {
		shape.setPen('*');
		assertEquals('*',shape.getPen());
	}

	@Test
	public void getFilled_test() {
		assertFalse(shape.isFilled());
	}

	@Test
	public void setFilled_test() {
		shape.setFilled(true);
		assertTrue(shape.isFilled());
	}

}
