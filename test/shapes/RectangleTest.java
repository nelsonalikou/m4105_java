package shapes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	private Rectangle rectangle;
	@Before
	public void setUp() throws Exception {
		rectangle = new Rectangle(5,3);
	}

	@Test
	public void getPen_test() {
		assertEquals('#',rectangle.getPen());
	}

	@Test
	public void setPen_test() {
		rectangle.setPen('*');
		assertEquals('*',rectangle.getPen());
	}

	@Test
	public void getFilled_test() {
		assertFalse(rectangle.isFilled());
	}

	@Test
	public void setFilled_test() {
		rectangle.setFilled(true);
		assertTrue(rectangle.isFilled());
	}

}
