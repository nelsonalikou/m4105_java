/**
 *
 */
package collections;

import java.util.TreeSet;

import shapes.*;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestTreeSet {

	public static void main(String [] args) {

		TreeSet<Shape> set = new TreeSet<>();

		// Problème lié au positionnement dans la collection, la classe cherche à comparer les Shapes avant de les insérer dans la collection et effectue un cast pour celà mais n'y arrive pas


		//pour resoudre le problème elles doivent implémenter l'interface Comparable

		//Pour la comparaison je regarde la surface de la figure.
		
		Rectangle AA = new Rectangle(8, 2);
		Triangle  BB = new Triangle(6);
		Square    CC = new Square(4);
		Ellipse   DD = new Ellipse(5, 3);

		System.out.println("Ajout de AA :       " + set.add(AA));
		System.out.println("Ajout de BB :       " + set.add(BB));
		System.out.println("Ajout de CC :       " + set.add(CC));
		System.out.println("Ajout de DD :       " + set.add(DD));

		for (Shape s : set) {
			System.out.println(s.toString());
		}

		System.out.println("Suppression de AA : " + set.remove(AA));
		System.out.println("Suppression de DD : " + set.remove(DD));
	}
}