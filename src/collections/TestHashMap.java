/**
 *
 */
package collections;

import java.util.HashMap;

import shapes.*;

/**
 * @author ALIKOU DONGMO NELSON
 *
 */
public class TestHashMap {

	public static void main(String [] args) {
		HashMap<String,Shape> map = new HashMap<>();

		map.put("rectangle",  new Rectangle(8, 2));
		map.put("triangle", new Triangle(6));
		map.put("carré",  new Square(4));

		System.out.println("Map :              " + map);
		System.out.println("Taille :           " + map.size());

		System.out.println("Elément pour rectangle :" + map.get("rectangle"));
		System.out.println("Elément pour triangle :" + map.get("triangle"));

		for (String key : map.keySet())
			System.out.println("Clé : " + key);

		for (Shape shape : map.values())
			System.out.println("Valeur : " + shape);

		map.remove("rectangle");
		System.out.println("Elément pour bleu :" + map.get("rectangle"));

	}

}
