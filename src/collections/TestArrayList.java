/**
 *
 */
package collections;

import java.util.ArrayList;

/**
 * @author bigbo
 *
 */
public class TestArrayList {

	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<>();

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



		System.out.println("Elément n°2 :      " + list.get(2));

		list.add(2, "X");System.out.println("Elément n°2 :      " + list.get(2));
		System.out.println("Elément n°3 :      " + list.get(3));

		System.out.println("Indice de X :      " + list.indexOf("X"));
		System.out.println("Indice de Z :      " + list.indexOf("Z"));

		list.set(2, "Y");
		list.remove(3);

		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println("Elément n°" + i + " :      " + list.get(i));
		}

	}

}
