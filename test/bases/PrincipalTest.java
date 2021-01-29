package bases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrincipalTest {

	@Test
	public void maximum_test() {
		assertEquals(15, Principal.maximum(5, 15));
	}

	@Test
	public void masquerLettres_test() {
		assertEquals("****",Principal.masquerLettres("toto",'*'));
	}

	@Test
	public void estUnPalindrome_test() {
		assertFalse(Principal.estUnPalindrome("ttto"));
	}


	@Test
	public void recherche_test() {
		assertEquals(0,Principal.recherche("toto","to",true));
	}

	@Test
	public void remplacer_test() {
		assertEquals("tata",Principal.remplacer("toto", "o", "a"));
	}
}
