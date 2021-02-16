/**
 *
 */
package collections;

import java.util.HashSet;

import shapes.*;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestHashSet {

	public static void main(String [] args) {
		HashSet<Shape> set = new HashSet<>();

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
