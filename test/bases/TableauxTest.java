package bases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TableauxTest {

	@Test
	public void variete_test() {
		assertEquals(4, Tableaux.variete("abcd"));
		assertEquals(3, Tableaux.variete("aabc"));
		assertEquals(1, Tableaux.variete("aaA"));
		assertEquals(1, Tableaux.variete("a2"));
	}

	@Test
	public void histogrammeDesVarietes_test() {
		String[] chaine = {"abc", "aabc", "aaA", "a2", "xyz"};
		int[] tabNbCharDifferents = {0, 2, 0, 3};
		assertEquals(tabNbCharDifferents[0], Tableaux.histogrammeDesVarietes(chaine)[0]);
		assertEquals(tabNbCharDifferents[1], Tableaux.histogrammeDesVarietes(chaine)[1]);
		assertEquals(tabNbCharDifferents[2], Tableaux.histogrammeDesVarietes(chaine)[2]);
		assertEquals(tabNbCharDifferents[3], Tableaux.histogrammeDesVarietes(chaine)[3]);
	}

}
