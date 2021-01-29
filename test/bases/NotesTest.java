package bases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotesTest {

	private double[] tabNotes = {10.5, 15.02, 14.23, 03.21, 4.2,19.5, 20,11.6, 14.5, 16};

	@Test
	public void test_genererTableauDeNotes() {
		assertEquals(10, Notes.genererTableauDeNotes(10).length);
	}

	@Test
	public void test_nombresDeNotesSuperieuresA() {
		assertEquals(8, Notes.nombresDeNotesSuperieuresA(tabNotes,10));
	}

	@Test
	public void test_minimum() {
		assertEquals(03.21, Notes.minimum(tabNotes),0.1);
	}
	@Test
	public void test_maximum() {
		assertEquals(20, Notes.maximum(tabNotes),0.1);
	}

	@Test
	public void test_moyenne() {
		assertEquals(12.876, Notes.moyenne(tabNotes),0.1);
	}

}
