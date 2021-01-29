package bases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableauxTest {

	@Test
	public void variete_test() {
		assertEquals(4, Tableaux.variete("abcd"));
		assertEquals(3, Tableaux.variete("aabc"));
		assertEquals(1, Tableaux.variete("aaA"));
		assertEquals(2, Tableaux.variete("a2"));
	}

}
