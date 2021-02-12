/**
 *
 */
package collections;

import java.util.LinkedList;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestLinkedList {

	public static void main(String [] args) {
		LinkedList<String> list = new LinkedList<>();

		System.out.println("Ajout de B :       " + list.add("B"));
		System.out.println("Ajout de A :       " + list.add("A"));
		System.out.println("Ajout de C :       " + list.add("C"));
		System.out.println("Ajout de A :       " + list.add("A"));

		System.out.println("Liste :            " + list);
		System.out.println("Taille :           " + list.size());

		System.out.println("Contient A :       " + list.contains("A"));
		System.out.println("Contient D :       " + list.contains("D"));

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("Suppression de A : " + list.remove("A"));
		System.out.println("Suppression de Z : " + list.remove("Z"));
	}

}
